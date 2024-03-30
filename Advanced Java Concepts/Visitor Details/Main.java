//import necessary packages
import java.util.*;
import java.io.*;

 @SuppressWarnings("unchecked")//Do not delete this line
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    boolean isWrite = true;
	    
	    String str[] = null;
	    
	    while(isWrite){
	        
	    System.out.println("Enter Name");
	    String name = sc.nextLine();
	    
	    System.out.println("Enter Phone Number");
	    String mobile = sc.nextLine();
	    
	    System.out.println("Enter Email");
	    String email = sc.nextLine();
	    
	    System.out.println("Do you want to enter another record(yes/no)");
	    String yesOrNo = sc.nextLine();
	    
	    String record = name+","+mobile+","+email+";";
	    File f = FileManager.createFile();
	    FileManager.writeFile(f,record);
	    
	    str = FileManager.readFile(f);
	    
	   // System.out.println(Arrays.toString(str));
	   
	   
	   
	    if(yesOrNo.equals("no")){
	        isWrite = false;
	        break;
	    }
	    else if(yesOrNo.equals("yes")){
	        continue;
	    }
	    else{
	        isWrite = false;
	        break;
	    }
	    }
	    
	    for(String s : str){
	       System.out.println(s);
	   }
	   
	}
    
}
