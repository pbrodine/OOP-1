/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem_4_1
 *File name: MyTelevisions.java
 */
public class MyTelevisions {

    public static void main(String[] args) {

        // Assign 3 televisions
        Television television1 = new Television();
        Television television2 = new Television();
        Television television3 = new Television();

        // Prompt user to input television data
        television1.inputTelevision();
        television2.inputTelevision();
        television3.inputTelevision();
        System.out.println();

        // Demonstrate accessor 
        System.out.println(television1.getPrice());
        System.out.println(television2.getPrice());
        System.out.println(television3.getPrice());
        System.out.println();

        // Demonstrate mutator
        television1.setPrice(4000);
        television2.setPrice(3200);
        television3.setPrice(1800);
        System.out.println();

        // Print television data
        System.out.println(television1.toString());
        System.out.println(television2.toString());
        System.out.println(television3.toString());
    }

}
