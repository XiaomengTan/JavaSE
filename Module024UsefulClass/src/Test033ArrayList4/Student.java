package Test033ArrayList4;

public class Student {
    //成员变量
    private String name;
    private String age;

    //构造方法
    public Student(){}

    public Student(String name,String age){
        this.name = name;
        this.age = age;
    }

    //成员方法
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getAge(){
        return age;
    }
}
