// Day 1
// Read three lines of input and return certain output.
// 
// @author Chinasa T. Okolo

import java.util.*
import java.io.*

public class Solution {

  public static void main(String[] args) { 
      int i = 4;
      double d = 4.0;
      String s ="HackerRank ";
      
      Scanner scan = new Scanner(System.in);
      
        /* Declare second integer, double, and String variables. */
            int integer = 0;
            double doub = 0.0;
            String stg = "";

        /* Read and save an integer, double, and String to your variables.*/
            integer = scan.nextInt();
            doub = scan.nextDouble();
            scan.nextLine();
            stg = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
            System.out.println(i + integer);

        /* Print the sum of the double variables on a new line. */
            System.out.println(d + doub);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
            System.out.println(s + stg);
            
            scan.close();
    }
}
