import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ContactsMethods implements ContactsInterface {
     public static void constactsDisplay() {
//        Movie[] movies = MoviesArray.findAll();    // This will assign all the movies to the variable
//        String userChoice = "timmmmmeh"; // We put timmehh because if  can equal to anything
//        while (!userChoice.equals("0")){   // while the user choice does not equal to 0 it can do any of the options
            System.out.println("What would you like to do");
            System.out.println("1 - View contacts.");
            System.out.println("2 - Add a new contact");
            System.out.println("3 - Search a contact by name.");
            System.out.println("4 - Delete an existing contact.");
            System.out.println("5 - Exit.");
            System.out.println("Enter an option (1, 2, 3, 4 or 5 ");

//            userChoice = input.getString("Enter your choice:");
    }

    public ContactsMethods() {
    }

    public boolean pathExists(String directory, String fileName){
         boolean pathExist = Files.exists(Paths.get("src", directory,fileName));
         return pathExist;
        }
     public boolean pathExists(String directory){
         boolean pathExist = Files.exists(Paths.get("src", directory));
         return pathExist;
     }

     public void printContacts(){
         List<String> lines = new ArrayList<>();
         try{
             lines = Files.readAllLines()
         }
     }

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
     public void printContacts(){

     }
 }

//try {
//        Files.write(pathToPeople, classmatesArrayList);
//        } catch (IOException e) {
//        e.printStackTrace();
//        }