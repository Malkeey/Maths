/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

//import java.text.DecimalFormat;

public abstract class Shape3D implements Shape3DInterface {

    protected double height, width, length, surfaceArea, volume;
    
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
    public double getLength() {
        return length;
    }
    
    @Override
    public double getSurfaceArea() {
        return surfaceArea;
    }
    
    @Override
    public double getVolume() {
        return volume;
    }
    
    //Setters
    @Override
    public void setHeight(double newHeight) {
        height = newHeight;
    }
    
    @Override
    public void setWidth(double newWidth) {
        width = newWidth;
    }
    
    @Override
    public void setDepth(double newDepth) {
        length = newDepth;
    }

}