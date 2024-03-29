import java.util.*;

class Placement{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Map<String,Integer> mp = new LinkedHashMap<>();
        
        System.out.println("Enter the no of students placed in CSE:");
        int a = input.nextInt();
        mp.put("CSE",a);
        System.out.println("");
        
        System.out.println("Enter the no of students placed in ECE:");
        int b = input.nextInt();
        mp.put("ECE",b);
        
        System.out.println("Enter the no of students placed in MECH:");
        int c = input.nextInt();
        mp.put("MECH",c);
        System.out.println("");
        
        ArrayList al = new ArrayList(mp.values());
        Collections.sort(al);
        
        int maxPlacement = (int)(al.get(al.size()-1));
        
        boolean samePlacement = true;
        boolean invalidInput = false;
        for(Object i: al){
            if((int)i!=maxPlacement){
                samePlacement = false;
            }
             if((int)i<0){
                invalidInput = true;
            }
        }
        
        if(invalidInput){
            System.out.println("Input is invalid");
        }
        else{
            if(samePlacement){
                System.out.println("None of the department has got the highest placement");
            }
            else{
                System.out.println("Highest placement");
             for(Map.Entry e: mp.entrySet()){
              if((int)e.getValue()==maxPlacement){
                  System.out.println(e.getKey());
              }
              }   
            }
        }   
        
    }
}
