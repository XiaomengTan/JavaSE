import java.util.HashMap;
import java.util.Map;

public class Test055HashMap1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        //V put(K key, V value)将指定的值与该映射中是的指定键相关联
        map.put("001", "林青霞");
        map.put("002", "张曼玉");
        map.put("003", "王祖贤");
        map.put("003", "柳岩");//底层实现是hashTable，用于保证键的唯一性

        //输出集合对象
        System.out.println(map);
    }
}
