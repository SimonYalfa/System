
public class Student extends Person {

    private int id;
    private String specialization;
    private String level;
    private int no_copys;

    public Student() {
    }

    public Student(String fName, String lName,int id, String specialization, String level, int no_copys) {

        super(fName, lName);
        this.id = id;
        this.specialization = specialization;
        this.level = level;
        this.no_copys = no_copys;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getNo_copys() {
        return no_copys;
    }

    public void setNo_copys(int no_copys) {
        this.no_copys = no_copys;
    }

    @Override
    public String toString() {
        return super.toString()+ " Student{" +
                "id='" + id + '\'' +
                ", specialization='" + specialization + '\'' +
                ", level='" + level + '\'' +
                ", no_copys=" + no_copys +
                '}';
    }
}
