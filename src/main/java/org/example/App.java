package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
//        System.out.println("Enter second number:");
//        int number2 =scanner.nextInt();
        LogicalOp counting = new LogicalOp();
        counting.countingTo100(number); //ex1
        //counting.countingToMinus100(number); //ex2
        //counting.countingBetweenNumbers(number, number2); //ex3
        //counting.countingFromMinToMax(number, number2);  //ex4
        //counting.countingEvenNumbers(); //ex5
        //counting.countingOddNumbers(); //ex6
        // System.out.println(counting.sumOfNumbers(number)); //ex7
        //System.out.println("The average is: " + counting.averageOfNumbers(number));  //ex8
        //counting.drawWithStars(); //ex9
    }
}
