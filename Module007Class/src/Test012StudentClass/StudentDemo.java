package Test012StudentClass;

public class StudentDemo {
    public static void main(String[] args) {
        //使用无参构造方法创建对象，然后使用set方法赋值
        Student s1 = new Student();
        s1.setName("林青霞");
        s1.setAge(30);
        s1.show();

        //使用带参构造方法给成员变量赋值
        Student s2 = new Student("林青霞",30);
        s2.show();
    }
}
