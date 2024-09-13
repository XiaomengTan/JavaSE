package Test049GenericClass;

public class Demo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林青霞");
        System.out.println(s.getName());

        Teacher t = new Teacher();
        t.setAge(30);
//        t.setAge("30");//使用泛型类的原因
        System.out.println(t.getAge());

        System.out.println("--------");

        //只需要一个类就可以了
        GenericClassForDemo<String> g1 = new GenericClassForDemo<>();
        g1.setT("林青霞");
        System.out.println(g1.getT());

        GenericClassForDemo<Integer> g2 = new GenericClassForDemo<>();
        g2.setT(30);
        System.out.println(g2.getT());

        GenericClassForDemo<Boolean> g3 = new GenericClassForDemo<>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}
