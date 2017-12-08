/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem_5_3
 *File name: Dice5000.java
 */
public class Dice5000 {
    public static void main(String[] args) {
        
        Die die1 = new Die(), die2 = new Die(), die3 = new Die();       //assign values and variables
        int sum, rolls, count = 0;                                      //assign values and variables
        
        
        for (rolls = 0; rolls < 5000; rolls++) {                        //initiate for statement
            sum = die1.roll() + die2.roll() + die3.roll();              //add the rolls together
            if (sum == 3) {                                             //declare if statement
                count ++;                                               //increase count if sum is 3
            }
            else {  
            }
        }
        
        System.out.println("The number of \"three ones\" is " + count + ".");   //Print statement
    }
}
