package Test011PhoneClass;

public class PhoneDemo {
    public static void main(String[] args) {
        //创建对象
        Phone p = new Phone();

        //使用成员变量
        System.out.println(p.brand);
        System.out.println(p.price);
        /*
        成员变量储存在堆内存中，具有默认值0或者null
        */

        p.brand = "小米";
        p.price = 2999;

        System.out.println(p.brand);
        System.out.println(p.price);
        //使用成员方法
        p.call();
        p.sendMassage();
    }
}
