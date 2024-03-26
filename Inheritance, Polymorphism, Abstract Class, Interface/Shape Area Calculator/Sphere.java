import java.lang.*;
public class Sphere extends Shape
{
    private double radius;
    
    public double getRadius(){
        return radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double area(){
        return 4*Math.PI*radius*radius;
    }
    
    public double volume(){
        return (4*Math.PI*Math.pow(radius,3))/3;
    }
}
