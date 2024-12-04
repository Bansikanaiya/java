
import java.util.*;

public class palindrom {

  public static void main (String[] args) {
  	int no,rev=0,rem,temp;
  	Scanner s=new Scanner(System.in);
  	System.out.print("Enter Number: ");
  	no=s.nextInt();
  	
  	temp=no;
  	
  	do{
  		rem=no%10;
  		rev=rev*10+rem;
  		no=no/10;
  	}while(no!=0);
  	
  		if(temp==rev)
  		{
  			System.out.print("This is Palindrom Number: "+temp);
  			
  		}
  		else
  		{
  			System.out.print("This is Not Palindrom Number: "+temp);
  		}
}
    
    
}