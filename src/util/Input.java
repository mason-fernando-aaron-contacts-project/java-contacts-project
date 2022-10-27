package util;

import java.util.Scanner;

public class Input {

//    shapes.Circle circle = new shapes.Circle();

    private static Scanner scanner;


      public Input (String prompt){
        prompt = scanner.next();

      }

      public String getString(String string){
//        System.out.println("Enter text:");
        Integer.valueOf(string);
        Double.valueOf(string);

        System.out.println(string);
        return scanner.nextLine();

      }
      public String getString (){
        System.out.println("Enter text:");
        return scanner.nextLine();
      }

      public boolean yesNo (){
//        scanner.nextLine();
        boolean yesLogic = true;

          System.out.println("Would you like to go again? (y/n)");
          String userInput = scanner.next().toLowerCase();
          if (userInput.equals("y") || userInput.equals("yes")) {
              return true;
          } else {
            yesLogic = false;
            System.out.println("Later skater!");

            return false;
          }

      }

      public double yesNo2 (){

        System.out.println("Continue? (y/n)");
        String recursion = scanner.next().toLowerCase();
        if (recursion.equals("y") || recursion.equals("yes")) {
          return 1;
        } else {
          return 0;
        }
      }




      int getInt (int min, int max){
        System.out.printf("Enter a number between %d and %d%n", min, max);
        int userInput = scanner.nextInt();
        if (userInput >= min && userInput <= max){
          return userInput;
        } else {
          getInt(min, max);

        }
        return 0;
      }

    double getDouble (double min, double max){
      System.out.printf("Enter a number between %f and %f%n", min, max);
      double userInput = scanner.nextDouble();
      if (Math.ceil(userInput) >= min && Math.ceil(userInput) <= max){
        System.out.println("Good Job!");
        return userInput;
      } else {
        System.out.println("Your number sucks. Try again.");
        getDouble(min, max);
      }
      return 0;
    }

    double getDouble () {
      System.out.println("Enter a decimal number (double)");
      double userDouble = scanner.nextDouble();
      return userDouble;
    }

    int getInt (){
      System.out.println("Enter a number");
      int userInt = scanner.nextInt();
        return userInt;
    }

      public Input (){
        scanner = new Scanner(System.in);
      }

      // Getter
      public Scanner getScanner(){
        return scanner;
      }

      // Setter
      public void setScanner(Scanner scanner) {
        this.scanner = scanner;
      }


  }
