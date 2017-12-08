/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem_4_2
 *File name: JavaHousePanel.java
 */

import java.awt.*;
import javax.swing.*;

public class JavaHousePanel extends JPanel {
    
    private final int midx = 375, midy = 375;           //assign x and y values

    public JavaHousePanel() {
        
        setPreferredSize(new Dimension(750, 750));      //set window size
        setBackground(Color.cyan);                      //set sky color
    }
        
    public void paintComponent(Graphics page) {
        
        super.paintComponent(page);
        
        page.setColor(Color.green);
        page.fillRect(0, midy + 75, 750, 300);      //grass
        
        
        page.setColor(Color.gray);
        page.fillRect(midx - 150, midy - 75, 300, 250);    //main box
        
        page.setColor(Color.white);
        page.fillRect(midx - 110, midy + 35, 50, 70);      //left window
        page.fillRect(midx + 60, midy + 35, 50, 70);       //right window
        
        page.setColor(Color.black);
        page.drawLine(midx - 85, midy + 35, midx - 85, midy + 105);    //left window
        page.drawLine(midx - 110, midy + 70, midx - 60, midy + 70);
        page.drawLine(midx + 85, midy + 35, midx + 85, midy + 105);    //right window
        page.drawLine(midx + 60, midy + 70, midx + 110, midy + 70);
        
        page.setColor(Color.RED);
        page.fillRect(midx -35, midy + 45, 70, 130);        //door
        
        page.setColor(Color.yellow);
        page.fillOval(midx + 20, midy + 110, 10, 10);       //doorknob
        page.fillOval(650, -100, 200, 200);                 //sun
        
        page.setColor(Color.darkGray);
        
        int xpoints [] = {midx, midx - 190, midx+ 190};
        int ypoints [] = {midy - 200, midy - 40, midy - 40};
        page.fillPolygon(xpoints, ypoints, xpoints.length);        //triangle roof
        
    }
}
