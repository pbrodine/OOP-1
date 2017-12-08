/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem 2.1
 *File name: Fraction.java
 */


import java.util.Scanner;                               //Import Scanner

public class Fraction {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);          //Assign Scanner variable
        
        int num, den;                                   //Assign int variable
        float dec;                                      //Assign Float variable
        
        System.out.println("Enter the numerator:");     //Prompt user for input
        num = scan.nextInt();                           //Read user input
        
        System.out.println("Enter the denominator:");   //Prompt user for input
        den = scan.nextInt();                           //Read user input
        
        dec = (float)num/den;                           //Turn frac into decimal
        
        System.out.println(num + "/" + den + " is equivalent to " + dec);   //Print statement
    }
    
}
