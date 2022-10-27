import java.util.ArrayList;
import java.util.List;

public class Contacts {
    // Comment for commit
    /*=============================== VARIABLES / SETTERS / GETTERS ================================*/
    // Contact phone number variable
    protected int phoneNumber;

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    // Contact name variable
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*=============================== METHODS ================================*/



    /*=============================== CONSTRUCTORS ================================*/

    public Contacts() {
    }
    // constructor to make a new contact and set name and phone number
    public Contacts(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }


}
