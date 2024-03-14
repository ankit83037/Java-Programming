import java.util.*;

public class Test{
    
    public static double calculateAverage(int[] age){
        double sum = 0;
        for(int i:age){
            sum+=i;
        }
        // System.out.println(sum);
        return sum/(double)age.length;
    }
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no.of employees:");
        int n = Integer.parseInt(sc.nextLine());
        
        if(n<2){
            System.out.println("Please enter a valid employee count");
            return;
        }
            int[] arr = new int[n];
            System.out.println("Enter the age for "+n+" employees:");
            for(int i=0;i<n;i++){
                int age = sc.nextInt();
                if(age<28 || age>40){
                    System.out.println("Invalid age encountered!");
                    return;
                }
                arr[i] = age;
            }
            
            double avgAge = calculateAverage(arr);
            System.out.printf("The average age is %.2f", avgAge);
        
    }
}
