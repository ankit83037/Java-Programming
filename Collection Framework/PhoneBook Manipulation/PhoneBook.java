import java.util.*;
public class PhoneBook{
    private List<Contact> phoneBook = new ArrayList<Contact>();
    
    public List<Contact> getPhoneBook(){
        return phoneBook;
    }
    
    public void setPhoneBook(List<Contact> phoneBook){
        this.phoneBook = phoneBook;
    }
    
    public void addContact(Contact contactObj){
        this.phoneBook.add(contactObj);
    }
    
    public List<Contact> viewAllContacts(){
        return phoneBook;
    }
    
    public Contact viewContactGivenPhone(long phoneNumber){
         Contact contactObj = null;
        for(Contact contact: this.phoneBook){
            long phone = (long)contact.getPhoneNumber();
            if(phoneNumber == phone){
                contactObj = contact;
                return contactObj;
            }
        }
        return contactObj;
    } 
    
    public boolean removeContact(long phoneNumber){
            boolean isRemoveContact = false;
        for(int i=0;i<this.phoneBook.size();i++){
            long phone = (long)phoneBook.get(i).getPhoneNumber();
            if(phoneNumber == phone){
                this.phoneBook.remove(phoneBook.get(i));
                isRemoveContact = true;
            }
        }
        return isRemoveContact;
    } 
}
