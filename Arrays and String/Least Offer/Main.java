import java.util.*;
import java.lang.*;
public class Main{
    public static void main (String[] args) {
     Scanner sc=new Scanner(System.in);
         
     // Fill the code here
     
     //int n = sc.nextInt();
      int n = Integer.parseInt(sc.nextLine());
     String item[][] = new String[n][3];
     
     for(int i=0;i<n;i++){
         String str = sc.next();
     
         String input[] = str.split(",") ;
       // System.out.println(input[i]);
         for(int j=0;j<3;j++){
             
             item[i][j] = input[j];
       
         }
     }
     
     int minDiscount = Integer.MAX_VALUE;
     Map<String,Integer> mp = new LinkedHashMap<>();
     
     for(int i=0;i<n;i++){
         int price = Integer.parseInt(item[i][1]);
         
         int discount = Integer.parseInt(item[i][2]);
         int value = (discount*price)/100;
         minDiscount = Math.min(minDiscount,value);
         mp.put(String.valueOf(item[i][0]),value);
     }
     
     for(Map.Entry e: mp.entrySet()){
         if((int)e.getValue() == minDiscount){
             System.out.println(e.getKey());
         }
     }
    }
}
