import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Shape[] obj = new Shape[5];
        
        for(int i=0;i<5;i++){
            String str = sc.nextLine();
            if(str.equalsIgnoreCase("triangle")){
                double base = Double.parseDouble(sc.nextLine());
                double height = Double.parseDouble(sc.nextLine());
                
                Triangle triangle = new Triangle();
                triangle.setBase(base);
                triangle.setHeight(height);
                
                obj[i] = triangle;
            }
            else if(str.equalsIgnoreCase("sphere")){
                double radius = Double.parseDouble(sc.nextLine());
                Sphere sphere = new Sphere();
                sphere.setRadius(radius);
                obj[i] = sphere;
            }
            else if(str.equalsIgnoreCase("rectangle")){
                double length = Double.parseDouble(sc.nextLine());
                double width = Double.parseDouble(sc.nextLine());
                Rectangle rectangle = new Rectangle();
                rectangle.setLength(length);
                rectangle.setWidth(width);
                obj[i] = rectangle;
            }
            else if(str.equalsIgnoreCase("cube")){
                double length = Double.parseDouble(sc.nextLine());
                double width = Double.parseDouble(sc.nextLine());
                double height = Double.parseDouble(sc.nextLine());
                
                Cube cube = new Cube();
                cube.setLength(length);
                cube.setWidth(width);
                cube.setHeight(height);
                obj[i] = cube;
            }
            
        }
        
        for(int i=0;i<5;i++){
            System.out.println("Area " + obj[i].area());
            double volume = obj[i].volume();
            if(volume!= -1){
                System.out.println("Volume "+volume);
            }
        }
    }
}
