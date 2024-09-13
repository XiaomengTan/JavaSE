package Test033ArrayList4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> array = new ArrayList<>();

        //重复调用方法，添加多个对象
        addStudent(array);
        addStudent(array);
        addStudent(array);

        //遍历集合
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }

    public static void addStudent(ArrayList<Student> array){
        //输入
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生姓名");
        String name = sc.nextLine();

        System.out.println("请输入学生年龄");
        String age = sc.nextLine();

        //创建学生对象
        Student s = new Student();

        //调用成员方法给成员变量赋值
        s.setName(name);
        s.setAge(age);

        //赋值后将对象添加到集合array中
        array.add(s);
    }
}
