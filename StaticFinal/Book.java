public class Book{
	//Making static keyword for library
  static String libraryName = "Padho Libray";
  
  String author;
  String title ;
  
  //Making isbn final 
  final String isbn;
  
  //Constructor to intialise the objects
  public Book(String title,String author , String isbn){
     this.author = author;
	 this.title = title;
	 this.isbn =  isbn;
	}
	//Static method to display name of library
	public static void displayName(){
	   System.out.println("Libray Name " + libraryName);
	}
    
	//Method to display details of books
  public void displayBook(){
    if(this instanceof Book){
        System.out.println("Libray Name  " + libraryName);	
        System.out.println("Title " + title);
		System.out.println("Author " + author);
		System.out.println("ISBN : " + isbn);
	}else{
          System.out.println("The object doesn't belong to book instance");
        }
    }		
	public static void main(String [] args){
		//Printing name of library
	   Book.displayName();
	   
	   System.out.println();
	   
	   //Creating object to set the details 
	   Book book1 = new Book("Games of Thrones" , "George R.R. Martin" , "PL1287");
	   Book book2 = new Book("Lord of the Rings " , "William Golding" , "PL1876");
	   
	   //Displaying the details of books 
	   book1.displayBook();
	   System.out.println();
	   book2.displayBook();
	   
	    // Check instanceof operator on a valid object
        if (book1 instanceof Book) {
            System.out.println("book1 is an instance of the Book class.");
        }

        // Attempt to check instanceof on a null reference
        Book book3 = null;
        if (book3 instanceof Book) {
            System.out.println("book3 is an instance of the Book class.");
        } else {
            System.out.println("book3 is not a valid instance.");
        }
	}
}	