public class ContactsApp {
    public static void main(String[] args) {
        ContactsMethods test = new ContactsMethods();
//        System.out.println(test.pathExists("contactsPackage"));
        System.out.println(test.pathExists("contactsPackage/contactlist.txt"));
        test.readFile("contactsPackage/contactlist.txt");







    }// end of main
}// end of class
