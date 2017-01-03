/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

import java.text.DecimalFormat;

public abstract class Shape3D implements Shape3DInterface {

    protected double height, width, depth, surfaceArea, volume;
    
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
    public double getDepth() {
        return depth;
    }
    
    @Override
    public double getSurfaceArea() {
        return surfaceArea;
    }
    
    @Override
    public double getVolume() {
        return volume;
    }

}