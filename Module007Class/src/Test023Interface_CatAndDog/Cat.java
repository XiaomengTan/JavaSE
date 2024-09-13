package Test023Interface_CatAndDog;

public class Cat extends Animal implements Jumpping{
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("猫可以跳高");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }


}
