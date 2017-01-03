/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

import java.text.DecimalFormat;

public abstract class Shape3D {

    protected float height, width, depth, surfaceArea, volume;
    
    //Constructors
    public Shape3D() {
        
    }
    
    public Shape3D(float height, float width) {
        this.height = height;
        this.width = width;
    }
    
    //Methods
    
    //Getters
    public float getHeight() {
        return height;
    }
    
    public float getWidth() {
        return width;
    }
    
    public float getDepth() {
        return depth;
    }
    
    public float getSurfaceArea() {
        return surfaceArea;
    }
    
    public float getVolume() {
        return volume;
    }

}