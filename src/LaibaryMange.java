import java.util.ArrayList;
import java.util.Scanner;


public class LaibaryMange {

    private ArrayList<Book> bookList;
    private ArrayList<Student> studentList;
    private ArrayList<Borrow> borrowList;
    private ArrayList<Student> the_borrowerList;

    public LaibaryMange() {
        bookList = new ArrayList<>();
        studentList = new ArrayList<>();
        borrowList = new ArrayList<>();

        Book one= new Book(123,"Sharliic Holmez","Conan Duel",3);
        Book two= new Book(124,"Big Java","Jhouhan",3);
        Magazine three= new Magazine(125,"Prety world","london",4,"Sporty");

        Student n1= new Student("Ahmed"," Hssan",12,"Coumpter ","frishman",3);
        Student n2= new Student("Emad"," Khalid",17,"Coumpter ","frishman",5);

        bookList.add(one);
        bookList.add(two);
        bookList.add(three);

        Book four = new Magazine(11, "Unknounbook", "Jamilla", 3, "Computer sence");
        bookList.add(four);
        four = new Book(13, "we can", "Aisha", 1);
        bookList.add(four);

        studentList.add(n1);
        studentList.add(n2);

    }


    ////////////////////// Add Book and Add Magazin ///////////////////////////////////////

    Scanner enter = new Scanner(System.in);
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

            bookList.add(newBook);

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

            bookList.add(newBook);
            System.out.println("\t\t####### ADD SECSUFULL ########\n");

        } else System.out.println(" sorry Enter 1 or 2 ");
    }

    /**
     * SREching Book
     * @param id
     */

    /////////////////////////////  //////////////////////////////////////////////////

    public void search_Book( int id) {

        for (Book serch : bookList) {

            if (serch.getBookId()==(id) ) {
               serch.toString();
            }
            else
                System.out.println("not found");
        }


    }

    /**
     * Eidte Book
     * @param b_id
     * @param book_Taittle
     * @return
     */

    ///////////////////////////// //////////////////////////////////////////////////


    public boolean eidt_Book(int b_id, String book_Taittle) {
        System.out.println("Enter Book ID And the nEw tittle ");
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookId() == b_id) {
                bookList.get(i).setBookTaittle(book_Taittle);
                return true;
            }
        }

        return false;
    }

    /**
     * Delete Book
     * @param id
     * @return
     */
    /////////////////////////////  //////////////////////////////////////////////////


    public boolean delet_Book(int id) {
        System.out.println("Enter Book iD want to delete it ");
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookId() == id) {
                bookList.remove(i);
                return true;
            }
        }

        return false;
    }

    /**
     * Vew all Books
     */

    ////////////////////////////////  /////////////////////////////////

    public void view_Books() {
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    ///////////////////////////////// Add Student //////////////////////////////////////////////////

    public void add_Student() {

        Student newStudent = new Student();

        System.out.println(" Student ID :  ");
        int id = enter.nextInt();
        newStudent.setId(id);

        System.out.println(" First Name : ");
        String fName = enter.next();
        newStudent.setfName(fName);

        System.out.println(" Last Name : ");
        String lName = enter.next();
        newStudent.setlName(lName);

        System.out.println(" Specialization : ");
        String Special = enter.next();
        newStudent.setSpecialization(Special);

        System.out.println(" Student Level : ");
        String level = enter.next();
        newStudent.setSpecialization(level);

        System.out.println(" Numbers of Book he/she has : ");
        int copyNo = enter.nextInt();
        newStudent.setNo_copys(copyNo);

        studentList.add(newStudent);
        System.out.println("\t\t####### ADD SECSUFULL ########");
    }

    /**
     * SREching Student
     * @param id
     */
    /////////////////////////////  //////////////////////////////////////////////////

    public void search_Student(int id) {

        for (Student search : studentList) {

            if (search.getId() == id) {
                search.toString();
            }
        }

    }

    ///////////////////////////// Eidet Student first Name //////////////////////////////////////////////////

    public boolean eidt_Student(int id, String firstName) {

        System.out.println("Enter Student ID and the New First Name ");
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.get(i).setfName(firstName);
                return true;
            }
        }

        return false;
    }

    /**
     * Delete Student
     * @param id
     * @return true or false
     */
    /////////////////////////////  //////////////////////////////////////////////////

    public boolean delet_Student(int id) {

        System.out.println("Enter Student ID want to delete ");
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
                return true;
            }
        }

        return false;
    }
    ///////////////////////////// Borrow processes //////////////////////////////////////////////////
    //

    /**
     * Student Borrow record
     *
     * @param copysBrwo
     */
    //
////////////////////////////////// /////////////////////////////

    public void sBrecord(Book copysBrwo) {

        System.out.println("Enter Student ID");
        int id = enter.nextInt();

        for (Student sSerch : studentList) {

            if (sSerch.getId() == id) {

                if (sSerch.getNo_copys() < 5) {
                    System.out.println("the prossing  Done");
                    sSerch.setNo_copys(sSerch.getNo_copys() + 1);
                    copysBrwo.setNo_cobys(copysBrwo.getNo_cobys() - 1);

     //////// Add Borrowe  ////////////////////////////////////////////////////////////////////
                    Borrow borrow = new Borrow(" ", copysBrwo, sSerch);
                    borrowList.add(borrow);


                    /**
                     * Add Borrower
                     */
                    ////////  ////////////////////////////////////////////////////////////////////

                    the_borrowerList.add(sSerch);

       ///////////////////////////////////////////////////////////////////////////////////////

                } else {
                    System.out.println(" This Student alardy brow 5 books ");
                }

            } else {
                System.out.println("Student not found ");
            }
        }
    }

    /**
     * Borrow Book
     */

//////////////////////////////////  ///////////////////////////////////////

    public void brow_Book() {

        System.out.println("ENter The books ID :");
        int id = enter.nextInt();

        for (Book bSerch : bookList) {

            if (bSerch.getBookId() == id) {

                if (bSerch.getNo_cobys() == 0) {
                    System.out.println(" This book is alredy browed ");
                } else {

                    sBrecord(bSerch);

                }

            } else {
                System.out.println(" Book not found ");
            }
        }

    }

    /**
     * Return the Book
     */

    ////////////////////////////////// ///////////////////////////////////////
    public void returnBook() {

        System.out.println("Enter the Book ID");
        int id = enter.nextInt();

        for (Book reback : bookList) {

            if (reback.getBookId() == id) {
                reback.setNo_cobys(reback.getNo_cobys() + 1);
                System.out.println("Return is sucssefull!");
                update_S_record();

            } else
                System.out.println(" Wrong ID ");

        }
    }

    /**
     * Update Student Books record
     */


    /////////////////////////////////////////////////////////////////
    public void update_S_record() {

        System.out.println("Enter student ID");
        int id = enter.nextInt();

        for (Student update : studentList) {

            if (update.getId() == id) {
                update.setNo_copys(update.getNo_copys() - 1);
            } else
                System.out.println("Steunsent not found");
        }
    }

    /**
     * Vew all Student
     */
    ////////////////////////////////  /////////////////////////////////

    public void view_Student() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    /**
     * Vew all Borrwe
     *
     */
////////////////////////////////  /////////////////////////////////

    public void view_Borrowe() {
        for (Borrow borrow : borrowList) {
            System.out.println(borrow);
        }
    }

    /**
     * Vew all Borrwers
     */

    ///////////////////////////////  /////////////////////////////////
    public void view_Borrowers() {
        for (Student borroer : the_borrowerList) {
            System.out.println(borroer);
        }
    }




}
