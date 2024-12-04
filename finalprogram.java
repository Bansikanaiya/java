
abstract class shape
{
	private double width,height;
	public shape(double h,double w)
	{
		width=w;
		height=h;
	}
	public final double getwidth()
	{
		return width;
	}
	public final double getheight()
	{
		return height;
	}
	abstract double getarea();
	
}
class ractangle extends shape
{
	public ractangle(double h,double w)	
	{
		super(w,h);
	}
	final double getarea()
	{
		return this.getheight() * this.getwidth();
	}
}
class square extends shape
{
	public square(double side)	
	{
		super(side,side);
	}
	final double getarea()
	{
		return this.getheight() * this.getwidth();
	}
}
public class finalprogram 
{

   
   public static void main (String[] args) 
   	
   	{
   	shape r=new ractangle(10,20);
   	shape s=new square(10);
   	
   	System.out.println("Width of ractangle:"+r.getwidth());
   	System.out.println("height of ractangle:"+r.getheight());
   	System.out.println("Width of square:"+s.getwidth());
   	System.out.println("height of square:"+s.getheight());
   	
   	System.out.println("\nArea of ractangle:"+r.getarea());
   	System.out.println("Area of Square:"+s.getarea());
}
    
    
}