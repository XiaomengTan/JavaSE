package Test047TreeSet;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> ts = new TreeSet<>();

        //添加集合元素
        ts.add(new Student("xishi", 29));
        ts.add(new Student("wangzhaojun", 28));
        ts.add(new Student("diaochan", 30));
        ts.add(new Student("yangyuhuan", 33));
        ts.add(new Student("linqingxia",33));

        //遍历集合
        for (Student s : ts) {
            System.out.println(s.getName() + ", " + s.getAge());
        }

    }
}
