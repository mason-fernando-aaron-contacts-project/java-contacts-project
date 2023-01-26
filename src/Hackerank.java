import java.util.Scanner;

public class Hackerank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Number");
//        String myString = scanner.next();
//        System.out.println("myString is :" + myString);
        int n = scanner.nextInt();
        if(n % 2 != 0){
            System.out.println("Weird");
        } else if(n % 2 == 0 && n <= 5 && n >= 2){
            System.out.println("Is Not Weird");
        } else if(n % 2 == 0 && n < 20 && n >= 6){
            System.out.println("Weird");
        } else if(n % 2 == 0 && n >= 20){
            System.out.println("Not Weird");
        }

        import java.util.Scanner;

        public class Solution {

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int i = scan.nextInt();
                double d = scan.nextDouble();
                scan.nextLine();    /*Ghosting may occur needs this so rest of lines can be read*/
                String s = scan.nextLine();

                System.out.println("String: " + s);
                System.out.println("Double: " + d);
                System.out.println("Int: " + i);
            }
        }


    }
}

//Given an integer, , perform the following conditional actions:
//
//If n  is odd, print Weird
//If n is even and in the inclusive range of  to , print Not Weird
//If n is even and in the inclusive range of  to , print Weird
//If n is even and greater than , print Not Weird
//Complete the stub code provided in your editor to print whether or not  is weird.