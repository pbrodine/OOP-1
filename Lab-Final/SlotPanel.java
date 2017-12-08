/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: FinalProject
 *File name: SlotPanel.java
 */

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SlotPanel extends JPanel {

    ImagePanel slotOne, slotTwo, slotThree; // thee panels for the computer to generate
    ImagePanel userOne, userTwo, userThree; // three panels chosen by the user

    // Total of nine panels are placed on the SlotPanel
    JPanel titlePanel, choicePanel, resultsPanel; // JPanel for the display at the top
    JPanel selectOnePanel, selectTwoPanel, selectThreePanel; // Three panels for the three selection buttons at the bottom
    JLabel title, choice, results; // Title label for the titlePanel
    JButton selectOne, selectTwo, selectThree, spinMachine; // Four buttons - three are for selection, and the spin button

    public SlotPanel() {
        // Instantiate all the objects declared above
        slotOne = new ImagePanel();
        slotTwo = new ImagePanel();
        slotThree = new ImagePanel();
        userOne = new ImagePanel();
        userTwo = new ImagePanel();
        userThree = new ImagePanel();

        titlePanel = new JPanel();
        title = new JLabel("Geometry Slots"); // Change this label for the top of the display section for the default display
        selectOnePanel = new JPanel();
        selectTwoPanel = new JPanel();
        selectThreePanel = new JPanel();
        // Each of the three buttons to select the object has the same label
        selectOne = new JButton("Select Shape");
        selectTwo = new JButton("Select Shape");
        selectThree = new JButton("Select Shape");
        // Button to spin the machine at the bottom
        spinMachine = new JButton("Spin Machine!");
        choicePanel = new JPanel();
        choice = new JLabel("Your Choice");
        resultsPanel = new JPanel();
        results = new JLabel("Try Your Luck!");

        setBackground(Color.yellow); // You should select your own color here
        setPreferredSize(new Dimension(350, 500)); // You can resize the display to your preferrences

        // Select the sizes for each of the panels
        titlePanel.setPreferredSize(new Dimension(300, 50));
        titlePanel.setBackground(Color.cyan);
        selectOnePanel.setPreferredSize(new Dimension(110, 70));
        selectOnePanel.setBackground(Color.cyan);
        selectTwoPanel.setPreferredSize(new Dimension(110, 70));
        selectTwoPanel.setBackground(Color.cyan);
        selectThreePanel.setPreferredSize(new Dimension(110, 70));
        selectThreePanel.setBackground(Color.cyan);
        selectOne.setPreferredSize(new Dimension(110, 30));
        selectTwo.setPreferredSize(new Dimension(110, 30));
        selectThree.setPreferredSize(new Dimension(110, 30));
        // Action listeners that will take care of the changing of the objects displayed
        selectOne.addActionListener(new ObjectChanger());
        selectTwo.addActionListener(new ObjectChanger());
        selectThree.addActionListener(new ObjectChanger());
        // Action listener to get the "machine" in motion
        spinMachine.addActionListener(new Spin());
        choicePanel.setPreferredSize(new Dimension(300, 25));
        resultsPanel.setPreferredSize(new Dimension(300, 25));
        title.setFont(new Font("Castellar", Font.BOLD, 24));
        resultsPanel.setBackground(Color.cyan);

        // Add the title JLabel to the top panel
        titlePanel.add(title);
        // Add the selection button to the user-selectable panel one
        selectOnePanel.add(selectOne); //
        // Add the selection button to the user-selectable panel two
        selectTwoPanel.add(selectTwo);
        // Add the selection button to the user-selectable panel three
        selectThreePanel.add(selectThree);
        choicePanel.add(choice);
        resultsPanel.add(results);

        // Add all the items to the SlotPanel in the correct order, so that they appear sized and proportioned correctly
        // Since you calculated the sizes of the items, this is already perfectly proportioned
        // This code needs to be expanded, I just added three of the selection panels to show you how to do it!
        add(titlePanel);
        add(slotOne);
        add(slotTwo);
        add(slotThree);
        add(choicePanel);
        add(userOne);
        add(userTwo);
        add(userThree);
        add(selectOnePanel);
        add(selectTwoPanel);
        add(selectThreePanel);
        add(spinMachine);
        add(resultsPanel);

    }

    // Changing of the background whenever the user loses or wins the game
    // Same color is used on five panels in total
    public void setBackgroundColor(Color color) {

        // Set the background of SlotPanel to the color that the user specified
        // Set the background color of the titlePanel, and selectOnePanel, selectTwoPanel and selectThreePanel
    }

    // ActionListener class to determine which shape button was pressed
    public class ObjectChanger implements ActionListener {
        // Determine which of the selectOne, selectTwo, selectThree buttons called it

        public void actionPerformed(ActionEvent event) {
            // From the object that was determined above, you need to make the appropriate switch; options are userOne, userTwo, userThree
            // After the button is determine,d changeShape method can be called on that particular ImagePanel
            // Switch statement is appropriate here - this will give you errors on line 44 until this is fixed here!!
            if (event.getSource() == selectOne) {
                userOne.changeShape();
            } else if (event.getSource() == selectTwo) {
                userTwo.changeShape();
            } else {
                userThree.changeShape();
            }

        }
    }

    // ActionListener class to determine when the Spin button is called
    public class Spin implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            // What happens when the Spin button is called?
            // Three random numbers have to be generated for slotOne, slotTwo, slotThree computer-generated images
            // After that, you need to check if the three images were matched
            // (slotOne to userOne, slotTwo to userTwo, slotThree to userThree) and from that the background color of SlotPanel is determined

            Random generator = new Random();

            // Spin the slots
            slotOne.changeShape(generator.nextInt(4));
            slotTwo.changeShape(generator.nextInt(4));
            slotThree.changeShape(generator.nextInt(4));

            // Determines if Winner using if-else statements 
            if (slotOne.getShape() == userOne.getShape()) {
                if (slotTwo.getShape() == userTwo.getShape()) {
                    if (slotThree.getShape() == userThree.getShape()) {
                        results.setText("Winner!");
                        setBackground(Color.green);
                    } else {
                        results.setText("Loser!");
                        setBackground(Color.red);
                    }
                } else {
                    results.setText("Loser!");
                    setBackground(Color.red);
                }
            } else {
                results.setText("Loser!");
                setBackground(Color.red);
            }
        }
    }
}
