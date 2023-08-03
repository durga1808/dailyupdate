import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in the Library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null; // Book not found
    }
}

public class LibraryExample {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("Java Programming", "John Smith"));
        library.addBook(new Book("Python Basics", "Alice Johnson"));
        library.addBook(new Book("Data Structures", "Bob Williams"));

        // Displaying all books in the library
        library.displayBooks();

        // Searching for a book by title
        String searchTitle = "Java Programming";
        Book foundBook = library.findBookByTitle(searchTitle);
        if (foundBook != null) {
            System.out.println("Found book: " + foundBook);
        } else {
            System.out.println("Book with title \"" + searchTitle + "\" not found.");
        }
    }
}
