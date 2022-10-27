import java.util.ArrayList;
import java.util.List;

public class ContactsList {


    /*=============================== VARIABLES ================================*/
    public static ArrayList<Contacts> contactsArrayList;

    public static ArrayList<Contacts> getContactsArrayList() {
        return contactsArrayList;
    }

    public static void setContactsArrayList(ArrayList<Contacts> contactsArrayList) {
        ContactsList.contactsArrayList = contactsArrayList;
    }


    /*=============================== METHODS ================================*/

    public static void addContacts(Contacts newContact){
        contactsArrayList.add(newContact);
    }

    public static void addContacts(Contacts newContact,Contacts newContact2,Contacts newContact3){
        contactsArrayList.addAll(List.of(newContact,newContact2,newContact3));
    }

    public ContactsList() {
    }


}// end of contacts list class
