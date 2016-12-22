/**
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

//import java.text.DecimalFormat;

public class Cube extends Shape3D {

    private float sideLength;
    
    public Cube(float sideLength) {
        this.sideLength = sideLength;
        this.surfaceArea = (float) (6 * Math.pow(sideLength, 2));
        this.volume = (float) (Math.pow(sideLength, 3));
    }

}
