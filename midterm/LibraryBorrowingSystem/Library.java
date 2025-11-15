package midterm.LibraryBorrowingSystem;
import java.util.*;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    HashSet<String> titles = new HashSet<>();
    HashMap<String, LinkedList<Book>> borrowRecords = new HashMap<>();
    Queue<Book> borrowQueue = new LinkedList<>();
    Stack<String> activityLog = new Stack<>();
    
    
    public void addBook(String bookId, String bookTitle){
        if (titles.contains(bookTitle)){
            System.out.println("Title already exist!");
            return;
        }
        Book b = new Book(bookId, bookTitle);
        books.add(b);
        titles.add(bookTitle);
        activityLog.push("Added book: " + bookTitle);
        System.out.println("A new book has been added successfully!");
    }
    
    public void libraryBooks(){
        System.out.println("\nLIBRARY BOOKS:");
        for (Book b : books){
            System.out.println(b.bookId + " | " + b.bookTitle + " | " + (b.isAvailable ? "Available" : "Borrowed"));
        }
    }
    
    public void changeBookTitle(String bookId, String newTitle){
        for (Book b : books){
            if (b.bookId.equals(bookId)){
                if (titles.contains(newTitle)){
                    System.out.println("Title already exists!");
                    return;
                }
                titles.remove(b.bookTitle);
                titles.add(newTitle);
                activityLog.push("New title: " + b.bookTitle + " -> " + newTitle);
                b.bookTitle = newTitle;
                System.out.println("Title has been changed!");
                return;
            }
        }
        System.out.println("Book does not exist!");
    }
    
    public void removeBook(String bookId){
        for (Book b : books){
            if (b.bookId.equals(bookId)){
                books.remove(b);
                titles.remove(b.bookTitle);
                activityLog.push("Deleted book: " + b.bookTitle);
                System.out.println("Book deleted!");
                return;
            }
        }
        System.out.println("Book not found!");
    }
    
    public void registerBorrower(String borrower){
        if (!borrowRecords.containsKey(borrower)){
            borrowRecords.put(borrower, new LinkedList<>());
            System.out.println("Borrower registered!");
        } else{
            System.out.println("Borrower already registered!");
        }
        activityLog.push("Registered new borrower: " + borrower);
    }
    
    public void borrowBook(String borrower, String bookId){
        if (!borrowRecords.containsKey(borrower)){
            System.out.println("Borrower not found!");
            return;
        }
        
        for (Book b : books){
            if (b.bookId.equals(bookId)){
                if (!b.isAvailable){
                    System.out.println("Book already borrowed!");
                    return;
                }
                b.isAvailable = false;
                borrowRecords.get(borrower).add(b);
                borrowQueue.add(b);
                activityLog.push("Borrowed book: " + b.bookTitle);
                System.out.println("Borrow successful!");
                return;
            }
        }
        System.out.println("Book not found!");
    }
    
    public void returnBook(String borrower, String bookId){
        if (!borrowRecords.containsKey(borrower)){
            System.out.println("Borrower not yet registered!");
            return;
        }
        LinkedList<Book> list = borrowRecords.get(borrower);
        for (Book b : list){
            if (b.bookId.equals(bookId)){
                b.isAvailable = true;
                list.remove(b);
                activityLog.push("Returned book: " + b.bookTitle);
                System.out.println("Book returned!");
                return;
            }
        }
        System.out.println("Borrow record not found!");
    }
    
    public void viewBorrowRecords(){
        System.out.println("\nBORROWING RECORDS:");
        for (String borrower : borrowRecords.keySet()){
            System.out.println("Borrower: " + borrower);
            for (Book b : borrowRecords.get(borrower)){
                System.out.println(" - " + b.bookId + " | " + b.bookTitle);
            }
        }
    }
    
    public void viewActivityLog(){
        System.out.println("\n===== ACTIVITY LOG =====");
        if (activityLog.isEmpty()){
            System.out.println("No recorded activities yet.");
            return;
        }
        for (String activity : activityLog) {
            System.out.println("> " + activity);
        }
    }
}
