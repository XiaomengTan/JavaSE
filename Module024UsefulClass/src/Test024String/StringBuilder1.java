package Test024String;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sc = new StringBuilder();
        sc.append("hello").append("world").append("666");
        System.out.println(sc);

        sc.reverse();
        System.out.println(sc);
    }
}
