package H30Days;

import java.util.Scanner;

/**
 * Created by marlon on 29/11/16.

 Objective
 In this challenge, we're going to use loops to help us do some simple math. Check out the Tutorial tab to learn more.

 Task
 Given an integer, , print its first multiples. Each multiple (where ) should be printed on a new line in the form: n x i = result.

 Input Format

 A single integer, .

 Constraints

 Output Format

 Print lines of output; each line (where ) contains the of in the form:
 n x i = result.

 Sample Input

 2

 Sample Output

 2 x 1 = 2
 2 x 2 = 4
 2 x 3 = 6
 2 x 4 = 8
 2 x 5 = 10
 2 x 6 = 12
 2 x 7 = 14
 2 x 8 = 16
 2 x 9 = 18
 2 x 10 = 20



 */

public class Day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =0 ; i< 11;i++){
            System.out.println(n + " x " + i + " = " + n*i);
        }
    }
}
