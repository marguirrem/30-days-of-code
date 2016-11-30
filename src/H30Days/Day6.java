package H30Days;

import java.util.Scanner;

/**
 * Created by marlon on 30/11/16.
 *
 Objective
 Today we're expanding our knowledge of Strings and combining it with what we've already learned about loops. Check out the Tutorial tab for learning materials and an instructional video!

 Task
 Given a string, , of length that is indexed from to , print its even-indexed and odd-indexed characters as space-separated strings on a single line (see the Sample below for more detail).

 Note: is considered to be an even index.

 Input Format

 The first line contains an integer, (the number of test cases).
 Each line of the subsequent lines contain a String, .

 Constraints

 Output Format

 For each String (where ), print 's even-indexed characters, followed by a space, followed by 's odd-indexed characters.

 Sample Input

 2
 Hacker
 Rank

 Sample Output

 Hce akr
 Rn ak

 Explanation

 The even indices are and , and the odd indices are and . We then print a single line of space-separated strings; the first string contains the ordered characters from 's even indices (), and the second string contains the ordered characters from 's odd indices ().
 */
public class Day6 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        String [] str = new String[t];

        for (int i = 0; i < t; i++){
            str[i] = scanner.next();
        }

        for (int temp = 0; temp < t; temp++){
            for (int j = 0; j < str[temp].length(); j = j + 2){
                System.out.print(str[temp].charAt(j));
            }

            System.out.print(" ");

            for (int j = 1; j < str[temp].length() ; j = j + 2){
                System.out.print(str[temp].charAt(j));
            }

            System.out.println();

        }

    }
}
