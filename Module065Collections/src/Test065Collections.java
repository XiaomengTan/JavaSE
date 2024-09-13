import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test065Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        //排序
//        Collections.sort(list);

        //反转
//        Collections.reverse(list);

        //随机置换
        Collections.shuffle(list);

        System.out.println(list);

        Collections.shuffle(list);

        System.out.println(list);
    }
}
