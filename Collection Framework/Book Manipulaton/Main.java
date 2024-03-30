import java.util.*;

public class Main{
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        boolean isMenu = true;
        
        Library l = new Library();
        
        while(isMenu){
            System.out.println("1.Add Book");
            System.out.println("2.Display all book details");
            System.out.println("3.Search Book by author ");
            System.out.println("4.Count number of books - by book name");
            System.out.println("5.Exit");
            
            System.out.println("Enter your choice:");
            int choice = Integer.parseInt(sc.nextLine());
            
            
            switch(choice){
                case 1:
                    System.out.println("Enter the isbn no:");
                    int isbnno = Integer.parseInt(sc.nextLine());
                    
                    System.out.println("Enter the book name:");
                    String book = sc.nextLine();
                    
                    System.out.println("Enter the author name:");
                    String author = sc.nextLine();
                    
                    Book b = new Book();
                    b.setIsbnno(isbnno);
                    b.setBookName(book);
                    b.setAuthor(author);
                    
                    l.addBook(b);
                    
                    break;
                    
                case 2:
                    ArrayList<Book> al = l.viewAllBooks();
                    
                    for(Book bObj: al){
                        System.out.println("ISBN no: " + bObj.getIsbnno());
                        System.out.println("Book name:" + bObj.getBookName());
                        System.out.println("Author name: " + bObj.getAuthor());
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter the author name:");
                    String authorName = sc.nextLine();
                    
                    ArrayList<Book> alList = l.viewBooksByAuthor(authorName);
                    
                    if(alList.size()==0){
                       System.out.println("The list is empty");
                    }else{
                        for(Book bOb: alList){
                        System.out.println("ISBN no: " + bOb.getIsbnno());
                        System.out.println("Book name:" + bOb.getBookName());
                        System.out.println("Author name: " + bOb.getAuthor());
                       }
                    }
                    break;
                    
                case 4:
                    String bookName = sc.nextLine();
                    System.out.println(l.countnoofbook(bookName));
                    break;
                    
                case 5:
                    isMenu = false;
                    
            }
        }
    }
}
