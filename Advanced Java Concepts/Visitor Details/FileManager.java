 //import necessary packages
 import java.io.*;
 import java.util.*;
 
 @SuppressWarnings("unchecked")//Do not delete this line
 public class FileManager 
 {
    
     static public File createFile()
    {
        File file = null;
        try{
            
        file = new File("visitors.txt");
        file.createNewFile();
        // if(fileCreated){
        //     System.out.println("File created");
        // }
        // else{
        //     System.out.println("File not created");
        // }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    
    return file; //change the return type as per the requirement    
    }
    
     static public void writeFile(File f, String record)
	{
	    try{
	        
	    FileWriter fw = new FileWriter(f,true);
	    fw.write(record);
	    fw.flush();
	   // fw.write(",");
	    }
	    catch(Exception e){
	        System.out.println(e.getMessage());
	    }
	} 
	
	 static public String[] readFile(File f)
	{
	    String str = "";
	    try{
	        
	    Scanner sc = new Scanner(f);
	    
	    int i=0;
	    while(sc.hasNextLine()){
	        str = sc.nextLine();
	    }
	    }
	    catch(Exception e){
	        System.out.println(e.getMessage());
	    }
	    
	    String details[] = str.split(";");
	    return details; //change the return type as per the requirement  
	}
 }
