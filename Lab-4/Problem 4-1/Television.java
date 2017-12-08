/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem_4_1
 *File name: Television.java
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class Television {

    // variable data
    private double price;
    private String brand;
    private int size;
    NumberFormat fmt = NumberFormat.getCurrencyInstance();

    // constructor
    public Television() {
    }

    // scanner class for user input
    public void inputTelevision() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the brand of the television: ");
        brand = scan.nextLine();

        System.out.println("Enter the size of the " + brand + " televsion: ");
        size = scan.nextInt();

        System.out.println("Enter the price of the " + size + "\" " + brand
                + " television: ");
        price = scan.nextDouble();

    }

    // accessor
    public String getPrice() {
        return ("The price of the " + size + "\" " + brand + " television is "
                + fmt.format(price) + ".");
    }

    // mutator
    public void setPrice(double newPrice) {
        price = newPrice;
    }

    // toString
    public String toString() {
        return ("The " + size + "\" " + brand + " television costs " + 
                fmt.format(price) + ".");
    }

}
