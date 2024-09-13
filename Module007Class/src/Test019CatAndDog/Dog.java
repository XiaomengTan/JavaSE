package Test019CatAndDog;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void lookDog(){
        System.out.println("狗看门");
    }
}
