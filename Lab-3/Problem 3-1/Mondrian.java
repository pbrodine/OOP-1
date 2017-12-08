/*
 * Name: Paul Brodine
 * Course: CSC 135-1
 *Project: Problem 3.1
 *File name: Mondrian.java
 */

import javax.swing.JApplet;
import java.awt.*;

public class Mondrian extends JApplet
{
   public void paint(Graphics page)
   //public void resize(500, 500)        
   {
        Color purplish = new Color(118, 121, 235);  // color var
        Color yellowish = new Color(247, 237, 115); // color var
        Color greenish = new Color(146, 242, 121);  // color var
       
        resize(2000, 1250);                 //resize window
      
      page.setColor(purplish);              //set color
      page.fillRect(0, 0, 750, 800);        //color rect
      page.fillRect(1800, 0, 200, 200);     //color rect
      
      page.setColor(yellowish);             //set color
      page.fillRect(750, 0, 275, 300);      //color rect    
      page.fillRect(1025, 700, 1250, 550);  //color rect
      
      page.setColor(greenish);              //set color
      page.fillRect(750, 800, 275, 450);    //color rect
      page.fillRect(1025, 350, 775, 350);   //color rect
      
      page.setColor(Color.black);           //set color
      page.drawRect(0, 0, 2000, 1250);      //main square
      page.drawRect(0, 0, 749, 799);        // square
      page.drawRect(0,800, 749, 449);       // square
      page.drawRect(1800, 0, 200, 199);     // square
      page.drawRect(750, 0, 274, 299);      // square
      page.drawRect(1025, 700, 1250, 550);  // square
      page.drawRect(750, 800, 274, 449);    // square
      page.drawRect(1025, 350, 774, 349);   // square
      page.drawRect(750, 300, 274, 500);    // square
      page.drawRect(1025, 0, 774, 349);     // square
      page.drawRect(1800, 200, 774, 499);   // square
      
      
      
      

   }
}