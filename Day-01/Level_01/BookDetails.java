
 class Book {
    String title;
    String AuthorName;
    int price;

    // Constructor to initialize the BookDetails object
    public Book(String title, String AuthorName, int price) {
        this.title = title;
        this.AuthorName = AuthorName;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title of the Book is: " + title);
        System.out.println("Author Name of the Book is: " + AuthorName);
        System.out.println("Price of the Book is: " + price);
    }
}public class BookDetails {
    public static void main(String[] args) {
        // Creating an instance of Book Class
        Book firstbook = new Book("Godan", "Munshi Premchand", 1500);

        // Displaying book details
        firstbook.display();
    }
}
