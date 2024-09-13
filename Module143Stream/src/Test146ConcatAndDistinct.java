import java.util.ArrayList;
import java.util.stream.Stream;

public class Test146ConcatAndDistinct {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("林青霞");
        list.add("张曼玉");
        list.add("王祖贤");
        list.add("柳岩");
        list.add("张敏");
        list.add("张无忌");

        //1.取前四个元素组成一个流
        Stream<String> s1 = list.stream().limit(4);

        //2.跳过两个数据组成一个流
        Stream<String> s2 = list.stream().skip(2);

        //3.合并需求1和需求2得到的流，并把结果输出到控制台
//        Stream.concat(s1, s2).forEach(System.out::println);//不注释就用下面的方法就会IllegalStateException
        System.out.println("--------");

        //4.合并需求1和需求2得到的流，并把结果输出到控制台，要求字符串元素不能重复
        Stream.concat(s1, s2).distinct().forEach(System.out::println);

        
    }
}
