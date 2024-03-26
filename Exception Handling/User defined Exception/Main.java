import java.util.*;
import java.lang.*;
public class Main{
    
    // public static Scanner sc = new Scanner(System.in);
    
    public static Candidate getCandidateDetails() throws InvalidSalaryException{
        
        Scanner sc = new Scanner(System.in);
        
        Candidate candidate = null;
        
        System.out.println("Enter the candidate Details");
        System.out.println("Name");
        String name = sc.nextLine();
        
        System.out.println("Gender");
        String gender = sc.nextLine();
        
        System.out.println("Expected Salary");
        Double salary = Double.parseDouble(sc.nextLine());
        
       
        
        if(salary<10000){

            throw new InvalidSalaryException("Registration Failed. Salary cannot be less than 10000.");
        }
        else{
             candidate = new Candidate();
             candidate.setName(name);
             candidate.setGender(gender);
            candidate.setExpectedSalary(salary);
        }
        return candidate;
    }
    
    public static void main(String[] args)
    {
        try{
            
            Candidate candidate = getCandidateDetails();
            
            if(candidate != null){
                System.out.println("Registration Successful");
            }
        }catch(InvalidSalaryException e){
            System.out.println(e.getMessage());
        }
    }
}
