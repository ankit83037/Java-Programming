import java.util.*;
public class StudentMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Id:");
        int id = sc.nextInt();
        
        System.out.println("Enter Student's Name:");
        String name = sc.next();
        
        System.out.println("Enter Student's Address:");
        String address = sc.next();
        Student sb = null;
        
        boolean correctInput = false;
        while(!correctInput){
                
        System.out.println("Whether the student is from NIT(Yes/No):");
        String nitCollege = sc.next();
        String collegeName = "";
    
        if(nitCollege.toLowerCase().equals("no")){
            System.out.println("Enter the college name:");
            collegeName = sc.next();
            // System.out.println("collegeNameCheck "+collegeName);
            sb = new Student(id,name,address,collegeName);
            correctInput = !correctInput;
        }
        else if(nitCollege.toLowerCase().equals("yes")){
            sb = new Student(id,name,address);
            correctInput = !correctInput;
        }
        else{
            System.out.println("Wrong Input");
            
        }
            }
            
       System.out.println("Student id:"+sb.getStudentId());
       System.out.println("Student name:"+sb.getStudentName());
       System.out.println("Address:"+sb.getStudentAddress());
       System.out.println("College name:"+sb.getCollegeName());
       
        
        
    }
}
