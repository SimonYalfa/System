import lab8.CircQueueImp;
import lab8.CircularQueue;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

    private CircQueueImp<Book> bookList;
    private CircQueueImp<Student> studentList;
    // soon  private CircQueueImp<Borrow> borrowList;// soon
    // soon private CircQueueImp<Student> the_borrowerList;// soon

    public Manager() {

        bookList = new CircQueueImp<>();
        studentList = new CircQueueImp<>();
        // soon  borrowList = new CircQueueImp<>();

    }


    Scanner enter = new Scanner(System.in);

    ////////////////////// Add Book and Add Magazin //////////////////////////////
    public void add_Book() {
        System.out.println("choose what you will add\n 1- General Book\n 2- Magazin ");
        int chose = enter.nextInt();
        if (chose == 1) {

            Book newBook = new Book();

            System.out.println(" Book ID :  ");
            int id = enter.nextInt();
            newBook.setBookId(id);

            System.out.println(" Book Taittle : ");
            String bTaittle = enter.next();
            newBook.setBookTaittle(bTaittle);

            System.out.println(" Name of Arthur : ");
            String arthur = enter.next();
            newBook.setBookArthur(arthur);

            System.out.println(" Number of copies he has : ");
            int copy = enter.nextInt();
            newBook.setNo_cobys(copy);

            bookList.enqueue(newBook);

            System.out.println("\t\t####### ADD SECSUFULL ########");
        } else if (chose == 2) {

            Magazine newBook = new Magazine();

            System.out.println(" Magazin ID :  ");
            int id = enter.nextInt();
            newBook.setBookId(id);

            System.out.println(" Magazin Taittle : ");
            String bTaittle = enter.next();
            newBook.setBookTaittle(bTaittle);

            System.out.println(" Name of Writer : ");
            String arthur = enter.next();
            newBook.setBookArthur(arthur);

            System.out.println(" Taype of Magazin: ");
            String type = enter.next();
            newBook.setType(type);

            System.out.println(" Number of copies he has : ");
            int copy = enter.nextInt();
            newBook.setNo_cobys(copy);

            bookList.enqueue(newBook);
            System.out.println("\t\t####### ADD SECSUFULL ########\n\n");

        } else System.out.println(" sorry Enter 1 or 2 ");
    }

    ////////////////////// Vew all Books ///////////////////////////////////////

    public void view_Books() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.first());
            bookList.rotate();

        }
    }

    ///////////////////////////// Delete Book ////////////////////////////////
    public boolean delet_Book() {
        System.out.println("Enter Book iD want to delete it ");
         int id= enter.nextInt();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.first().getBookId() == id) {
                bookList.dequeue();
                return true;
            }
            bookList.rotate();
        }
        return false;
    }


    /////////////////////////////eidt_Book /////////////////////////////////

    public boolean eidt_Book() {
        System.out.println("Enter Book ID And the nEw tittle ");
        int id= enter.nextInt();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.first().getBookId() == id) {
                System.out.println("Enter new book Taitlle");
                String book_Taittle = enter.next();
                bookList.first().setBookTaittle(book_Taittle);
                return true;
            }
            bookList.rotate();
        }
        System.out.println("not found");
        return false;
    }

/////////////////////////////////////////////////

    public boolean search_Book() {
        System.out.println("Enter Book iD want to find it ");
        int id= enter.nextInt();

        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.first().getBookId() == id) {
                System.out.println("Book ditalis is \n--------------------------------\n "+bookList.first().toString());
                return true;
            }
            bookList.rotate();
        }
        return false;
    }
}