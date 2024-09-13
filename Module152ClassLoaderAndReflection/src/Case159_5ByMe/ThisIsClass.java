package Case159_5ByMe;

public class ThisIsClass {
    private String field;

    private ThisIsClass(){}

    private void method(){
        System.out.println("你好，Java！");
    }

    @Override
    public String toString() {
        return "ThisIsClass{" +
                "field='" + field + '\'' +
                '}';
    }
}
