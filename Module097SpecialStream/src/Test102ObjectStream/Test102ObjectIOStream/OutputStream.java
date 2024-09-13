package Test102ObjectStream.Test102ObjectIOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        //对象的序列化就是将对象的全部内容输出至txt文件进行保存
        //创建一个写入指定FileOutputStream的ObjectOutputStream对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("TestOfBili\\src\\TXTsort\\Test113.txt"));

        //创建学生对象
        Student s = new Student("谭笑萌",19);

        //将指定对象写入ObjectOutputStream
        oos.writeObject(s);

        //关流
        oos.close();

    }
}
