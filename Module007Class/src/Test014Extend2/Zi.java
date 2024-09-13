package Test014Extend2;

public class Zi extends Fu{
    public int height = 175;

    public int age = 30;

    public void show(){
        int age = 20;
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(super.age);
        System.out.println(height);
    }
}
