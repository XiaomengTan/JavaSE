import java.util.ArrayList;
import java.util.Collections;

public class Test067Poker {
    public static void main(String[] args) {
        //创建一个牌盒
        ArrayList<String> array = new ArrayList<>();

        //往牌盒里放牌
        //定义花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //定义点数数组
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String color : colors) {
            for (String number : numbers) {
                array.add(color + number);
            }
        }

        array.add("joker");
        array.add("JOKER");

        Collections.shuffle(array);

        ArrayList<String> lqx = new ArrayList<>();
        ArrayList<String> ly = new ArrayList<>();
        ArrayList<String> fqy = new ArrayList<>();
        ArrayList<String> dp = new ArrayList<>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if (i >= array.size() - 3) {
                dp.add(poker);
            } else if (i % 3 == 0) {
                lqx.add(poker);
            } else if (i % 3 == 1) {
                ly.add(poker);
            } else if (i % 3 == 2) {
                fqy.add(poker);
            }
        }
        lookPoker("林青霞",lqx);
        lookPoker("柳岩",ly);
        lookPoker("风清扬",fqy);
        lookPoker("底牌",dp);

    }

    public static void lookPoker(String name, ArrayList<String> array) {
        System.out.println(name + "的牌是：");
        for (String poker : array) {
            System.out.print(poker + " ");
        }
        System.out.println();
    }
}
