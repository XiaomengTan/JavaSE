import java.util.ArrayList;

public class Test144Filter {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("林青霞");
        array.add("张曼玉");
        array.add("王祖贤");
        array.add("柳岩");
        array.add("张敏");
        array.add("张无忌");

        //Stream流生成过滤器
        array.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

    }
}
