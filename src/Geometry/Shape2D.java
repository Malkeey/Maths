/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

import java.text.DecimalFormat;

public abstract class Shape2D {

    public double height = 0, width = 0, circumference = 0, area = 0;
    
    //Methods
    public void calculateCircumference();
    
    public void calculateArea();
    
    //Getters
    public double getHeight();
    
    public double getWidht();
    
    public double getCircumference();
    
    public double getArea();

}