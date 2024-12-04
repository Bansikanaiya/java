class rectangle
{
	double l,b;
	public double area()
	{
		return l*b;
	}
	public void setr(double l, double b)
	{
		this.l=l;
		this.b=b;
	}
}
class rectdemo
{
	public static void main(String[] args)
	{
		rectangle r=new rectangle();
		r.setr(10,20);
		System.out.println(" "+r.area());
	}
}