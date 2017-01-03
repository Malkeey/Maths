/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

import java.text.DecimalFormat;

public interface Shape3DInterface {
    
    //Methods
    public void calculateValues();
    
    //Getters
    public double getHeight();
    
    public double getWidth();
    
    public double getDepth();
    
    public double getSurfaceArea();
    
    public double getVolume();

}