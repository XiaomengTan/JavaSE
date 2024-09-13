import java.util.ArrayList;

public class Test148MapAndMapToInt {
    public static void main(String[] args) {
        //创建一个集合，储存有多个字符串元素
        ArrayList<String> list = new ArrayList<>();

        list.add("10");
        list.add("20");
        list.add("30");
        list.add("40");
        list.add("50");

        //将集合中的字符串数据转换为整数之后在控制台输出
//        list.stream().map(Integer::parseInt).forEach(System.out::println);

//        list.stream().mapToInt(Integer::parseInt).forEach(System.out::println);

        //int sum()返回此流中的元素总和
        int result = list.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(result);
    }
}
