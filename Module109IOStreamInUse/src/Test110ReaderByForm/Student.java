package Test110ReaderByForm;

public class Student {
    private String number;
    private String name;
    private String age;
    private String address;

    public Student() {
    }

    public Student(String number, String name, String age, String address) {
        this.number = number;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
