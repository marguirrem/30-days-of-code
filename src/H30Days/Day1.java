package H30Days;

import java.util.Scanner;

/**
 * Created by marlon on 24/05/16.
 */
//Data Type
public class Day1 {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);
        /* Declare second integer, double, and String variables. */
        int in;double dob;String n = "";

        /* Read and save an integer, double, and String to your variables.*/
        in = scan.nextInt();
        dob = scan.nextDouble();
        n = scan.nextLine();
        n = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        int suma = i + in;
        System.out.println(suma);
        /* Print the sum of the double variables on a new line. */
        double sum = d + dob;
        System.out.println(sum);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+n);
        scan.close();
    }
}
