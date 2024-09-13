package Test109WriterByForm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test102WriterByForm {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("TestOfBili\\src\\TXTsort\\Test102Student.txt"));

        //创建学生类集合
        ArrayList<Student> array = new ArrayList<>();

        //用带参构造方法创建学生对象，并存入集合中
        array.add(new Student("202144011123","谭笑萌","19","广州"));
        array.add(new Student("202144011124","肖运森","19","广州"));
        array.add(new Student("202144011125","林正庭","19","广州"));
        array.add(new Student("202144011126","黎娜","19","广州"));

        //调用字符缓冲输出流对象，将集合元素按格式写入文件
        for(Student s : array){
            bw.write(s.getNumber()+","+s.getName()+","+s.getAge()+","+s.getAddress());
            bw.newLine();
            bw.flush();
        }

        //关流
        bw.close();
    }
}
