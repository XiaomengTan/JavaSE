package Test021Muli_CatAndDog;

public class AnimalDemo {
    public static void main(String[] args) {
        //创建对象进行测试
        Animal a = new Animal();
        a.setName("加菲猫");
        a.setAge(5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        a = new Cat("加菲猫", 5);
        System.out.println(a.getName() + ", " + a.getAge());
        a.eat();

        a = new Dog();
        a.setName("哈巴狗");
        a.setAge(6);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();

        a = new Cat("哈巴狗",6);
        System.out.println(a.getName()+", "+a.getAge());
        a.eat();
    }
}
