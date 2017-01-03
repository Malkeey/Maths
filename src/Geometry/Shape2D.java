/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

//import java.text.DecimalFormat;

public abstract class Shape2D implements Shape2DInterface {

    protected double height, width, circumference, area;
    
    //Methods
    @Override
    public void calculateValues() {
        
    }
    
    //Getters
    @Override
    public double getHeight() {
        return height;
    }
    
    @Override
    public double getWidth() {
        return width;
    }
    
    @Override
    public double getArea() {
        return area;
    }
    
    @Override
    public double getCircumference() {
        return circumference;
    }
    
    //Setters
    @Override
    public void setHeight(double newHeight) {
        height = newHeight;
    }
    
    public void setWidth(double newWidth) {
        width = newWidth;
    }
    
}