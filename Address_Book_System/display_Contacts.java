package Address_Book_System;
import java.util.ArrayList;

public class display_Contacts {

    ArrayList<ContactPerson> contact_list;
    public void displayContacts(ArrayList<ContactPerson> contact_list){
        System.out.println("Contacts in Address Book:");
        for(ContactPerson contact : contact_list){
            System.out.println(contact+ "\n");
        }
    }
}
