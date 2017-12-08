//********************************************************************
//  SplatPanel.java       Author: Lewis/Loftus
//
//  Demonstrates the use of graphical objects.
//********************************************************************

import javax.swing.*;
import java.awt.*;

public class SplatPanel extends JPanel
{
   private Circle circle1, circle2, circle3, circle4, circle5;

   //-----------------------------------------------------------------
   //  Constructor: Creates five Circle objects.
   //-----------------------------------------------------------------
   public SplatPanel()
   {
      circle1 = new Circle(15, Color.red, 85, 50);
      circle2 = new Circle(25, Color.green, 55, 45);
      circle3 = new Circle(50, Color.cyan, 110, 135);
      circle4 = new Circle(22, Color.yellow, 192, 52);
      circle5 = new Circle(30, Color.blue, 230, 90);

      setPreferredSize(new Dimension(300, 200));
      setBackground(Color.black);
      setFont(new Font("Arial", Font.BOLD, 20));
   }

   //-----------------------------------------------------------------
   //  Draws this panel by requesting that each circle draw itself.
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
      super.paintComponent(page);
      
      
      circle1.draw(page);
      circle2.draw(page);
      circle3.draw(page);
      circle4.draw(page);
      circle5.draw(page);
      page.setColor(Color.white);
      page.drawString("Perimeter = " + circle1.getPerimeter() + "   "
              + "Area = " + circle1.getArea(), 1, 20);
   }
}
