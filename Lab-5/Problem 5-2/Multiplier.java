/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem_5_2
 *File name: Multiplier.java
 */

import java.util.Scanner;

public class Multiplier {

    public static void main(String[] args) {
        int number, product, mult, init;                //initiate variables
        Scanner scan = new Scanner(System.in);          //initiate scanner

        System.out.println("Enter an integer: ");       //prompt user for integer
        number = scan.nextInt();                        //scan input
        init = number;                                  //copy input into another variable
        product = 1;                                    //set 1 to multiply with

        if (number > 0) {                               //declare if statement
            while (number != 0) {                       //declare while statement
                mult = number % 10;                     //grab the last digit as multiplier
                number = number / 10;                   //remove the last digit from the number
                product = product * mult;               //multiply product with multiplier
            }
        } else {                                        //declare else (negative inputs) 
            number = number * -1;                       //pull out the negative
            while (number != 0) {                       //declare while statement
                mult = number % 10;                     //grab last digit as multiplier
                number = number / 10;                   //remove last digit from number
                product = product * mult;               //multiply product with multiplier
            }
            product = product * -1;                     //reassign negative
        }
        System.out.println("The product of the digits in " + init + " is "
                + product + ".");                       //Print statement

    }

}
