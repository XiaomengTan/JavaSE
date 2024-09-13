package Test024String;

public class StringBuilder2 {
    public static void main(String[] args) {
        //StringBuilder转String
        StringBuilder sb = new StringBuilder("hello");
        String s = sb.toString();
        System.out.println(s);

        //String转StringBuilder
        String s1 = "world";
        StringBuilder sb1 = new StringBuilder(s1);
        System.out.println(sb1);
    }
}
