package H30Days;

import java.util.*;

/**
 * Created by marlon on 24/05/16.
 */
//Hello World
public class Day0 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in); // use the Scanner class to read from stdin
            String inputString = scan.nextLine(); // read a line of input and save it to a variable
            scan.close(); // close the scanner

            // Your first line of output goes here
            System.out.println("Hello, World.");

            // Write the second line of output
            System.out.println(inputString);
        }

}
