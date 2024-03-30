//import the necessary packages if needed
import java.util.*;
     
@SuppressWarnings("unchecked")//Do not delete this line
public class CountOfWords
{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        
        // word = word.replaceAll("[,;:.?!]","");
        // word = word.toLowerCase();
        // System.out.println(word);
        
        
        String words[] = word.split("[ ,;:.?!]");
        // System.out.println(Arrays.toString(words));
        Map<String,Integer> wordMap = new TreeMap<>();
        int wordSize = 0;
        for(String s : words){
            if(!s.isEmpty()){
                s = s.trim();
                int freq = wordMap.getOrDefault(s,0);
                wordMap.put(s,freq+1);
                wordSize++;
            }
        }
        System.out.println("Number of words "+wordSize);
        System.out.println("Words with the count");
        
        for(Map.Entry<String,Integer> e: wordMap.entrySet()){
            System.out.println(e.getKey()+": "+e.getValue());
        }
    }
}
