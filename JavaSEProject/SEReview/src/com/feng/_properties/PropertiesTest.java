package com.feng._properties;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
/**
 * 测试游戏次数
 * */
public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties pop = new Properties();

        FileReader fr = new FileReader("SEReview\\game.txt");
        pop.load(fr);

        fr.close();
        String count = pop.getProperty("count");
        int number = Integer.parseInt(count);

        if (number >= 3) {

            System.out.println("游戏试玩结束，想玩请充值(www.Anthony.cn)");
        } else {
            GuessNumber.start();

            number++;
            pop.setProperty("count",String.valueOf(number));
            FileWriter fw = new FileWriter("SEReview\\game.txt");
            pop.store(fw,null);
            fw.close();
        }
    }
}
