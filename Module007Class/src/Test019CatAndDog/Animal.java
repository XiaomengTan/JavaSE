package Test019CatAndDog;

public class Animal {
    //成员方法
    private String name;
    private int age;

    //构造方法
    public Animal() {
    }

    //带参构造方法
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //成员方法
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
