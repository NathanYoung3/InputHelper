import java.util.Scanner;

public class InputHelper {

    /*
    *Loops through until the user enters a valid int value
    *Displays error message and asks user to try again until valid input received
    */

    public static String getNonZeroLenString(Scanner scan, String prompt){
        String string;
        boolean done = false;

        System.out.println(prompt);
        do {
            string = scan.nextLine();
            if (string.isEmpty()) {
                System.out.println("Invalid input. Please try again.");
            } else {
                done = true;
            }
        } while (!done);
        return string;
    }


    public static int getInt(Scanner scan, String prompt){
        int num = 0; //eventually returned to user after validated
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                done = true;
            } else {
                System.out.println("Invalid input. Please try again.");
                scan.nextLine();
            }
        } while (!done);
        return num;
    }

    public static double getDouble(Scanner scan, String prompt){
        double num = 0;
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextDouble()) {
                num = scan.nextDouble();
                done = true;
            } else {
                System.out.println("Invalid input. Please try again.");
                scan.nextLine();
            }
        } while (!done);
        return num;
    }

    public static int getRangedInt(Scanner scan, String prompt, int max, int min){
        int num = 0;
        boolean done = false;

    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt){
        int num = 0; //eventually returned to user after validated
        boolean done = false;

        System.out.println(prompt);
        do {
            if (scan.hasNextInt()) {
                num = scan.nextInt();
                if (num > 0) {
                    done = true;
                } else {
                    System.out.println("Please enter a positive, non-zero integer value.");
                }
            } else {
                System.out.println("Invalid input. Please try again.");
                scan.nextLine();
            }
        } while (!done);
        return num;
    }

    /*
    public static int getRangedInt(Scanner scan, ){

    }
     */
}
