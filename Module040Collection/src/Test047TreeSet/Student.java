package Test047TreeSet;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

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
    public int compareTo(Student s) {
//        return 0;
//        return 1;
//        return -1;

        int num = this.age - s.age;
        int num2 = num == 0?this.name.compareTo(s.name):num;//this.name是个字符串，String类重写了compareTo方法
        return num2;
    }
}
