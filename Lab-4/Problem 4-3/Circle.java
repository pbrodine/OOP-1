//********************************************************************
//  Circle.java       Author: Lewis/Loftus
//
//  Represents a circle with a particular position, size, and color.
//********************************************************************

import java.awt.*;

public class Circle {

    private int radius, centerX, centerY;
    private Color color;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this circle with the specified values.
    //-----------------------------------------------------------------
    public Circle(int size, Color shade, int x, int y) {
        radius = size;
        color = shade;
        centerX = x;
        centerY = y;
    }

    //-----------------------------------------------------------------
    //  Draws this circle in the specified graphics context.
    //-----------------------------------------------------------------
    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval(centerX - radius, centerY - radius, radius * 2, radius * 2);
    }

    //-----------------------------------------------------------------
    //  Diameter mutator.
    //-----------------------------------------------------------------
    public void setRadius(int size) {
        radius = size;
    }

    //-----------------------------------------------------------------
    //  Color mutator.
    //-----------------------------------------------------------------
    public void setColor(Color shade) {
        color = shade;
    }

    //-----------------------------------------------------------------
    //  X mutator.
    //-----------------------------------------------------------------
    public void setX(int x) {
        centerX = x;
    }

    //-----------------------------------------------------------------
    //  Y mutator.
    //-----------------------------------------------------------------
    public void setY(int y) {
        centerY = y;
    }

    //-----------------------------------------------------------------
    //  Diameter accessor.
    //-----------------------------------------------------------------
    public int getDiameter() {
        return radius * 2;
    }
    
    //-----------------------------------------------------------------
    //  Radius accessor
    //-----------------------------------------------------------------
    public int getRadius() {
        return radius;
    }
    //-----------------------------------------------------------------
    //  Color accessor.
    //-----------------------------------------------------------------

    public Color getColor() {
        return color;
    }

    //-----------------------------------------------------------------
    //  X accessor.
    //-----------------------------------------------------------------
    public int getX() {
        return centerX;
    }

    //-----------------------------------------------------------------
    //  Y accessor.
    //-----------------------------------------------------------------
    public int getY() {
        return centerY;
    }

    //------------------------------------------------------------------
    //  Perimeter Accessor
    //------------------------------------------------------------------
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    //------------------------------------------------------------------
    //  Area Accessor
    //------------------------------------------------------------------
    public double getArea() {
        return Math.PI * (Math.pow(radius, 2));
    }
    
    //------------------------------------------------------------------
    //  ToString
    //------------------------------------------------------------------
    public String toString() {
        return ("The center of the circle is (" + centerX + "," + centerY
                + ") and the radius is " + radius + ".");
    }        
    
    //------------------------------------------------------------------
    //  "equals"
    //------------------------------------------------------------------
    public boolean equals(int value)
    {
        return value == radius;
    }
            
}
