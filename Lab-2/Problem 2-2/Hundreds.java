/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem 2.2
 *File name: Hundreds.java
 */

 
import java.util.Scanner;                                   //Import Scanner

public class Hundreds {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);              //Assigns Scanner var
        
        int first, second, hun1, hun2, sum;                 //Defines int variables
        
        System.out.println("Enter the first integer:");     //Prompt user for input
        first = scan.nextInt();                             //Scan user input
        hun1 = (first/100)%10;                              //Pull hundreds place
        
        System.out.println("Enter the second integer:");    //Prompt user for input
        second = scan.nextInt();                            //Scan user input
        hun2 = (second/100)%10;                             //Pull hundreds place
        
        sum = hun1 + hun2;                                  //Add hundreds place
        
        System.out.println("The hundreds place in the integers " + first    //Print statement 
                + " and " + second + " are " + hun1 + " and " + hun2 
                + " respectively. \nThe sum of the digits in the "
                + "hundreds " + "place is " + sum + ".");      
    }
    
}
