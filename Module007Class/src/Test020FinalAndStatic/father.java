package Test020FinalAndStatic;

public class father {
    private int height;
    private int age;

    public father() {
    }

    public father(int height, int age) {
        this.height = height;
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //final修饰成员变量和方法
    public final int weight = 55;
    public final void method(){
        System.out.println("这是父类成员方法method");
    }

    //static修饰成员变量和方法
    public static String name = "txm";
    public static void show(){
        //能访问静态成员方法和变量，不能访问非静态成员方法和变量
        //报错
        //System.out.println(this.name);
        System.out.println("这是父类成员方法show");
    }
}
