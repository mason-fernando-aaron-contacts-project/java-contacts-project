package util;
import java.util.Scanner;

public class InputVersionTwo {
        public static void main(String[] args) {
            InputVersionTwo input2 = new InputVersionTwo();
            int userInt = input2.getInt();
            System.out.println(userInt);
            input2.getDouble();
        }


        private final Scanner scanner;

        public InputVersionTwo() {
            this.scanner = new Scanner(System.in);
        }

        public String getString(){
//            System.out.println("Enter your input:");
            return scanner.nextLine();
        }

        public String getString(String prompt){
            System.out.println(prompt);
            return scanner.nextLine();
        }

        // Solution: David Lara and John Pedrotti
        public boolean yesNo(){
            System.out.println("Yes or no?");
            String userInput = scanner.nextLine();
            return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        }

        /*
            TODO: refactor this method to use Integer.valueOf(getString()) and surround it with a try-catch block to
             to catch the NumberFormatException. If the exception is caught, call the getInt() method again.
         */
        public int getInt(){
            System.out.println("Enter an integer:");
//             get user input as a string
            // parse the string into a number
            // if the parse input throws an exception, recurse
            // if no exception, return the parsed number

            String userInput = getString();
            try {
               return Integer.valueOf(userInput);
            } catch (NumberFormatException e){
                e.printStackTrace();
                System.out.println("Incorrect input format. Please try again.");
                return getInt();
            }


//            try {
//            return Integer.valueOf(getString());
//
//            }
//            catch (NumberFormatException e) {
//                e.printStackTrace();
//                System.out.println("Incorrect number format, brother. Try again.");
//                getInt();
//            }
//                return 0;
        }

        public int getInt(String prompt){
            System.out.println(prompt);
            return scanner.nextInt();
        }

        public int getInt(int min, int max){
            String prompt = "Enter an integer between " + min + " and " + max + ":";
            System.out.println(prompt);
            int userInput = getInt();
            while (userInput < min || userInput > max){
                System.out.println(prompt);
                userInput = scanner.nextInt();
            }
            return userInput;
        }

        /*
            TODO: refactor this method to use Double.valueOf(getString()) and surround it with a try-catch block to
             to catch the NumberFormatException. If the exception is caught, call the getDouble() method again.
         */
        public double getDouble(){
            System.out.println("Enter a double: ");
            String userInput = getString();
            try {
                System.out.println(userInput);
                return Double.valueOf(userInput);
            } catch (NumberFormatException e){
                e.printStackTrace();
                System.out.println("Incorrect input format. Please try again.");
                return getDouble();
            }

        }

        public double getDouble(String prompt){
            System.out.println(prompt);
            return scanner.nextDouble();
        }

        public double getDouble(double min, double max){
            String prompt = "Enter an number between " + min + " and " + max + ":";
            System.out.println(prompt);
            double userInput = getDouble();
            while (userInput < min || userInput > max){
                System.out.println(prompt);
                userInput = scanner.nextDouble();
            }
            return userInput;
        }
    } // End InputVersionTwo Class

