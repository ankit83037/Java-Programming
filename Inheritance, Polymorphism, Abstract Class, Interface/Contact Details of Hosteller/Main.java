import java.util.*;
public class Main{
    
    static Scanner sc = new Scanner(System.in);
    public static Hosteller getHostellerDetails(){
        Hosteller hs = new Hosteller();
        System.out.println("Enter the Details:");
        System.out.println("Student Id");
        int id = sc.nextInt();
        sc.nextLine();
        
        hs.setStudentId(id);
        
        System.out.println("Student Name");;
        String name = sc.nextLine();
        hs.setName(name);
        
        System.out.println("Department Id");
        int deptId = sc.nextInt();
        hs.setDepartmentId(deptId);
        
        System.out.println("Gender");
        String gender = sc.next();
        hs.setGender(gender);
        
        System.out.println("Phone Number");
        String phone = sc.next();
        hs.setPhone(phone);
        
        System.out.println("Hostel Name");
        String hostelName = sc.next();
        hs.setHostelName(hostelName);
        
        System.out.println("Room Number");
        int roomNo = sc.nextInt();
        hs.setRoomNumber(roomNo);
        
        
        return hs;
        
    }
    
    public static void main(String args[]){
        Hosteller hs = Main.getHostellerDetails();
        System.out.println("Modify Room Number(Y/N)");
        String modifyRoom = sc.next();
        
        if(modifyRoom.equals("Y")){
            System.out.println("New Room Number");
            int newRoomNo = sc.nextInt();
            hs.setRoomNumber(newRoomNo);
        }
        
        System.out.println("Modify Phone Number(Y/N)");
        String modifyPhone = sc.next();
        
        if(modifyPhone.equals("Y")){
            System.out.println("New Phone Number(Y/N)");
            String newPhone = sc.next();
            hs.setPhone(newPhone);
        }
        
        System.out.println("The Student Details");
        System.out.println(hs.getStudentId()+" "+hs.getName()+" "+
        hs.getDepartmentId()+" "+
        hs.getGender()+" "+
        hs.getPhone()+" "+
        hs.getHostelName()+" "+
        hs.getRoomNumber()+" "
        );
        
    }
}
