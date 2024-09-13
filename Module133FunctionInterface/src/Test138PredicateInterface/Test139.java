package Test138PredicateInterface;

import java.util.function.Predicate;

public class Test139 {
    public static void main(String[] args) {
        boolean b1 = checkString("hello", s -> s.length() > 8);
        System.out.println(b1);
        boolean b2 = checkString("helloworld", s -> s.length() > 8);
        System.out.println(b2);
        System.out.println("---------");

        boolean b3 = checkString("hello", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b3);
        boolean b4 = checkString("helloworld", s -> s.length() > 8, s -> s.length() < 15);
        System.out.println(b4);
    }

    //同一个字符串给出两个不同的判断条件，最后把这两个判断条件的结果做逻辑与运算的结果作为最终结果
    private static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        boolean b1 = pre1.test(s);
//        boolean b2 = pre2.test(s);
//        boolean b = b1 && b2;
//        return b;
//        return pre1.and(pre2).test(s);
        return pre1.or(pre2).test(s);
    }

    private static boolean checkString(String s, Predicate<String> pre) {
        return pre.test(s);
    }
}
