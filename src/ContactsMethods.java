import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactsMethods implements ContactsInterface {
        static Path p = Paths.get("src", "contactsPackage", "contactlist.txt");
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
         boolean pathExist = Files.exists(Paths.get("src", directory,fileName));
         return pathExist;
        }
     public static boolean pathExists(String directory){
         boolean pathExist = Files.exists(Paths.get("src", directory));
         return pathExist;
     }

     public static Path getPath(String directory){
//        Path dataDirectory = Paths.get(directory);
//         System.out.println(dataDirectory.toAbsolutePath());
         return Paths.get(directory);
     }
     public Path getAbsolutePath (String path){
         System.out.println(getPath(path).toAbsolutePath());
         return getPath(path).toAbsolutePath();
     }

    // Make a method that reads selected file/path
    public void readFile(String path){
        List<String> lines = new ArrayList<>();

        try {
            if (pathExists(path)){
                Path newPath = getPath(path);
                lines = Files.readAllLines(newPath);
                for (String line : lines) {
                    System.out.println(line);
                }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Check path or file");
        }
    }

//     public Path createPath(String path){
//        // make path
//     }



//     public void printContacts(){
//         List<String> lines = new ArrayList<>();
//         try{
//             lines = Files.readAllLines()
//         }
//     }

//        public void createPath(String directory) {
//         Path dataDirectory = Paths.get(directory);
//         if (!pathExists(directory)){
//             try{
//             Files.createDirectories(dataDirectory);
//             } catch (Exception e){
//                 e.printStackTrace();
//                 System.out.println("Something is wrong with the Directory's path or name.");
//             }
//         }
//
//        }

//        public void createPath(String directory, String fileName){
//           Path setPathVar = Paths.get(directory, fileName);
//
//                try{
//                    if (!pathExists(directory, fileName)){
//                        Files.createFile(setPathVar);
//                    }
//                } catch(Exception e){
//                    e.printStackTrace();
//                    System.out.println("There may be an issue with the file path");
//                }
//
//        }

 } // End ContactsMethods Class

//try {
//        Files.write(pathToPeople, classmatesArrayList);
//        } catch (IOException e) {
//        e.printStackTrace();
//        }