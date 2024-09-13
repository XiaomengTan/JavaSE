package Test023Interface_CatAndDog;

public class AnimalDemo {
    public static void main(String[] args) {
        //只能调用接口含有的抽象方法对应的重写方法
        Jumpping j = new Cat();
        j.jump();

        //只能调用抽象类含有的抽象方法对应的重写方法
        Animal a = new Cat();
        a.setName("加菲");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        a = new Cat("加菲猫",5);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

//        Cat ccc = (Cat)a;

        //可以调用接口和抽象父类的所有
        Cat c = new Cat();
        c.setName("加菲猫123");
        c.setAge(7);
        System.out.println(c.getName()+", "+c.getAge());
        c.eat();
        c.jump();

        //只能调用接口含有的抽象方法对应的重写方法
        Jumpping jd = new Dog();
        jd.jump();

        //只能调用抽象类含有的抽象方法对应的重写方法
        a = new Dog();
        a.setName("哈巴");
        a.setAge(6);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        a = new Dog("哈巴狗",7);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

        //可以调用接口和抽象父类的所有
        Dog d = new Dog();
        d.setName("哈巴狗123");
        d.setAge(7);
        System.out.println(d.getName()+", "+d.getAge());
        d.eat();
        d.jump();
    }
}
