
public class Person {

    private String fName;
    private String lName;
    private String sex;
    private int age;
    private String Address;
    private String phone;

    public Person() {}

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;

    }

    public Person(String fName, String lName, String sex, int age, String address, String phone) {
        this.fName = fName;
        this.lName = lName;
        this.sex = sex;
        this.age = age;
        Address = address;
        this.phone = phone;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                +
                '}';
    }
}
