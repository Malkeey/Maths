/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

import java.text.DecimalFormat;

public class Shape3D {

    private float height, width, surfaceArea;
    
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

}