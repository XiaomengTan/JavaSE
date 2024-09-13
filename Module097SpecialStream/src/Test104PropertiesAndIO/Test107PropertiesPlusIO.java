package Test104PropertiesAndIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Test107PropertiesPlusIO {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        myStore();

        //把文件中的数据加载到集合
        myLoad();

    }

    private static void myLoad() throws IOException {
        //创建集合对象
        Properties prop = new Properties();

        //创建字符输入流
        FileReader fr = new FileReader("TestOfBili\\src\\TXTsort\\Test117.txt");

        //void load(Reader reader)
        prop.load(fr);
        fr.close();

        //输出
        System.out.println(prop);

    }

    private static void myStore() throws IOException {
        //创建集合对象
        Properties prop = new Properties();

        //添加元素
        prop.setProperty("202144011123","谭笑萌");
        prop.setProperty("202144011124","肖运森");
        prop.setProperty("202144011125","林正庭");

        //创建字符输出流
        FileWriter fw = new FileWriter("TestOfBili\\src\\TXTsort\\Test117.txt");

        //void store(Writer writer, String comment)
//        prop.store(fw,null);
        prop.store(fw,null);
        fw.close();
    }
}
