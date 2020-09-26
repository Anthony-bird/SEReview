package com.feng.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainFrame extends JFrame {
    //要使用的组件声明
    private JLabel labPort;
    private JLabel labInfo;
    private JLabel labPath;
    private JTextField textPort;
    private JTextField textPath;
    private JButton btnStartServer;
    private JButton btnPushServer;
    private JButton btnStopServer;
    private JButton btnSetPath;
    private JPanel contentPanel;

    private JScrollPane scrollPane;
    private JTextArea textArea;

    public MainFrame(){
        init();
    }

    private void init() {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(200,200,800,500);
        this.setTitle("白帽子http服务器");
        this.setResizable(false);
        //设置主界面
        contentPanel = new JPanel();
        contentPanel.setLayout(null);
        this.setContentPane(contentPanel);
        //端口设置
        labPort = new JLabel("监听的端口号:");
        labPort.setBounds(15,10,100,25);
        contentPanel.add(labPort);

        textPort = new JTextField("8088");
        textPort.setBounds(120,10,150,25);
        contentPanel.add(textPort);

        //三个按钮
        btnStartServer = new JButton("启动服务");
        btnStartServer.setBounds(300,10,120,25);
        contentPanel.add(btnStartServer);

        btnPushServer = new JButton("暂停服务");
        btnPushServer.setBounds(440,10,120,25);
        btnPushServer.setEnabled(false);
        contentPanel.add(btnPushServer);

        btnStopServer = new JButton("停止服务");
        btnStopServer.setBounds(580,10,120,25);
        btnStopServer.setEnabled(false);
        contentPanel.add(btnStopServer);

        //资源路径设置
        labPath = new JLabel("资源路径位置:");
        labPath.setBounds(15,45,100,25);
        contentPanel.add(labPath);

        textPath = new JTextField("");
        textPath.setBounds(130,45,500,25);
        contentPanel.add(textPath);

        btnSetPath = new JButton("设置资源位置");
        btnSetPath.setBounds(640,45,120,25);
        contentPanel.add(btnSetPath);

        //控制台
        textArea= new JTextArea("--控制台--\r\n");
        textArea.setLineWrap(true);
        scrollPane = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(15,80,770,350);
        contentPanel.add(scrollPane);

        //设置资源文件夹事件
        btnSetPath.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //你的程序
            }
        });
        //启动按钮事件
        btnStartServer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //你的程序
            }
        });
        //暂停按钮事件
        btnPushServer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //你的程序
            }
        });
        //停止按钮事件
        btnStopServer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //你的程序
            }
        });
        this.setVisible(true);
    }



    //输出日志到控制台
    public void printLog(final String msg){
        new Thread(){
            public void run(){
                //你的程序
                String date = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]").format(new Date());
                //stringBuff优化
                String info = textArea.getText() + date + " " + msg + "\r\n";
                textArea.setText(info);
            }
        }.start();
    }

    public static void main(String[] args) {
        MainFrame mf = new MainFrame();
    }
}
