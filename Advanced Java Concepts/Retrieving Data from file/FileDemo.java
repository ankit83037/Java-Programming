import java.io.*;
import java.util.*;

public class FileDemo
{
    public static void main(String[] args)
    {
        try{
        // FileReader f = new FileReader("log.txt");
        // BufferedReader b = new BufferedReader(f);
        
        // while(true){
        //     String str = b.readLine();
        //     if(str!=null)
        //      System.out.println(str);
        //     else 
        //       break;
        // }
        
        File f = new File("log.txt");
        Scanner sc = new Scanner(f);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
