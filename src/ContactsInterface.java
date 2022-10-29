public interface ContactsInterface {
    // Added by Mason
    public String getPath();

    public String getPathFile();

    public String getPathDirectory();

    public void createPath();

    public void createFile();

    public boolean pathExists();

    public void addContact();

    public void deleteContact();

    public void promptUser();

    public void readFile();
    // Added by Mason

    // Added by Aaron
    public void printContacts();
}
