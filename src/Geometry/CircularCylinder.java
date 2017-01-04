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
        
    }
    
//    Top Surface Area = π r^2
//    Bottom Surface Area = π r^2
//    Lateral Surface Area = 2 π r h
//    Total Surface Area
//    Volume = π r^2 h
//    = L + T + B = 2πrh + 2(πr^2) = 2πr(h+r)
    
    
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