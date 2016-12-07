/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

import java.text.DecimalFormat;

public class Shape2D {

    private float height, width, circumference;
    
    //Constructors
    public Shape2D() {
        
    }
    
    public Shape2D(float height, float width) {
        this.height = height;
        this.width = width;
    }
    
    public Shape2D(float circumference) {
        this.circumference = circumference;
    }
    
    //Methods
    public void calculateCircumference() {
        this.circumference = (this.height * this.width);
    }
    
    //Getters
    public float getHeight()  {
        return height;
    }
    
    public float getWidht() {
        return width;
    }
    
    public float getCircumference() {
        return circumference;
    }

}