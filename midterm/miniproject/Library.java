package midterm.miniproject;
import java.util.*;

public class Library {

    ArrayList<Book> books = new ArrayList<>();
    HashSet<String> bookTitles = new HashSet<>();  // unique book titles
    HashMap<String, LinkedList<Book>> borrowRecords = new HashMap<>();
    Queue<Book> borrowQueue = new LinkedList<>();
    Stack<String> actionHistory = new Stack<>();

    // ➤ ADD BOOK
    public void addBook(String id, String title) {
        if (bookTitles.contains(title)) {
            System.out.println("Title already exists!");
            return;
        }
        Book b = new Book(id, title);
        books.add(b);
        bookTitles.add(title);
        actionHistory.push("Added book: " + title);
        System.out.println("Book added successfully!");
    }

    // ➤ VIEW ALL BOOKS
    public void viewBooks() {
        System.out.println("\nLIBRARY BOOKS:");
        for (Book b : books) {
            System.out.println(b.id + " | " + b.title + " | " + (b.isAvailable ? "Available" : "Borrowed"));
        }
    }

    // ➤ UPDATE BOOK TITLE
    public void updateBookTitle(String id, String newTitle) {
        for (Book b : books) {
            if (b.id.equals(id)) {
                if (bookTitles.contains(newTitle)) {
                    System.out.println("Title already exists!");
                    return;
                }
                bookTitles.remove(b.title);
                bookTitles.add(newTitle);
                actionHistory.push("Updated title: " + b.title + " → " + newTitle);
                b.title = newTitle;
                System.out.println("Title updated!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // ➤ DELETE BOOK
    public void deleteBook(String id) {
        for (Book b : books) {
            if (b.id.equals(id)) {
                books.remove(b);
                bookTitles.remove(b.title);
                actionHistory.push("Deleted book: " + b.title);
                System.out.println("Book deleted!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // ➤ ADD BORROWER
    public void addBorrower(String borrower) {
        if (!borrowRecords.containsKey(borrower)) {
            borrowRecords.put(borrower, new LinkedList<>());
            System.out.println("Borrower registered!");
        } else {
            System.out.println("Borrower already registered.");
        }
    }

    // ➤ BORROW BOOK
    public void borrowBook(String borrower, String id) {
        if (!borrowRecords.containsKey(borrower)) {
            System.out.println("Borrower not found!");
            return;
        }
        for (Book b : books) {
            if (b.id.equals(id)) {
                if (!b.isAvailable) {
                    System.out.println("Book already borrowed!");
                    return;
                }
                b.isAvailable = false;
                borrowRecords.get(borrower).add(b);
                borrowQueue.add(b);
                actionHistory.push("Borrowed book: " + b.title);
                System.out.println("Borrow successful!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    // ➤ RETURN BOOK
    public void returnBook(String borrower, String id) {
        if (!borrowRecords.containsKey(borrower)) {
            System.out.println("Borrower not found!");
            return;
        }
        LinkedList<Book> list = borrowRecords.get(borrower);
        for (Book b : list) {
            if (b.id.equals(id)) {
                b.isAvailable = true;
                list.remove(b);
                actionHistory.push("Returned book: " + b.title);
                System.out.println("Book returned!");
                return;
            }
        }
        System.out.println("Borrow record not found!");
    }

    // ➤ VIEW BORROW RECORDS
    public void viewBorrowRecords() {
        System.out.println("\nBORROWING RECORDS:");
        for (String borrower : borrowRecords.keySet()) {
            System.out.println("Borrower: " + borrower);
            for (Book b : borrowRecords.get(borrower)) {
                System.out.println(" - " + b.title);
            }
        }
    }
}
