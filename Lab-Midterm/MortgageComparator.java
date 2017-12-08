/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Midterm
 *File name: MortgageComparator.java
 */

import java.text.DecimalFormat;     //import package
import java.text.NumberFormat;      //import package
import java.util.Scanner;           //import package    

public class MortgageComparator {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);              //assign scanner var
        
        double interest, pmt1, pmt2, pmt3, pmt4, pmt5;      //init double vars
        int length, amount;                                 //init int vars
        NumberFormat fmt1 = NumberFormat.getCurrencyInstance();     //init format var
        DecimalFormat fmt2 = new DecimalFormat("0.00%");            //init format var
        
        System.out.println("Enter the interest amount: ");          //Print for user input
        interest = scan.nextDouble();                               //Scan user input
        
        System.out.println("Enter the length of the loan: ");       //Print for user input
        length = scan.nextInt();                                    //Scan user input
        
        System.out.println("Enter the amount of the loan: ");       //Print for user input
        amount = scan.nextInt();                                    //Scan user input
        
        pmt1 = ((interest-1)/100/12*amount)/(1-(1/Math.pow(1 + (interest-1)     //Calc payment
                /100/12, 12 * length)));
        pmt2 = ((interest-.5)/100/12*amount)/(1-(1/Math.pow(1 + (interest-.5)   //calc payment
                /100/12, 12 * length)));
        pmt3 = (interest/100/12*amount)/(1-(1/Math.pow(1 + interest/100/12,     //calc payment
                12 * length)));
        pmt4 = ((interest+.5)/100/12*amount)/(1-(1/Math.pow(1 + (interest+.5)   //calc payment
                /100/12, 12 * length)));
        pmt5 = ((interest+1)/100/12*amount)/(1-(1/Math.pow(1 + (interest+.5)    //calc payment
                /100/12, 12 * length)));
        
        
        System.out.println("***************************************");      //Print line
        System.out.println("Loan Amount: " + fmt1.format(amount));          //Print line
        System.out.println("Number of Years: " + length);                   //Print line
        System.out.println("Range of Interest Rates: "                      //Print line
                + fmt2.format((interest - 1) / 100) + " - " 
                + fmt2.format((interest + 1) / 100));
        System.out.println("***************************************");      //Print line
        
        System.out.println("Interest Rate \tMonthly Payment Total Payment"  //Print line
                + "\t$ Overpayment \t%Overpayment");
        
        System.out.println(fmt2.format((interest-1)/100) + "\t\t"               //Print line rate
                + fmt1.format(pmt1) + "\t\t" + fmt1.format(pmt1 * (12*length))  //Print line pymt
                + "\t" + fmt1.format(pmt1 * (12*length)-amount) + "\t"          //Print line over
                + fmt2.format((pmt1 * (12*length)-amount)/amount));             //Print line over
        
        System.out.println(fmt2.format((interest-.5)/100) + "\t\t"              //Print line rate
                + fmt1.format(pmt2) + "\t\t" + fmt1.format(pmt2 * (12*length))  //Print line pymt
                + "\t" + fmt1.format(pmt2 * (12*length)-amount) + "\t"          //Print line over
                + fmt2.format((pmt2 * (12*length)-amount)/amount));             //Print line over
        
        System.out.println(fmt2.format((interest)/100) + "\t\t"                 //Print line rate
                + fmt1.format(pmt3) + "\t\t" + fmt1.format(pmt3 * (12*length))  //Print line pymt
                + "\t" + fmt1.format(pmt3 * (12*length)-amount) + "\t"          //Print line over
                + fmt2.format((pmt3 * (12*length)-amount)/amount));             //Print line over
        
        System.out.println(fmt2.format((interest+.5)/100) + "\t\t"              //Print line rate
                + fmt1.format(pmt4) + "\t\t" + fmt1.format(pmt4 * (12*length))  //Print line pymt
                + "\t" + fmt1.format(pmt4 * (12*length)-amount) + "\t"          //Print line over
                + fmt2.format((pmt4 * (12*length)-amount)/amount));             //Print line over
        
        System.out.println(fmt2.format((interest+1)/100) + "\t\t"               //Print line rate
                + fmt1.format(pmt5) + "\t\t" + fmt1.format(pmt5 * (12*length))  //Print line pymt
                + "\t" + fmt1.format(pmt5 * (12*length)-amount) + "\t"          //Print line over
                + fmt2.format((pmt5 * (12*length)-amount)/amount));             //Print line over
    }
    
}
