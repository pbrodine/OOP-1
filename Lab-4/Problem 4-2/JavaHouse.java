/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem_4_2
 *File name: JavaHouse.java
 */

import javax.swing.*;

public class JavaHouse {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JavaHouse");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JavaHousePanel panel = new JavaHousePanel();
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

}
