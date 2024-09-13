package Test023Interface_CatAndDog;

public class Dog extends Animal implements Jumpping{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void jump() {
        System.out.println("狗也可以跳");
    }

    @Override
    public void eat() {
        System.out.println("但狗吃骨头");
    }
}
