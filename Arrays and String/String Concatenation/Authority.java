import java.util.*;

class Authority{
    
    public static boolean validate(String str){
        boolean valid = false;
    if(str!=null && str.matches("[a-zA-z ]+")){
        valid = true;
    }
    return valid;
   }
   
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Inmate's name:");
        String name = input.nextLine();
        
        System.out.println("Inmate's father's name:");
        String fatherName = input.nextLine();
        
        if(validate(name) && validate(fatherName)){
            System.out.println(name.toUpperCase()+" "+fatherName.toUpperCase());
        }
        else{
            System.out.println("Invalid name");
        }
        
        
    }
}
