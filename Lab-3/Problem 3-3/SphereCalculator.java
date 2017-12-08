/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem 3.3
 *File name: SphereCalculator.java
 */

import java.text.DecimalFormat;                 //import decimal format
import java.util.Scanner;                       //import scanner

public class SphereCalculator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);  //init scanner variable
        
        DecimalFormat fmt = new DecimalFormat("0.0000");    //init format variable
        
        double rad, vol, surf;                  //init double variables
        
        System.out.println("Enter the Radius of a circle: ");   //Request user input
        
        rad = scan.nextDouble();                //assign variable
        vol = (4.0/3) * Math.PI * (Math.pow(rad, 3));   //assign variable / math
        surf = 4 * Math.PI * (Math.pow(rad, 2));        //assign variable / math
        
        System.out.println("Radius = " + fmt.format(rad));          //print statement
        System.out.println("Volume = " + fmt.format(vol));          //print statement
        System.out.println("Surface area = " + fmt.format(surf));   //print statement
    }
    
}
