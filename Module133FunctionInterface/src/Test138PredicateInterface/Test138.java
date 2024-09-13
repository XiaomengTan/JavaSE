package Test138PredicateInterface;

import java.util.function.Predicate;

public class Test138 {
    public static void main(String[] args) {
//        boolean b1 = checkString("hello",(String s)->{
//            return s.length()>8;
//        });

//        boolean b1 = checkString("hello", s -> s.length() > 8);
//        boolean b1 = checkString("hello", String::isEmpty);

        boolean b1 = checkString("hello", s -> s.length() > 8);


        System.out.println(b1);
    }

    private static boolean checkString(String s, Predicate<String> pre) {
//        return pre.test(s);
//        return !pre.test(s);
        return pre.negate().test(s);//对结果进行逻辑非操作
    }
}
