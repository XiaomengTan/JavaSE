import java.util.ArrayList;

public class Test145LimitAndSkip {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //1.取前三个数据在控制台输出
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("--------");

        //2.跳过3个元素，把剩下的元素在控制台输出
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("--------");

        //3.跳过两个元素，把剩下的元素中的前2个在控制台输出
        list.stream().skip(2).limit(2).forEach(System.out::println);
    }
}
