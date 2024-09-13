package Test102ObjectStream.Test102ObjectIOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //对象的反序列化就是将对象从序列化对象文件中读取数据并获得其中的对象
        //创建对象输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("TestOfBili\\src\\TXTsort\\Test113.txt"));

        //从ois中读取一个对象
        Object obj = ois.readObject();

        Student s = (Student) obj;
        System.out.println(s.getName()+", "+s.getAge());

        //关流
        ois.close();


    }
}
