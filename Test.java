import java.awt.print.Book;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Manager use= new Manager();

        Scanner enter= new Scanner(System.in);
        int choose;
        boolean loop=true;

        while (loop == true)
        {

            System.out.println("\t-----------------------------------------");
            System.out.println("\t\t\t LAIBARY BORROW SYSTEM  ");
            System.out.println("\t-----------------------------------------");

            System.out.println("\t\t\t1) ADD Book  ");
            System.out.println("\t\t\t2) update a Book Taittle ");
            System.out.println("\t\t\t3) Vew all Books ");
            System.out.println("\t\t\t4) Delete a Book ");
            System.out.println("\t\t\t5) looking for  Book ");

            System.out.println("\t\t\t0) Back to main list ");

            System.out.println("what process you like do it? \n");
            System.out.println("---------------------------------- \n");

            choose = enter.nextInt();
            switch (choose) {
                case 1:
                    use.add_Book();
                    break;


                case 2:

                    use.eidt_Book();

                break;

                case 3:
                    use.view_Books();
                    break;

                case 4: {

                    int id = enter.nextInt();

                }
                break;
                case 5: {

                    use.search_Book();
                }

                case 0:
                    break;

            }}}}