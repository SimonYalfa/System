
public class Borrow {

    private String brroewID;
    private Book book;
    private Student studen;

    public Borrow() {
    }

    public Borrow(String brroewID, Book book, Student studen) {
        this.brroewID = brroewID;
        this.book = book;
        this.studen = studen;
    }

    public String getBrroewID() {
        return brroewID;
    }

    public void setBrroewID(String brroewID) {
        this.brroewID = brroewID;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Student getStuden() {
        return studen;
    }

    public void setStuden(Student studen) {
        this.studen = studen;
    }

    @Override
    public String toString() {
        return "The Borrow{" +
                "brroewID='" + brroewID + '\'' +
                ", book=" + book +
                ", studen=" + studen +
                '}';
    }

}
