/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

//import java.text.DecimalFormat;

public class RectangularCuboid extends Shape3D {
    
   private double spaceDiagonal, perimeter;
   
   public RectangularCuboid(double height, double width, double length) {
       this.height = height;
       this.width = width;
       this.length = length;
   }
   
   //Methods
   @Override
   public void calculateValues() {
       this.surfaceArea = ((2 * length * width) + (2 * height * length) + (2 * height * width));
       this.volume = (length * width * height);
       spaceDiagonal = Math.sqrt((Math.pow(length, 2) + Math.pow(width, 2) + Math.pow(height, 2)));
       perimeter = ((2 * length) + (2 * width));
   }
   
   //Getters
   public double getSpaceDiagonal() {
       return spaceDiagonal;
   }
   
   public double getPerimeter() {
       return perimeter;
   }
   
}