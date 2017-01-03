/**
 *
 * @author Daniel Karlsson 2016
 *
 */

package Geometry;

//import java.text.DecimalFormat;

public class Cube extends Shape3D {
    
    private double faceDiagonal, spaceDiagonal, circumscribedSphereRadius, inscribedSphereRadius, sphereTangentToEdgesRadius, anglesBetweenFacesInRadians;
    
    public Cube(double edgeLength) {
        this.height = edgeLength;
        this.width = edgeLength;
        this.length = edgeLength;
    }
    
    //Methods
    @Override
    public void calculateValues() {
        this.surfaceArea = (6*(Math.pow(height, 2)));
        this.volume = (Math.pow(height, 3));
        faceDiagonal = (height*(Math.sqrt(2)));
        spaceDiagonal = (height*(Math.sqrt(3)));
        circumscribedSphereRadius = (((Math.sqrt(3)) / 2) * height);
        inscribedSphereRadius = (height/2);
        sphereTangentToEdgesRadius = (height / (Math.sqrt(2)));
        anglesBetweenFacesInRadians = ((Math.PI) / 2);
    }
    
    //Getters
    public double getFaceDiagonal() {
        return faceDiagonal;
    }
    
    public double getSpaceDiagonal() {
        return spaceDiagonal;
    }
    
    public double getCircumscribedSphereRadius() {
        return circumscribedSphereRadius;
    }
    
    public double getInscribedSphereRadius() {
        return inscribedSphereRadius;
    }
    
    public double getSphereTangentToEdgesRadius() {
        return sphereTangentToEdgesRadius;
    }
    
    public double getAnglesBetweenFacesInRadians() {
        return anglesBetweenFacesInRadians;
    }
    
}
