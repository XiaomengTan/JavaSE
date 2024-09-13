package Test018TeacherAndStudent;

public class Person {
    //成员变量
    private String name;
    private int age;
    public static int test = 1;
    //无参构造方法
    public Person() {
    }

    //带参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get/set成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
