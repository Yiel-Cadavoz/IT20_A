package midterm.LibraryBorrowingSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        Library hub = new Library();
        int choice;
        
        while (true) {
            System.out.println("\n===== LIBRARY BORROWING SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Change Book Title");
            System.out.println("4. Remove Book");
            System.out.println("5. Register Borrower");
            System.out.println("6. Borrow Book");
            System.out.println("7. Return Book");
            System.out.println("8. View Borrow Records");
            System.out.println("9. View Activity Log"); 
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = a.nextInt();
            a.nextLine();
            
            switch (choice){
                case 1 -> {
                    System.out.print("Enter Book ID: ");
                    String bookId = a.nextLine();
                    System.out.print("Enter Book Title: ");
                    String bookTitle = a.nextLine();
                    hub.addBook(bookId, bookTitle);
                }
                case 2 -> hub.libraryBooks();
                case 3 -> {
                    System.out.print("Enter Book ID: ");
                    String bookId = a.nextLine();
                    System.out.print("Enter New Title: ");
                    String bookTitle = a.nextLine();
                    hub.changeBookTitle(bookId,bookTitle);
                }
                case 4 -> {
                    System.out.print("Enter Book ID: ");
                    String bookId = a.nextLine();
                    hub.removeBook(bookId);
                }
                case 5 -> {
                    System.out.print("Enter Borrower Name: ");
                    String borrower = a.nextLine();
                    hub.registerBorrower(borrower);
                }
                case 6 -> {
                    System.out.print("Enter Borrower Name: ");
                    String borrower = a.nextLine();
                    hub.libraryBooks();
                    System.out.print("Enter Book ID: ");
                    String bookId = a.nextLine();
                    hub.borrowBook(borrower, bookId);
                }
                case 7 -> {
                    System.out.print("Enter Borrower Name: ");
                    String borrower = a.nextLine();
                    System.out.print("Enter Book ID: ");
                    String bookId = a.nextLine();
                    hub.returnBook(borrower, bookId);
                }
                case 8 -> hub.viewBorrowRecords();
                case 9 -> hub.viewActivityLog();   
                case 0 -> {
                    System.out.println("Exiting... Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            
            }
        }
    }
}
