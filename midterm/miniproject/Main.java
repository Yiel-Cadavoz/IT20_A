package midterm.miniproject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library lib = new Library();
        int choice;

        while (true) {
            System.out.println("\n===== LIBRARY BORROWING SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book Title");
            System.out.println("4. Delete Book");
            System.out.println("5. Register Borrower");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. View Borrow Records");
            System.out.println("9. View Activity Log"); 
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    String id = in.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = in.nextLine();
                    lib.addBook(id, title);
                }
                case 2 -> lib.viewBooks();
                case 3 -> {
                    System.out.print("Enter Book ID: ");
                    String id = in.nextLine();
                    System.out.print("Enter New Title: ");
                    String title = in.nextLine();
                    lib.updateBookTitle(id, title);
                }
                case 4 -> {
                    System.out.print("Enter Book ID: ");
                    String id = in.nextLine();
                    lib.deleteBook(id);
                }
                case 5 -> {
                    System.out.print("Enter Borrower Name: ");
                    String borrower = in.nextLine();
                    lib.addBorrower(borrower);
                }
                case 6 -> {
                    System.out.print("Enter Borrower Name: ");
                    String borrower = in.nextLine();
                    System.out.print("Enter Book ID: ");
                    String id = in.nextLine();
                    lib.borrowBook(borrower, id);
                }
                case 7 -> {
                    System.out.print("Enter Borrower Name: ");
                    String borrower = in.nextLine();
                    System.out.print("Enter Book ID: ");
                    String id = in.nextLine();
                    lib.returnBook(borrower, id);
                }
                case 8 -> lib.viewBorrowRecords();
                case 9 -> lib.viewActivityLog();   
                case 0 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }
}
