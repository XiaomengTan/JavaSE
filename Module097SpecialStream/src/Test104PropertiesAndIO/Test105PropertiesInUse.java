package Test104PropertiesAndIO;

import java.util.Properties;
import java.util.Set;

public class Test105PropertiesInUse {
    public static void main(String[] args) {
//        Properties<String,String> prop = new Properties<String,String>();//错误
        Properties prop = new Properties();

        prop.put("202144011123", "谭笑萌");
        prop.put("202144011124", "肖运森");
        prop.put("202144011125", "林正庭");

        Set<Object> keySets = prop.keySet();
        for (Object key : keySets) {
            Object value = prop.get(key);
            System.out.println(key + "," + value);
        }
    }
}
