package util;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.getString());
//        System.out.println(input.yesNo());
        System.out.println(input.yesNo());
        System.out.println(input.getInt(1, 20));
        System.out.println(input.getDouble(3, 50));
        System.out.println(input.getInt());
        System.out.println(input.getDouble());

    } // END MAIN


} // End INPUT TEST CLASS
