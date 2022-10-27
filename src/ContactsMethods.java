import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsMethods extends Contacts implements ContactsInterface{
    static Path p = Paths.get("src", "contactsPackage", "contactlist.txt");


    @Override
    public String getPath() {
        return null;
    }

    @Override
    public void createPath() {

    }

    @Override
    public void createFile() {

    }

    @Override
    public boolean pathExists() {
        return false;
    }

    @Override
    public void addContact() {

    }

    @Override
    public void deleteContact() {

    }

    @Override
    public void promptUser() {

    }

    @Override
    public void printContacts(){

    }
    @Override
    public void readFile(){}
//    @Override
//    public void promptUser(){
//
//    }

//    public static void main(String[] args) {
//        promptUser();
//    }

    public void contactsDisplay() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contacts> contactsList = new ArrayList<>();
        String userChoice = "timmmmmmmmeee";

        while (!userChoice.equals("5")) {
            System.out.println("What would you like to do");
            System.out.println("1 - View contacts.");
            System.out.println("2 - Add a new contact");
            System.out.println("3 - Search a contact by name.");
            System.out.println("4 - Delete an existing contact.");
            System.out.println("5 - Exit.");
            System.out.println("Enter an option (1, 2, 3, 4 or 5 ");
            userChoice = scanner.next();

            switch (userChoice) {
                case "0" -> {
                    System.out.println(0);
                }
                case "1" -> {
                    System.out.println(1);
                }
                case "2" -> {
                    System.out.println(2);
                }
                case "3" -> {
                    System.out.println(3);
                }
                case "4" -> {
                    System.out.println(4);
                }
                case "5" -> {
                    System.out.println(5);
                }
                default -> {
                    System.out.println("Wrong input you Dummy");
                    contactsDisplay();
                }
            }
        }
    }

    public ContactsMethods() {
    }

    public boolean pathExists(String directory, String fileName){
//         boolean pathExist = Files.exists(Paths.get("src", directory,fileName));
         return Files.exists(Paths.get("src", directory, fileName));
        }
     public boolean pathExists(String directory){
//         boolean pathExist = Files.exists(Paths.get("src", directory));
         return Files.exists(Paths.get("src", directory));
     }

     public Path getPath(String directory){
//        Path dataDirectory = Paths.get(directory);
//         System.out.println(dataDirectory.toAbsolutePath());
         return Paths.get(directory);
     }

     public Path getPath(String directory, String file){
        return Paths.get(directory, file);
     }

     public Path getAbsolutePath (String path){
         System.out.println(getPath(path).toAbsolutePath());
         return getPath(path).toAbsolutePath();
     }

    // Make a method that reads selected file/path
    public void readFile(String path){
        List<String> lines;

            try {
                if (pathExists(path)){ /* If the path parameter exists (as a string) */
                    Path newPath = getPath(path); // set newPath as getPath(path), which returns a
                    lines = Files.readAllLines(newPath);
                    for (String line : lines) {
                        System.out.println(line);
                    }
                } // End If
            } // End Try

            catch (Exception e){
                e.printStackTrace();
                System.out.println("Check path or file");
            } // End catch

    } // End readFile method


    public void readFile (String path, String file) {
        List<String> lines = new ArrayList<>();
        try {
            if (pathExists(path, file)){ /* If the path parameter exists (as a string) */
                Path p = getPath(path, file); // set newPath as getPath(path), which returns a
                lines = Files.readAllLines(p);
            }
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Check path or file");
        }
    }

    public static List<String> readLines() {

        List<String> names;
        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }
    public static void greetNames() {
        for (String name : readLines()) {
            System.out.printf("%s%n", name);
        }
    }
 } // End ContactsMethods Class