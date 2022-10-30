import util.Input;
import util.InputVersionTwo;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ContactsMethods extends Contacts implements ContactsInterface{
    //# Contacts Manager Rubric
    //
    //#### Instructions
    //
    //For each project aspect below, a grade of 0, 0.5, or 1 will be assigned. Each aspect represents 10% of the total possible grade.
    //
    //- **0** - mostly incomplete or not present
    //- **0.5** - partially completed
    //- **1** - mostly or fully complete
    //
    //
    //### Presentation (10%)
    //
    //___ both team members speak about their contributions (one team member speaks for both if teammate is absent)
    //
    //
    //### Code Structure (30%)
    //
    //___ uses a ```Contact``` class to instantiate contacts
    //
    //___ smaller main method with bulk of functionality abstracted into additional methods/classes
    //
    //___ avoids more than one instantiation of a ```Scanner``` instance
    //
    //
    //### Output (60%)
    //
    //___ all contacts can be displayed
    //
    //___ a contact can be added and persist in the text file
    //
    //___ contacts are searchable by name
    //
    //___ a contact can be deleted and removed from the text file
    //
    //___ menu is easily understandable and expected user input is intuitive
    //
    //___ implements one or more of the suggested bonuses
// =================================================== Instance Variables ==============================================
    static Path p = Paths.get("src", "contactsPackage", "contactlist.txt");
    static InputVersionTwo userInputv2 = new InputVersionTwo();

// ============================================== Interface Reference Methods ==========================================
    @Override
    public String getPath() {
        return null;
    }

    @Override
    public String getPathFile(){
        return null;
    }

    @Override
    public String getPathDirectory(){
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
    public void printContacts(){

    }
    @Override
    public void overWriteAll(){}

    @Override
    public void readFile(){}


//    @Override
//    public void promptUser(){}

//    public static void main(String[] args) {
//        promptUser();
//    }
    @Override
     public void promptUser() {
//        Movie[] movies = MoviesArray.findAll();    // This will assign all the movies to the variable
//        String userChoice = "timmmmmeh"; // We put timmehh because if  can equal to anything
//        while (!userChoice.equals("0")){   // while the user choice does not equal to 0 it can do any of the options
            System.out.println("What would you like to do");
            System.out.println("1 - View contacts.");
            System.out.println("2 - Add a new contact");
            System.out.println("3 - Search a contact by name.");
            System.out.println("4 - Delete an existing contact.");
            System.out.println("5 - Exit.");
            System.out.println("Enter an option (1, 2, 3, 4 or 5)");
            userInputv2.getInt();

    }

// ================================================ Constructors =======================================================

    public ContactsMethods() {
    }

// =================================================== Methods =========================================================

    public boolean pathExists(String directory, String fileName){
//         boolean pathExist = Files.exists(Paths.get("src", directory,fileName));
         return Files.exists(Paths.get("src", directory, fileName));
        }
     public boolean pathExists(String directory){
//         boolean pathExist = Files.exists(Paths.get("src", directory));
         return Files.exists(Paths.get("src", directory));
     }

     public Path getPathDirectory(String directory){
//        Path dataDirectory = Paths.get(directory);
//         System.out.println(dataDirectory.toAbsolutePath());
         return Paths.get(directory);
     }

     public Path getPathFile(String directory, String file){
        return Paths.get(directory, file);
     }

     public Path getAbsolutePath (String path){
         System.out.println(getPathDirectory(path).toAbsolutePath());
         return getPathDirectory(path).toAbsolutePath();
     }

    // Make a method that reads selected file/path
    public void readFile(String path){
        List<String> lines;

            try {
                if (pathExists(path)){ /* If the path parameter exists (as a string) */
                    Path newPath = getPathDirectory(path); // set newPath as getPath(path), which returns a
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
                Path p = getPathFile(path, file); // set newPath as getPath(path), which returns a
                lines = Files.readAllLines(p);
            for (String line : lines) {
                System.out.println(line);
            }
            }
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Check path or file");
        }
    }

    public static List<String> readLines() { /* Thanks, David! */

        List<String> names;
        try {
            names = Files.readAllLines(p);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }
    public static List<String> readLines(Path path){
        List<String> names;
        try {
            names = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return names;
    }

    public static void greetNames() { /* Thanks, David! */
        for (String name : readLines()) {
            System.out.printf("%s%n", name);
        }
    }

    List<String> poo = Arrays.asList("test\n", "test\n", "test\n");



    public void addContact (List<String> newContacts) {
//        private static void writeLines(List<String> lines) {
//            try {
//                Files.write(PATH, lines);
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        try {
            Files.write(p, newContacts, StandardOpenOption.APPEND);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    } // End addContact

    public void overWriteAll(List<String> lines){
        try {
            Files.write(p, lines);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void resetDefaults(){
        List <String> defaultNames = Arrays.asList("Aaron\n" +
                "210-990-2233\n" +
                "Mason\n" +
                "210-991-2332\n" +
                "Fernando\n" +
                "210-992-3322\n" +
                "David\n" +
                "210-332-9290\n" +
                "Danny\n" +
                "210-780-9902");
        overWriteAll(defaultNames);
    } // End resetDefaults

    // public class SubstringExample{
    // public static void main(String args[]){
    // String s1="javatpoint";
    // System.out.println(s1.substring(2,4));//returns va
    // System.out.println(s1.substring(2));//returns vatpoint
    // }}

//    public String setName(){
//        int count = 0;
////        readLines();
////        for (String name, number : readLines()) {
//////            System.out.printf("%s%n", name);
////
////        }
//        for (int i = 0; i < readLines().size(); i++){
//            if (i %2 == 0){
//                String name = readLines().get(i);
//            } // End if
//
//        } // End for loop
//
//    }

    public void setNumber(){

    }

 } // End ContactsMethods Class