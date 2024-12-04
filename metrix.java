import java.util.*;


class metrix {

   public static void main (String[] args) {
   	
   		int r1,c1,sum=0,i,j,k;
   		Scanner obj=new Scanner(System.in);
   		System.out.print("Enter The Number Of Row:");
   			
		r1=obj.nextInt();
		System.out.print("Enter  The number of Columns:");
		c1=obj.nextInt();
		int mat1[][]=new int [r1][c1];		
		int mat2[][]=new int [r1][c1];
		
		System.out.println("Enter The First Matrix Element:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				mat1[i][j]=obj.nextInt();
			}
		}

		System.out.println("Enter The Second Matrix Element:");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				mat2[i][j]=obj.nextInt();
			}
		}
		int result[][]=new int[r1][c1];
		System.out.println("Multiplication of Both Matrix Is.....");
		
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
				for(k=0;k<r1;k++)
				{
					sum+=mat1[i][k] * mat2[k][j];
				}
				result [i][j]=sum;
				sum=0;
			}
		}	
	
		System.out.println("Now Multiplication Result Is :");
				
		for(i=0;i<r1;i++)
		{
			System.out.println();
			for(j=0;j<c1;j++)
			{
				System.out.print(result [i][j]+"\t");
			}
			System.out.print("");							
		}
   }  

}	