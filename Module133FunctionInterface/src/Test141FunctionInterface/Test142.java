package Test141FunctionInterface;

import java.util.function.Function;

public class Test142 {
    public static void main(String[] args) {
        String s = "谭笑萌,19";

        convert(s, ss -> ss.split(",")[1], Integer::parseInt, i -> i + 70);
    }

    private static void convert(String s, Function<String, String> func1, Function<String, Integer> func2, Function<Integer, Integer> fun3) {
        System.out.println(func1.andThen(func2).andThen(fun3).apply(s));
    }
}
