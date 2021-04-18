//import java.util.Scanner;
//
//
//public class Laibary {
//
//    public static void main(String[] args) {
//
//
//        LaibaryMange use = new LaibaryMange();
//        Scanner enter = new Scanner(System.in);
//
//
//        int choose;
//        boolean rebate = true;
//
//        while (rebate == true) {
//
//            System.out.println("\t-----------------------------------------");
//            System.out.println("\t\t\t LAIBARY BORROW SYSTEM  ");
//            System.out.println("\t-----------------------------------------");
//
//            System.out.println("\t\t\t1) Borrow process  ");
//            System.out.println("\t\t\t2) Students process  ");
//            System.out.println("\t\t\t3) Books process  ");
//            System.out.println("\t\t\t0) CLOSE THE SYSTEM  ");
//
//            System.out.println("\n\t-----------------------------------------");
//            System.out.println("PLEASE Enter your Choice ");
//            choose = enter.nextInt();
//
//            switch (choose) {
//
//                case 1: while (choose !=0){
//                    System.out.println("what process you like do it? \n");
//                    System.out.println("---------------------------------- \n");
//                    System.out.println("\t\t\t1) BROWE BOOK  ");
//                    System.out.println("\t\t\t2) RETUNe BOOK  ");
//                    System.out.println("\t\t\t3) Vew all Borrwer ");
//                    System.out.println("\t\t\t4) Vew all Borrow  ");
//                    System.out.println("\t\t\t0) Back to main list ");
//
//                    choose = enter.nextInt();
//                    while (choose != 0) {
//                        switch (choose) {
//                            case 1:
//                                use.brow_Book();
//                                break;
//
//                            case 2:
//                                use.returnBook();
//                                break;
//
//                            case 3:
//                                use.view_Borrowers();
//                                break;
//                            case 4:
//                                use.view_Borrowe();
//                                break;
//                            case 0:
//                                break;
//                        }
//                    }
//
//                }
//                break;
//
//                case 2: {
//                    System.out.println("what process you like do it? \n");
//                    System.out.println("---------------------------------- \n");
//                    System.out.println("\t\t\t1) ADD STUDENT  ");
//                    System.out.println("\t\t\t2) LOOKING FOR Student  ");
//                    System.out.println("\t\t\t3) update a Student First Name ");
//                    System.out.println("\t\t\t4) Vew all student ");
//                    System.out.println("\t\t\t5) Delete a Student ");
//                    System.out.println("\t\t\t0) Back to main list ");
//
//                    choose = enter.nextInt();
//                    while (choose != 0) {
//                        switch (choose) {
//                            case 1:
//                                use.add_Student();
//                                break;
//
//                            case 2:{
//
//                                System.out.println("Enter Student ID want looking for");
//                                int id = enter.nextInt();
//
//                                use.search_Student(id);
//                                break;
//                            }
//
//
//
//                            case 3: {
//                                System.out.println("Enter student ID and NEW first name");
//                                int id = enter.nextInt();
//                                String firstName = enter.next();
//                                use.eidt_Student(id, firstName);
//                            }
//                            break;
//
//                            case 4:
//                                 use.view_Student();
//                                break;
//
//                            case 5: {
//                                System.out.println("Enter student ID you want deleted");
//                                int id = enter.nextInt();
//                                use.delet_Student(id);
//                            }
//                            break;
//                            case 0:
//                                break;
//                        }
//                    }
//                }
//                break;
//                //////
//                case 3: {
//                    System.out.print("what process you like do it? \n");
//
//                    while (choose != 0) {
//                        System.out.println("---------------------------------- \n");
//                        System.out.println("\t\t\t1) ADD Book  ");
//                        System.out.println("\t\t\t2) LOOKING FOR Book  ");
//                        System.out.println("\t\t\t3) update a Book Taittle ");
//                        System.out.println("\t\t\t4) Vew all Books ");
//                        System.out.println("\t\t\t5) Delete a Book ");
//                        System.out.println("\t\t\t0) Back to main list ");
//                        choose = enter.nextInt();
//                        switch (choose) {
//                            case 1:
//                                use.add_Book();
//                                break;
//
//                            case 2:
//                                System.out.println("Enter Book ID want looking for");
//                                int id = enter.nextInt();
//                                use.search_Book(id);
//                                break;
//
//                            case 3: {
//                                System.out.println("Enter Book ID and NEW Tittle");
//                                id = enter.nextInt();
//                                String tittle = enter.next();
//                                use.eidt_Book(id, tittle);
//                            }
//                            break;
//
//                            case 4:
//                                use.view_Books();
//                                break;
//
//                            case 5: {
//                                System.out.println("Enter Book ID you want deleted");
//                                id = enter.nextInt();
//                                use.delet_Book(id);
//                            }
//                            break;
//                            case 0:
//                                break;
//
//
//                        }
//                    }
//                }
//                break;
//
//                case 0:
//                    rebate = false;
//                    break;
//                default:
//                    System.out.println("ENTER CORRECT CHOICE PLEASE");
//                    break;
//            }
//
//        }
//
//    }
//
//
//}
//
//
//
