/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: FinalProject
 *File name: ImagePanel.java
 */

import java.awt.*;
import javax.swing.*;

// This class describes each of the Image Panels (6 total displayed)
// And provides methods for drawing of the shapes
public class ImagePanel extends JPanel {
    // Use an int value to keep the current shape for the object

    private int currentShape; // How many shapes do you have? What values can this int have?

    // Constructor that sets up the default size, color and shape for the object
    // The default currentShape is 0, which is the circle in this instance
    public ImagePanel() {
        setPreferredSize(new Dimension(110, 100));
        setBackground(Color.cyan); // this is the color of the image panel.
        currentShape = 0;
    }

    // Changing the shape means redrawing the object, this repaint() method is called
    // This method is called from the Spin ActionListener in the SlotPanel class
    public void changeShape() {
        // increase the currentShape int by 1
        if (currentShape == 3) {
            currentShape = 0;
        } else {
            currentShape++;
        }

        // Make the shapes rotate from 0 to the largest int value possible - one by one by one on each click
        // and then restart again after the last shape has been encountered
        // Fill in the if statement that achieves this
        // Repaint is called
        repaint();
    }

    // This is an overloaded changeShape method that is used to force the randomly selected values
    // This is only used for the computer-generated shapes, where the shape is an int randomly generated
    // by the computer - this is called from the Spin ActionListener in the SlotPanel class
    public void changeShape(int setShape) {
        currentShape = setShape;
        repaint();
    }

    // Accessor for the shape
    public int getShape() {
        return currentShape;
    }

    // PaintComponent method takes care of the drawing
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.yellow); // This is the color of the object drawn, change it to your desired color!

        // Write a switch method that is going to draw all the four shapes that you have to draw
        // Remember that one shape has to be a fillPolygon, so that you can draw a triangle
        // How many shapes do you have? How big is your drawing surface? Look above in the code
        // Need to fill in this section, I am only giving you two cases here!
        switch (currentShape) {
            case 0:
                g.fillOval(25, 25, 70, 70);
                break;
            case 1: {
                int x[] = {55, 15, 95}, y[] = {25, 95, 95};
                g.fillPolygon(x, y, 3);
            }
            break;
            case 2:
                g.fillRect(35, 25, 40, 70);
                break;
            case 3:
                g.fillRect(25, 35, 70, 40);
                break;
            default:
                break;
        }
    }
}
