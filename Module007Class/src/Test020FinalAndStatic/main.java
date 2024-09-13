package Test020FinalAndStatic;

public class main {
    public static void main(String[] args) {
        son s = new son();
        s.setAge(9);
        s.setHeight(175);
        s.ability();
        father f = new father();

        //被final修饰的成员变量可以使用，不能修改
        System.out.println(s.weight);
        //报错
        //s.weight = 60;

        //被static修饰的成员变量被所有对象共享，可由类名调用修改，也可由任意对象修改
        //这是通过子类名修改
        son.name = "mxt";
        System.out.println(son.name);
        System.out.println(father.name);
        System.out.println(s.name);
        System.out.println(f.name);


        //这是通过类名修改
        System.out.println("---------");
        father.name = "mtx";
        System.out.println(son.name);
        System.out.println(father.name);
        System.out.println(s.name);
        System.out.println(f.name);

        //这是通过子类对象修改
        System.out.println("---------");
        s.name = "xmt";
        System.out.println(son.name);
        System.out.println(father.name);
        System.out.println(s.name);
        System.out.println(f.name);

        //这是通过类对象修改
        System.out.println("---------");
        s.name = "tmx";
        System.out.println(son.name);
        System.out.println(father.name);
        System.out.println(s.name);
        System.out.println(f.name);

        //static修饰的成员方法
        s.show();
    }
}
