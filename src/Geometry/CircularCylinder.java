/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

//import java.text.DecimalFormat;

public class CircularCylinder extends Shape3D {
    
    private double radius, diameter, topSurfaceArea, bottomSurfaceArea, lateralSurfaceArea, totalSurfaceArea;
    
    public CircularCylinder(String radOrDia, double height, double radiusOrDiameter) {
        this.height = height;
        if(radOrDia.equals("radius")) {
            radius = radiusOrDiameter;
            diameter = (radiusOrDiameter * 2);
        } else if(radOrDia.equals("diameter")) {
            radius = (radiusOrDiameter / 2);
            diameter = radiusOrDiameter;
        } else {
            System.out.println("Wrong value given, expected \"radius\" or \"diameter\", in CircularCylinder.java");
        }
    }
    
    //Methods
    @Override
    public void calculateValues() {
        topSurfaceArea = (Math.PI * (Math.pow(radius, 2)));
        bottomSurfaceArea = (Math.PI * (Math.pow(radius, 2)));
        lateralSurfaceArea = (2 * Math.PI * radius * height);
        totalSurfaceArea = (topSurfaceArea + bottomSurfaceArea + lateralSurfaceArea);
        this.volume = (Math.PI * Math.pow(radius, 2) * height);
    }
    
    //Getters
    @Override
    public double getWidth() {
        return (-1);
    }
    
    @Override
    public double getLength() {
        return (-1);
    }
    
    @Override
    public double getSurfaceArea() {
        return (-1);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getDiameter() {
        return diameter;
    }
    
    public double getTopSurfaceArea() {
        return topSurfaceArea;
    }
    
    public double getBottomSurfaceArea() {
        return bottomSurfaceArea;
    }
    
    public double getLaterSurfaceArea() {
        return lateralSurfaceArea;
    }
    
    public double getTotalSurfaceArea() {
        return totalSurfaceArea;
    }
    


}