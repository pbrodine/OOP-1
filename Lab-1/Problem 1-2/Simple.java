/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem 1.2
 *File name: Simple.java
 */

//Print seven required file names and explain why they are or are not valid
public class Simple {
    //Main method with seven print statements
    public static void main(String[] args) {
        System.out.println("1. \"simple\" works fine as a file name, but it's " //First Row
                + "a better style to begin with a capital letter.");            //First Row cont.
        
        System.out.println("2. \"SimpleProgram\" works fine as a file name, but"//Second row
                + " the word \"program\" may be redundant.");                   //Second row cont.
        
        System.out.println("3. \"1 Simple\" does not work as a file name. \"1\""//Third row
                + " is not a valid Java identifier.");                          //Third tow cont.
        
        System.out.println("4. \"_Simple_\" works fine as a file name, but it's"//Fourth row
                + " not necessary and is excessive to use the underscore "      //Fourth row cont.
                + "characters.");                                               //Fourth row cont.
        
        System.out.println("5. \"*Simple*\" does not work as a file name. \"*\""//Fifth row
                + " is not a valid Java identifier.");                          //Fifth row cont.
        
        System.out.println("6. \"$123_45\" does not work as a file name. \"$\" "//Sixth row
                + "should be used only in mechanically generated code.");       //Sixth row cont.
        
        System.out.println("7. \"Simple!\" does not work as a file name. \"!\" "//Seventh row
                + "is not a valid Java identifier.");                           //Seventh row cont.
    }
    
}
