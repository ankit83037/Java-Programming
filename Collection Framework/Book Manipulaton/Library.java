import java.util.*;

public class Library{
    
    private ArrayList<Book> bookList = new  ArrayList<Book>();
    
    public ArrayList<Book> getBookList(){
        return this.bookList;
    }
    
    public void setBookList(ArrayList<Book> bookList){
        this.bookList = bookList;
    }
    
    public void addBook(Book bobj){
        bookList.add(bobj);
    }
    
    public boolean isEmpty(){
        return bookList.isEmpty();
    }
    
    public ArrayList<Book> viewAllBooks(){
        return bookList;
    }
    
    public ArrayList<Book> viewBooksByAuthor(String author ){
        ArrayList<Book> bookByAuthorList = new ArrayList<>();
        for(Book b : bookList){
            if(b.getAuthor().equals(author)){
                bookByAuthorList.add(b);
            }
        }
        
        return bookByAuthorList;
    }
    
    public int countnoofbook(String bname){
        int countBook = 0;
        for(Book b : bookList){
            if(b.getBookName().equals(bname)){
                countBook++;
            }
        }
        return countBook;
    }
    
}
