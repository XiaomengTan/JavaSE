import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Test064Statistics {
    public static void main(String[] args) {
        //键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        //创建HashMap或TreeMap
        TreeMap<Character,Integer> hm = new TreeMap<>();

        //遍历字符串
        for(int i = 0; i < line.length();i++){
            char key = line.charAt(i);
            Integer value = hm.get(key);

            //判断HashMap集合中是否存在这个元素value
            if(value == null){
                hm.put(key,1);
            } else {
                value++;
                hm.put(key,value);
            }
        }

        //遍历HashMap，并凭借成字符串输出
        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for(Character key : keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        System.out.println(sb.toString());
    }
}
