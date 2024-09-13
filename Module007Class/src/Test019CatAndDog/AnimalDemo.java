package Test019CatAndDog;

public class AnimalDemo {
    public static void main(String[] args) {
        //无参创建
        Cat c1 = new Cat();
        c1.setName("加菲猫");
        c1.setAge(5);
        System.out.println(c1.getName() + ", " + c1.getAge());
        c1.catchMouse();

        //带参创建
        Cat c2 = new Cat("加菲猫", 5);
        System.out.println(c2.getName() + ", " + c2.getAge());
        c2.catchMouse();

        //无参创建
        Dog d1 = new Dog();
        d1.setName("哈巴狗");
        d1.setAge(6);
        System.out.println(d1.getName() + ", " + d1.getAge());
        d1.lookDog();

        //带参创建
        Dog d2 = new Dog("哈巴狗", 6);
        System.out.println(d2.getName() + ", " + d2.getAge());
        d2.lookDog();
    }
}
