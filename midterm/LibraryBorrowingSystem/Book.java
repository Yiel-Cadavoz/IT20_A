package midterm.LibraryBorrowingSystem;

public class Book {
    String bookId;
    String bookTitle;
    boolean isAvailable = true;
    
    public Book(String bookId, String bookTitle){
        this.bookId = bookId;
        this.bookTitle = bookTitle;
    }
}
