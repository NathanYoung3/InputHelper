import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Testing methods from InputHelper
        Scanner scan = new Scanner(System.in);

        //Testing getInt
        double x = InputHelper.getDouble(scan, "Please enter in a double value.");
        System.out.println("My double is: " + x);


    }
}
