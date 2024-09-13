import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Test062ArrayListIncludeHashMap {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<HashMap<String,String>> array = new ArrayList<>();

        HashMap<String,String> hm1 = new HashMap<>();
        hm1.put("孙策","大乔");
        hm1.put("周瑜","小乔");
        array.add(hm1);

        HashMap<String,String> hm2 = new HashMap<>();
        hm2.put("郭靖","黄蓉");
        hm2.put("杨过","小龙女");
        array.add(hm2);

        HashMap<String,String> hm3 = new HashMap<>();
        hm3.put("令狐冲","任盈盈");
        hm3.put("林平之","岳林珊");
        array.add(hm3);

        //遍历ArrayList集合
        for(HashMap<String,String> hm:array){
            //遍历集合元素（HashMap）
            Set<String> keySet = hm.keySet();//获得键的集合
            for(String key:keySet){
                String value = hm.get(key);
                System.out.println(key+", "+value);
            }
        }
    }
}
