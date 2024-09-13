package Test022Abstract_CatAndDog;

public class AnimalDemo {
    public static void main(String[] args) {
        //多态方式创建对象
        Animal a = new Cat();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        System.out.println("--------");

        a = new Cat("加菲",5);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

        System.out.println("--------");

        a = new Dog();
        a.setName("哈巴狗");
        a.setAge(6);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

        System.out.println("--------");

        a = new Dog("哈巴狗",6);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();
    }
}
