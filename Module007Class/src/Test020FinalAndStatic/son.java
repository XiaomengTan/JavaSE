package Test020FinalAndStatic;

public class son extends father {
    public son() {
    }

    public son(int height, int age) {
        super(height, age);
    }

    public void ability() {
        System.out.println(super.getAge() + ", " + super.getHeight());
        System.out.println("我爱游泳");
    }

    //报错，被final修饰的成员方法不能被重写
    /*
    public final void method(){
        System.out.println("这是子类成员方法method");
    }
     */
}

//被final修饰的类不能被继承
/*
public class son extends test {
}
*/