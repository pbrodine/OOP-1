/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem 2.3
 *File name: BMICalculator.java
 */

import java.util.Scanner;                                       //Import Scanner

public class BMICalculator {
    
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);                  //Assign scan var
        
        int height, weight;                                     //define int var
        float BMI;                                              //define float var
        
        System.out.println("Enter your height in inches:");     //Prompt user for input
        height = scan.nextInt();                                //Read user input
        
        System.out.println("Enter your weight in pounds:");     //Prompt user for input
        weight = scan.nextInt();                                //Read user input
        
        BMI = (float)weight * 703 / (height * height);          //Calculate BMI
        
        System.out.println("Your BMI is " + BMI);               //Print Statement
    }
    
}
