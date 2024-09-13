import java.util.function.Consumer;

public class Test137ConsumerToForm {
    public static void main(String[] args) {
        String[] strArray = {"谭笑萌,19", "肖运森,19", "林正庭,19"};

        printInfo(strArray, str -> System.out.print("姓名：" + str.split(",")[0]), str -> System.out.println(",年龄：" + Integer.parseInt(str.split(",")[1])));
    }

    private static void printInfo(String[] strArray, Consumer<String> con1, Consumer<String> con2) {
        for (String str : strArray) {
            con1.andThen(con2).accept(str);
        }
    }
}
