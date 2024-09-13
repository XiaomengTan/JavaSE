import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Test068PokerUpdate {
    public static void main(String[] args) {
        //创建HashMap，键是编号，值是牌
        HashMap<Integer, String> hm = new HashMap<>();

        //创建ArrayList，储存编号
        ArrayList<Integer> array = new ArrayList<>();

        //创建花色数组和点数数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //从0开始往HashMap里面储存编号，并储存对应的牌，同时往ArrayList中存储编号
        int index = 0;
        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                array.add(index);
                index++;
            }
        }

        hm.put(index, "joker");
        array.add(index);
        index++;
        hm.put(index, "JOKER");
        array.add(index);

        //洗牌
        Collections.shuffle(array);

        //发牌
        TreeSet<Integer> lqxSet = new TreeSet<>();
        TreeSet<Integer> lySet = new TreeSet<>();
        TreeSet<Integer> fqySet = new TreeSet<>();
        TreeSet<Integer> dpSet = new TreeSet<>();

        for (int i = 0; i < array.size(); i++) {
            Integer x = array.get(i);
            if (i >= array.size() - 3) {
                dpSet.add(x);
            } else if (i % 3 == 0) {
                lqxSet.add(x);
            } else if (i % 3 == 1) {
                lySet.add(x);
            } else if (i % 3 == 2) {
                fqySet.add(x);
            }
        }

        //调用看牌方法
        lookPoker("林青霞", lqxSet, hm);
        lookPoker("柳岩", lySet, hm);
        lookPoker("风清扬", fqySet, hm);
        lookPoker("底牌", dpSet, hm);
    }

    //定义方法看牌
    public static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.println(name + "的牌是：");
        for (Integer key : ts) {
            String poker = hm.get(key);
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
