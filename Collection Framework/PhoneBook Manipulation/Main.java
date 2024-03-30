import java.util.*;
public class Main{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isMenu = true;
        
        Contact contact = null;
        PhoneBook phoneBook = new PhoneBook();
            
        while(isMenu)
        {
            System.out.println("Menu");;
            System.out.println("1.Add Contact");
            System.out.println("2.Display all contacts");
            System.out.println("3.Search contact by phone ");
            System.out.println("4.Remove contact");
            System.out.println("5.Exit");
            
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(sc.nextLine());
            
            
            long phone = 0;
            switch(choice){
                case 1:
                    System.out.println("Add a Contact:");
                    
                    System.out.print("Enter the First Name: ");
                    String firstName = sc.nextLine();
                    System.out.println("");
                    
                    System.out.print("Enter the Last Name: ");
                    String lastName = sc.nextLine();
                    System.out.println("");
                    
                    System.out.println("Enter the Phone No.:");
                    long phoneNumber = Long.parseLong(sc.nextLine());
                    // System.out.println("");
                    
                    System.out.println("Enter the Email:");
                    String email = sc.nextLine();
                    // System.out.println("");
                    
                    contact = new Contact(firstName,lastName,phoneNumber,email);
                    phoneBook.addContact(contact);
                    break;
                    
                case 2:
                    System.out.println("The contacts in the List are: ");
                    
                    // phoneBook = new PhoneBook();
                    List<Contact> contactList = phoneBook.viewAllContacts();
                    
                    for(Contact contactlist : contactList){
                        
                    System.out.println("First Name: "+contactlist.getFirstName());
                    System.out.println("Last Name: "+contactlist.getLastName());
                    System.out.println("Phone NO.: "+contactlist.getPhoneNumber());
                    System.out.println("Email: "+contactlist.getEmailId());
                    }
                    break;
                    
                case 3: 
                    System.out.print("Enter the Phone number to search contact:");
                    phone = Long.parseLong(sc.nextLine());
                    // phoneBook = new PhoneBook();
                    contact = phoneBook.viewContactGivenPhone(phone);
                    
                    System.out.println(contact);
                    if(contact != null){
                    // for(Contact contactlist1 : contact){
                        
                    System.out.println("First Name: "+contact.getFirstName());
                    System.out.println("Last Name: "+contact.getLastName());
                    System.out.println("Phone NO.: "+contact.getPhoneNumber());
                    System.out.println("Email: "+contact.getEmailId());
                    // }
                    }
                    
                    
                    break;
                    
                case 4: 
                    System.out.println("Enter the Phone number to remove :");
                    
                    phone = Long.parseLong(sc.nextLine());
                    System.out.println("Do you want to remove the contact (Y/N): ");
                    String yesOrNO = sc.nextLine();
                    
                    if(yesOrNO.equals("Y")){
                        // phoneBook = new PhoneBook();
                        if(phoneBook.removeContact(phone)){
                            System.out.println("The contact is successfully deleted.");
                        }
                    }
                    break;
                    
                case 5:
                    isMenu = false;
            }
        }
        
        
        
        
    }
}
