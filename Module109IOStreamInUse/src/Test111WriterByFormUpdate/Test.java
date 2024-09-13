package Test111WriterByFormUpdate;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) throws IOException {
        //创建TreeSet集合，通过比较器进行排序
        TreeSet<Student> ts = new TreeSet<Student>((Student s1, Student s2) -> {
            //总分从高到低
            int num = s2.getSum() - s1.getSum();

            //次要条件
            int num2 = num == 0 ? s2.getChinese() - s1.getChinese() : num;
            int num3 = num2 == 0 ? s2.getMath() - s1.getMath() : num2;
            int num4 = num3 == 0 ? s2.getName().compareTo(s1.getName()) : num3;
            return num4;
        });

        //键盘录入学生数据
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请录入第" + (i + 1) + "个学生数据");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩：");
            int chinese = sc.nextInt();
            System.out.println("数学成绩：");
            int math = sc.nextInt();
            System.out.println("英语成绩：");
            int english = sc.nextInt();

            //创建学生对象，把键盘录入的数据对应赋值给学生对象的成员变量
            Student s = new Student();
            s.setName(name);
            s.setChinese(chinese);
            s.setMath(math);
            s.setEnglish(english);

            //把学生对象添加到TreeSet集合中
            ts.add(s);
        }

        //创建字符缓冲输出流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("TestOfBili\\src\\TXTsort\\Test104Student.txt"));

        //遍历集合，得到每一个学生对象
        for (Student s : ts) {
            //拼接
            StringBuilder sb = new StringBuilder();
            sb.append(s.getName()).append(",").append(s.getChinese()).append(",").append(s.getMath()).append(",").append(s.getEnglish()).append(",").append(s.getSum());

            //输出
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        //释放资源
        bw.close();
    }
}
