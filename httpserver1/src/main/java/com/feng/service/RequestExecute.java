package com.feng.service;

import com.feng.date.Data;

import java.io.*;
import java.net.Socket;
/**
 * 请求处理线程类
 * */
public class RequestExecute extends Thread{
    private Socket socket;

    public RequestExecute(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        InputStream in = null;
        InputStreamReader reader= null; //转换流
        BufferedReader bufferedReader= null;

        //声明输出流 输出流是指向客服端的
        OutputStream out=null;
        PrintWriter pw =null;
        try {
            out = socket.getOutputStream();
            pw = new PrintWriter(out);

            in=socket.getInputStream();
            reader=new InputStreamReader(in);
            bufferedReader=new BufferedReader(reader);
            //循环的字符流中获取字符
            String line = null;
            int lineNum = 1;
            //储存路径
            String reqPath = "";
            String host = "";
            while ((line =bufferedReader.readLine())!=null) {
                System.out.println(line);
                //解析请求行
                if (lineNum == 1) {
                    String[] infos = line.split("");
                    if (infos != null || infos.length > 2) {
                        reqPath = infos[1]; //请求路径
                    } else {
                        throw new RuntimeException("请求解析失败:" + line);
                    }
                } else {
                    //解析其他行，取出Host的内容
                    String[] infos = line.split(":");
                    if (infos != null || infos.length == 2) {
                        //取出host
                        if (infos[0].equals("Host"))
                            host = infos[1];
                    }
                }
                lineNum++;
                if (line.equals(""))    //Http请求是长连接，无法读取到文件的末尾
                    break;
            }
                //输出请求信息
                if (!reqPath.equals("")){
                    System.out.println("处理请求:http://" + host + reqPath);
                    //根据请求响应客服端 直接响应一个欢迎页面
                    if (reqPath.equals("/")){//没有资源的名称
                        pw.println("HTTP/1.1 200 OK");//输出响应行
                        pw.println("Content-Type:text/html;charset=utf-8");
                        //输出空行
                        pw.println("");//表示响应头结束，开始响应内容
                        pw.write("<h2>欢迎访问Mini-Server1.0</h2>");
                        pw.flush();
                        System.out.println("响应欢迎页面！");
                    } else{
                        //查找对应的资源  取出后缀
                        String ext = reqPath.substring(reqPath.lastIndexOf(".") + 1);
                        reqPath =reqPath.substring(1);//去除前面的"/"
                        //判断是否在根目录还是子目录
                        if (reqPath.contains("/")){  //子目录
                            //判断文件是否存在
                            File file = new File(Data.resourcePath + reqPath);
                            if (file.exists() && file.isFile()){
                                response200(out,file.getAbsolutePath(),ext);
                            } else {
                                response404(out);
                            }
                        }else {//根目录
                            //判断这个资源是否存在  判断根目录下所有的名称
                            File root = new File(Data.resourcePath);
                            if (root.isDirectory()){
                                File[] list = root.listFiles();
                                boolean isExist=false;//标记访问的资源是否存在
                                for (File file : list) {
                                    if (file.isFile()&& file.getName().equals(reqPath)){
                                        //文件存在
                                        isExist =true;
                                        break;
                                    }
                                }
                                if (isExist){ //文件存在
                                    response200(out,Data.resourcePath+reqPath,ext);
                                }else {
                                    response404(out);
                                }
                            }else{
                                throw new RuntimeException("静态资源目录不存在:"+Data.resourcePath);
                            }
                        }

                    }
                }

        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }finally {
            try {
                if (in!=null)
                    in.close();
                if (reader!=null)
                    reader.close();
                if (bufferedReader!=null)
                    bufferedReader.close();
                if (pw!=null)
                    pw.close();
                if (out!=null)
                    out.close();
            }catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
/**
 * 将指定的文件输出到输出流中
 * */
    private void response200(OutputStream out,String filePath,String ext){
        PrintWriter pw =null;
        //读入磁盘的文件
        InputStream in=null;
        InputStreamReader reader=null;
        BufferedReader bufferedReader = null;
        try {

            if (ext.equals("jpg") ||ext.equals("png")||ext.equals("jif")){
                out.write("HTTP/1.1 200 OK\r\n".getBytes());//输出响应行
                if (ext.equals("jpg"))
                out.write("Content-Type:image/jpg\r\n".getBytes());
                else if (ext.equals("png"))
                    out.write("Content-Type:image/png\r\n".getBytes());
                else if (ext.equals("gif"))
                    out.write("Content-Type:image/gif\r\n".getBytes());
                //输出空行
                out.write("\r\n".getBytes());
                //利用自己而输入流读取文件内容，并且输出到输入流
                in = new FileInputStream(filePath);
                int len =-1;
                byte[] buff = new byte[1024];
                while ((len =in.read(buff))!=-1){
                    out.write(buff,0,len);
                    out.flush();
                }
            } else if (ext.equals("html")||ext.equals("js")||ext.equals("css")||ext.equals("json")){
                pw=new PrintWriter(out);
                pw.println("HTTP/1.1 200 OK");//输出响应行
                if (ext.equals("html"))
                    out.write("Content-Type:text/html;charset=utf-8\r\n".getBytes());
                else if (ext.equals("js"))
                    out.write("Content-Type:application/x-javascript\r\n".getBytes());
                else if (ext.equals("css"))
                    out.write("Content-Type:text/css\r\n".getBytes());
                else if (ext.equals("json"))
                    out.write("Content-Type:application/json;charset=utf-8\r\n".getBytes());
                //输出空行表示响应结束
                //初始化输入流
                in =new FileInputStream(filePath);
                reader=new InputStreamReader(in);
                bufferedReader=new BufferedReader(reader);
                String line=null;
                while ((line = bufferedReader.readLine())!=null){
                    pw.println(line);
                    pw.flush();
                }
            } else {
                response404(out);
            }
            pw.println("Content-Type:text/html;charset=utf-8");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
/**
 * 响应404页面
 * */
    private void response404(OutputStream out){
        PrintWriter pw =null;
        try {
            pw=new PrintWriter(out);
            pw.println("HTTP/1.1 404");//输出响应行
            pw.println("Content-Type:text/html;charset=utf-8");
            //输出空行
            pw.println("");//表示响应头结束，开始响应内容
            pw.write("<h2>欢迎访问Mini-Server1.0</h2>");
            pw.write("<h2>您找的资源丢跑了！</h2>");
            pw.flush();
            System.out.println("响应欢迎页面！");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (pw!=null)
                pw.close();
            }catch (Exception ex){
                ex.printStackTrace();
            }

        }
    }
}
