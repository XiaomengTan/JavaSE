package Test102ObjectStream.Test103ObjectStreamException;

import java.io.Serializable;

public class Student implements Serializable {
    static final long serialVersionUID = 42L;//一个版本号，不显示声明则通过一般计算获得一个版本号，导致序列化操作的对象与修改后的类的对象的版本号不匹配，导致异常
    private String name;
    private transient int age;//如果一个类的成员变量不想被序列化就用关键字transient修饰

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
