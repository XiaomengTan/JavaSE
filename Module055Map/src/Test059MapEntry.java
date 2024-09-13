import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test059MapEntry {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("张无忌", "赵敏");
        map.put("郭靖", "黄蓉");
        map.put("杨过", "小龙女");

        //获取所有键值对对象的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //遍历键值对对象的集合，得到每一个键值对对象
        for (Map.Entry<String, String> me : entrySet) {
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key + ", " + value);
        }
    }
}
