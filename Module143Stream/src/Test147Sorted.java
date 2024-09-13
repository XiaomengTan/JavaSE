import java.util.ArrayList;

public class Test147Sorted {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("linqingxia");
        list.add("zhangmanyu");
        list.add("wangzuxian");
        list.add("liuyan");
        list.add("zhangmin");
        list.add("zhangwuji");

        //按照字母顺序把数据输出在控制台
//        list.stream().sorted().forEach(System.out::println);

        //按照字符串长度把数据输出在控制台
//        list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);

        list.stream().sorted((s1, s2) -> {
            int i = s1.length() - s2.length() == 0 ? 0 : s1.length() - s2.length();
            int i2 = i == 0 ? s1.compareTo(s2) : i;
            return i2;
        }).forEach(System.out::println);
    }
}
