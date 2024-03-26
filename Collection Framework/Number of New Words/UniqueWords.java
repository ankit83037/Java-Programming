//import the necessary packages if needed
import java.util.*;
     
@SuppressWarnings("unchecked")//Do not delete this line
public class UniqueWords
{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Student's Article");
        // sc.nextLine();
        String article = sc.nextLine();
        article = article.replaceAll("[,;:.?!]","");
        
        // System.out.println(article);
        
        String word[] = article.split(" ");
        // System.out.println(Arrays.toString(word));
        
        Set<String> wordSet = new TreeSet<>();
        
        for(String str: word){
            wordSet.add(str.toLowerCase().trim());
        }
        
        System.out.println("Number of words "+word.length);
        System.out.println("Number of unique words "+wordSet.size());
        System.out.println("The words are");
        int index = 1;
        for(String element: wordSet){
            System.out.println(index++ +"."+" "+element);
        }
    }
         
}
