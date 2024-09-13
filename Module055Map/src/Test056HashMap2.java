import java.util.HashMap;
import java.util.Map;

public class Test056HashMap2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();


        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

//        System.out.println(map.remove("郭靖"));//黄蓉
//        System.out.println(map.remove("郭襄"));//null

//        map.clear();

//        System.out.println(map.containsKey("郭靖"));
//        System.out.println(map.containsKey("郭襄"));

//        System.out.println(map.containsValue("小龙女"));

//        System.out.println(map.isEmpty());
//
//        map.clear();
//        System.out.println(map.isEmpty());

        System.out.println(map.size());//三段键值对

        System.out.println(map);
    }
}
