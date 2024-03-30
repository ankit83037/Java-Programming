import java.util.*;


public class UserInterface {
    
    public static TuitionFee generateFeeReceipt(){
    TuitionFee tf = (courseType,basicFee,noOfSemesters)->{
        int totalFee = 0;
       if(courseType.equalsIgnoreCase("regular")){
           totalFee = basicFee*noOfSemesters;
       }else{
           totalFee = (basicFee*noOfSemesters)+50000;
       }
       return totalFee;
    };
    return tf;
}

    public static void main(String args[]) {
        
    // Fill the code here
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter registration number");
    String num = sc.nextLine();
    
    System.out.println("Enter student name");
    String name = sc.nextLine();
    
    System.out.println("Enter no of semesters");
    int sem = Integer.parseInt(sc.nextLine());
    
    System.out.println("Enter basic fee");
    int fee = Integer.parseInt(sc.nextLine());
    
    System.out.println("course type");
    String course = sc.nextLine();
    
    TuitionFee tf = generateFeeReceipt();
    int totalFee = tf.calculateTuitionFees(course,fee,sem);
    
    System.out.println("Fees Receipt");
    System.out.println("Registration number: "+ num);
    System.out.println("Student name: "+ name);
    System.out.println("Tuition fee for "+course+" student: "+ totalFee);
    
    
    
    }
    
}
