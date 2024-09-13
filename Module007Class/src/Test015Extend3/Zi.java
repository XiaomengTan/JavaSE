package Test015Extend3;

public class Zi extends Fu {
    public int age = 30;
    public void show(){
        int age = 20;

        //访问局部变量
        System.out.println(age);

        //访问成员变量
        System.out.println(this.age);

        //访问父类变量
        System.out.println(super.age);
    }
}
