package Test110ReaderByForm;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WriterByForm {
    public static void main(String[] args) throws IOException {
        //创建字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("TestOfBili\\src\\TXTsort\\Test103Student.txt"));

        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();

        //读取数据并储存到集合中
        String s;
        while ((s = br.readLine()) != null) {
            //创建学生类对象变量并添加到集合中去
            String[] ss = s.split(",");
            //添加到集合中去
            array.add(new Student(ss[0], ss[1], ss[2], ss[3]));
        }

        //输出集合
        for (Student st : array) {
            System.out.println(st.getNumber() + "," + st.getName() + "," + st.getAge() + "," + st.getAddress());
        }

        //关流
        br.close();
    }
}
