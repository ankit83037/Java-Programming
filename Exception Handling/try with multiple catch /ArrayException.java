 import java.util.*;
 public class ArrayException{
     
     public String getPriceDetails(){
         String message = "";
         try{
             
             Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of elements in the array");
         int n = sc.nextInt();
         
         System.out.println("Enter the price details");;
         int arr[] = new int[n];
         
         for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
         }
         
         System.out.println("Enter the index of the array element you want to access");
         int index = sc.nextInt();
         
          message = "The array element is "+arr[index];
        
         }
         catch(InputMismatchException e){
             message = "Input was not in the correct format";
            
         }
         catch(ArrayIndexOutOfBoundsException e){
             message =  "Array index is out of range";
             
         } 
         return message;
     }
     
     public static void main(String args[]){
         
         
             ArrayException a = new ArrayException();
             String str = a.getPriceDetails();
             System.out.println(str);
         
         
     }
 }
