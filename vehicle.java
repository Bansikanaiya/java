

public class vehicle {
 
    
}

class car extends vehicle
{
	public static void main (String[] args) {
		vehicle a=new car();
		boolean res=a instanceof car;
		System.out.println(res);
}
}