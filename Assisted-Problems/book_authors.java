class Book {
    String title;
    int publicationYear;
    public Book(String title , int publicationYear){
        this.title =title;
        this.publicationYear = publicationYear;
    }
    void displayInfo(){
        System.out.println("Tht title of book is :" + title);
        System.out.println("The Publication Year : " + publicationYear);
    }
}
class Author extends Book{
    String authorName;
    public Author(String title , int publiationYear ,String authorName ){
        super(title,publiationYear);
        this.authorName = authorName;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("The Name of the author is: "+ authorName);
    }
}
public class book_authors {
    public static void main(String[] args) {
       Book book1 = new Author("Godan",1968,"Munshi Premchand");
       book1.displayInfo();
    }
}
