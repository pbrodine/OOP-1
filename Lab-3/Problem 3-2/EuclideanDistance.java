/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem 3.2
 *File name: EuclidianDistance.java
 */

import java.util.Scanner;           //import scanner

public class EuclideanDistance {    
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);          //init scan var
        String valuesStr;                               //init string var
        String[] values = new String[4];                //init string var w/ 4 elements
        int x1, x2, y1, y2;                             //init int var
        double dist;                                    //init double var
        
        System.out.println("Enter the coordinates separated by a space (x1 y1 "     //Request user input
                + "x2 y2):");                                                       
        valuesStr = scan.nextLine();                    //assign var
        values = valuesStr.split(" ");
        
        x1 = Integer.parseInt(values[0]);               //assign var
        y1 = Integer.parseInt(values[1]);               //assign var
        x2 = Integer.parseInt(values[2]);               //assign var
        y2 = Integer.parseInt(values[3]);               //assign var
        
        dist = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));      //assign var
        
        System.out.println("The distance between points (" + x1 + "," + y1 + ")"    //print statement
                + " and (" + x2 + "," + y2 + ") is " + dist);
    }
    
}
