package Address_Book_System;

import java.util.ArrayList;
import java.util.Iterator;

public class Delete_Contact {
    public void deleteContact(ArrayList<ContactPerson> contact_list, String fname, String lname){

        Iterator<ContactPerson> iterator = contact_list.iterator();

//        for(ContactPerson contact : contact_list){
//            if(contact.getFname().equalsIgnoreCase(fname) && contact.getLname().equalsIgnoreCase(lname)){
//                contact_list.remove(contact);
//                System.out.println("Contact Deleted Successfully");
//            }
//        }

        while (iterator.hasNext()) {
            ContactPerson contact = iterator.next();
            if (contact.getFname().equalsIgnoreCase(fname) && contact.getLname().equalsIgnoreCase(lname)) {
                iterator.remove(); // Safe removal
                System.out.println("Contact Deleted Successfully");
            }
        }
    }
}
