public class Circle {
	
    private double x, y, r;
   
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.r = 1;
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

  
    public double area() {
        return Math.PI * r * r;
    }

    public double circumference() {
        return 2 * Math.PI * r;
    }

  
    public double diameter() {
        return 2 * r;
    }
    public static void main(String[] args) {
        
        Circle circle1 = new Circle();
        System.out.println("Default Circle:");
        System.out.println("Area: " + circle1.area());
        System.out.println("Circumference: " + circle1.circumference());
        System.out.println("Diameter: " + circle1.diameter());

        Circle circle2 = new Circle(5, 5, 10);
        System.out.println("\nParameterized Circle:");
        System.out.println("Area: " + circle2.area());
        System.out.println("Circumference: " + circle2.circumference());
        System.out.println("Diameter: " + circle2.diameter());
    }
}

