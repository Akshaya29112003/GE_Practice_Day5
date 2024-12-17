package Address_Book_System;

import java.util.ArrayList;

public class Add_Contact {
    public ArrayList<ContactPerson> contact_list;

    public Add_Contact() {
        this.contact_list = new ArrayList<>();
    }

    // Getter to return the contact_list
    public ArrayList<ContactPerson> getContactList() {
        return contact_list;
    }
    public void addContact(ContactPerson new_contact){
        contact_list.add(new_contact);
        System.out.println("Contact Added Successfully");
    }
}
