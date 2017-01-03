/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

//import java.text.DecimalFormat;

public interface Shape2DInterface {
    
    //Methods
    public void calculateValues();
    
    //Getters
    public double getHeight();
    
    public double getWidth();
    
    public double getArea();
    
    public double getCircumference();
    
    //Setters
    public void setHeight(double newHeight);
    
    public void setWidth(double newWidth);
    
}