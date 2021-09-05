/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Rishi Gadhia
 */

/*
Write a program that prompts for two numbers. Print the sum, difference, product,
and quotient of those numbers as shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2
Constraints
Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
Keep the input and output statements separate from the numerical conversions and other processing.
Generate a single output statement with line breaks in the appropriate spots.

 */
import java.util.*;

public class Solution05 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        // prompt the user for two numbers and scan them
        System.out.print("What is the first number?");
        int first = in.nextInt();
        System.out.println("What is the second number?");
        int second = in.nextInt();

        // the sum is 'first' + 'second' return as an integer type
        int sum = first + second;
        // the difference is 'first' - 'second'
        int subtract = first - second;
        // the product is equal to 'first' * 'second'
        int product = first * second;
        // the quotient is equal to 'first'/'second'
        int quotient = (first)/(second);

        //output
        System.out.printf(" %d + %d = %d\n %d - %d = %d\n %d * %d = %d\n %d / %d = %d", first, second, sum, first, second, subtract, first,second, product, first, second, quotient);

    }

}
