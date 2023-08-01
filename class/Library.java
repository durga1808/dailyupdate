
public class Library {
    public static void main(String[] args) {
        // Create Book objects
        Book book1 = new Book("Java: The Complete Reference", "Herbert Schildt", 2019);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 2008);

        // Access and display book details
        System.out.println("Book 1 details:");
        book1.displayDetails();

        System.out.println("\nBook 2 details:");
        book2.displayDetails();
    }
}
