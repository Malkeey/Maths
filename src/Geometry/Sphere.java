/*
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

//import java.text.DecimalFormat;

public class Sphere extends Shape3D {

    private double radius, diameter, circumference;
    
    public Sphere(String radOrDia, double value) {
        if(radOrDia.equals("radius")) {
            radius = value;
            diameter = (value * 2);
        } else if(radOrDia.equals("diameter")) {
            radius = (value / 2);
            diameter = value;
        } else {
            System.out.println("Wrong value given, expected \"radius\" or \"diameter\", in Sphere.java");
        }
    }
    
    //Methods
    @Override
    public void calculateValues() {
        this.surfaceArea = (4 * Math.PI * (Math.pow(radius, 2)));
        this.volume = ((4 / 3) * Math.PI * (Math.pow(radius, 3)));
        circumference = (2 * Math.PI * radius);
    }
    
    //Getters
    @Override
    public double getHeight() {
        return (-1);
    }
    
    @Override
    public double getWidth() {
        return (-1);
    }
    
    @Override
    public double getLength() {
        return (-1);
    }
    
    public double getRadius() {
        return radius;
    }
    
    public double getDiameter() {
        return diameter;
    }
    
    public double getCircumference() {
        return circumference;
    }
    

}