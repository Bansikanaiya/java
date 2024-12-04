
import java.util.*;

public class primeno {

   public static void main (String[] args) {
   	int i,m=0,flag=0,no;
   		
   	Scanner obj=new Scanner(System.in);
   	
   	System.out.print("Enter Number:");
   	no=obj.nextInt();
   	
   	m=no/2;
   	
   	if(no==0||no==1)
   	{
   		System.out.println(no+" Is not Prime No");
   	}
   	else
   	{
   		for(i=2;i<=m;i++)
   		{
   			if(no%i==0)
   			{
   				System.out.println(no+" Is not Prime No");
   				 flag=1;      
    			 break; 
   			}
   		
   		}
   		if(flag==0)
   		{
   				System.out.println(no+" Is Prime No");
   		}
   	}	
}
    
    
}