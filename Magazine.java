
public class Magazine extends Book{

    private String type;

    public Magazine() {
    }

    public Magazine(int bookId, String bookTaittle, String bookArthur, int no_cobys, String type) {
        super(bookId, bookTaittle, bookArthur, no_cobys);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString()+ " Magazine{" +
                "type='" + type + '\'' +
                '}';
    }
}
