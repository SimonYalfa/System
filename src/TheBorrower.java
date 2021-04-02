
public class TheBorrower extends Student{

    private int borrower_no;
    private Book book;

    public TheBorrower() {
    }

    public TheBorrower(int borrower_no, Book book) {
        this.borrower_no = borrower_no;
        this.book = book;
    }

    public int getBorrower_no() {
        return borrower_no;
    }

    public void setBorrower_no(int borrower_no) {
        this.borrower_no = borrower_no;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }


}
