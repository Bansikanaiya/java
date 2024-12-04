import java.util.Scanner;

class swap
{
    static void swapvalue(int no1,int no2)
    {
        no1=no1-no2;
        no2=no1+no2;
        no1=no2-no1;
        System.out.println("\nvalue of no1 is:"+no1+"\nvalue of no2 is: "+no2);
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter value of no1: ");
        int n1=obj.nextInt();
        System.out.print("Enter value of no2: ");
        int n2=obj.nextInt();
        swapvalue(n1, n2);
    }
}