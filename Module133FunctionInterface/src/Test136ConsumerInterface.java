import java.util.function.Consumer;

public class Test136ConsumerInterface {
    public static void main(String[] args) {
//        opertatorString("谭笑萌",(String s)->{
//            System.out.println(s);
//        });

//        opertatorString("谭笑萌",System.out::println);

//        opertatorString("谭笑萌", (String s) -> {
//            System.out.println(new StringBuilder(s).reverse().toString());
//        });

//        opertatorString("谭笑萌", s-> System.out.println(new StringBuilder(s).reverse().toString()));

        operatorString("谭笑萌", s -> System.out.println(s), s -> System.out.println(new StringBuilder(s).reverse()));
    }


    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(name);
//        con1 = con1.andThen(con2);
//        con1.accept(name);
        //andThen()返回一个组合的Consumer
        con1.andThen(con2).accept(name);
    }


//    private static void operatorString(String name, Consumer<String> con1, Consumer<String> con2) {
//        con1.accept(name);
//        con2.accept(name);
//    }

    private static void opertatorString(String name, Consumer<String> con) {
        con.accept(name);
    }
}
