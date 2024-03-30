import java.util.*;
public class ValidateUtility
{
    public static void main(String args[])
    {
        //fill code here
        Scanner sc = new Scanner(System.in);
        String empName = sc.nextLine();
        String prodName = sc.nextLine();
        Validate empNameValid = validateEmployeeName();
        if(empNameValid.validateName(empName)){
            System.out.println("Employee name is valid");
        }else{
            System.out.println("Employee name is invalid");
        }
        
        Validate prodNameValid = validateProductName();
        if(prodNameValid.validateName(prodName)){
            System.out.println("Product name is valid");
        }else{
            System.out.println("Product name is invalid");
        }
        
    }
    
    public static Validate validateEmployeeName() 
    {
        //fill code here
        Validate valid = (name)-> name.matches("[a-zA-Z\\s]{5,20}");
        return valid;
    }
    
    public static Validate validateProductName() 
    {
        //fill code here
        Validate valid = name -> name.matches("^[a-zA-Z][\\d]{5}");
        return valid;
    }
}
