/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: FinalProject
 *File name: SlotDriver.java
 */
import java.lang.*;
import javax.swing.*;

public class SlotDriver {

    public static void main(String[] args) {
        // Name your JFrame
        JFrame mainFrame = new JFrame("Geometry Slots");
        mainFrame.setDefaultCloseOperation(mainFrame.EXIT_ON_CLOSE);

        // Create a single instance of the SlotPanel
        SlotPanel slotMachine = new SlotPanel();
        // Add the SlotPanel to the JFrame
        mainFrame.getContentPane().add(slotMachine);

        // Set to visible
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
