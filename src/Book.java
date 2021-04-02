public class Book {

    private int bookId;
    private String bookTaittle;
    private String bookArthur;
    private int no_cobys;


    public Book() {
    }

    public Book(int bookId, String bookTaittle, String bookArthur, int no_cobys) {
        this.bookId = bookId;
        this.bookTaittle = bookTaittle;
        this.bookArthur = bookArthur;
        this.no_cobys = no_cobys;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookTaittle() {
        return bookTaittle;
    }

    public void setBookTaittle(String bookTaittle) {
        this.bookTaittle = bookTaittle;
    }

    public String getBookArthur() {
        return bookArthur;
    }

    public void setBookArthur(String bookArthur) {
        this.bookArthur = bookArthur;
    }

    public int getNo_cobys() {
        return no_cobys;
    }

    public void setNo_cobys(int no_cobys) {
        this.no_cobys = no_cobys;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookTaittle='" + bookTaittle + '\'' +
                ", bookArthur='" + bookArthur + '\'' +
                ", no_cobys=" + no_cobys +
                '}';
    }
}
