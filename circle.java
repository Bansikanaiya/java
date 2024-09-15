
public class circle 
{
    private double x, y, r;
	
    public circle(double radius) {
        this.r = radius;
        System.out.println("Circle created with radius: " + radius);
    }
    
    public double area() 
	{
        return Math.PI * r * r;
    }
    
    public double circumference() 
	{
        return 2 * Math.PI * r;
    }
 
    public double diameter() 
	{
        return 2 * r;
    }
    
    public static void main(String[] args) 
	{
  
        circle c = new circle(4);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
        System.out.println("Diameter: " + c.diameter());
    }
}
