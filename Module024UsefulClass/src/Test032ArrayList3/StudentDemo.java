package Test032ArrayList3;

import java.util.ArrayList;

public class StudentDemo {
    public static void main(String[] args) {
        //创建集合
        ArrayList<Student> array = new ArrayList<>();

        //创建学生对象
        Student s1 = new Student("谭笑萌", 19);
        Student s2 = new Student("肖运森", 19);
        Student s3 = new Student("林正庭", 19);

        //添加集合元素
        array.add(s1);
        array.add(s2);
        array.add(s3);

        //遍历集合
        for (int i = 0; i < array.size(); i++) {
            Student s = array.get(i);
            System.out.println(s.getName() + ", " + s.getAge());
        }
    }
}
