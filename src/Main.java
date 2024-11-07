import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Testing methods from InputHelper
        Scanner scan = new Scanner(System.in);

        //Testing getInt
        boolean x = InputHelper.getYNConfirm(scan, "Please enter a y n answer.");
        System.out.println("My bool is: " + x);


    }
}
