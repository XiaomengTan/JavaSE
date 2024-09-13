package Test141FunctionInterface;

import java.util.function.Function;

public class Test141 {
    public static void main(String[] args) {
        convert("100", Integer::parseInt);
        System.out.println("---------");
        convert(100, i -> String.valueOf(i + 566));
        System.out.println("---------");
        convert("100", Integer::parseInt, i -> String.valueOf(i + 566));
    }

    private static void convert(String s, Function<String, Integer> func) {
//        Integer i =  func.apply(s);
        int i = func.apply(s);
        System.out.println(i);
    }

    private static void convert(int i, Function<Integer, String> func) {
        String s = func.apply(i);
        System.out.println(s);
    }

    private static void convert(String s, Function<String, Integer> func1, Function<Integer, String> func2) {
//        Integer i = func1.apply(s);
//        String ss = func2.apply(i);
//        System.out.println(ss);

        System.out.println(func1.andThen(func2).apply(s));
    }
}
