package Test104PropertiesAndIO.Test108PropertiesGameTimes;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test {
    public static void main(String[] args) throws IOException {
        //从文件读取数据到集合中
        Properties prop = new Properties();

        //创建简化字符输入流
        FileReader fr = new FileReader("TestOfBili\\src\\TXTsort\\Test118.txt");
        prop.load(fr);
        fr.close();

        //通过集合获取完游戏的次数
        String count = prop.getProperty("count");
        int number = Integer.parseInt(count);

        //判断是否到三次了
        if(number>=3){
            //如果到了，给出提示：游戏试玩已结束，想玩请充值(www.txmhhh.cn)
            System.out.println("游戏试玩已结束，想玩请充值(www.txmhhh.cn)");
        } else {
            //玩游戏
            GuessNumber.start();

            //次数加一，重新写回文件，用store()方法实现
            number++;
            prop.setProperty("count",String.valueOf(number));
            FileWriter fw = new FileWriter("TestOfBili\\src\\TXTsort\\Test118.txt");
            prop.store(fw,null);
            fw.close();
        }
    }
}
