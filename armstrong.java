import java.util.*;

class armstrong {

    public static void main(String[] args) {

        int number, originalNumber, rem, res = 0;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter number: ");
        number=obj.nextInt();

        originalNumber = number;

        while (originalNumber != 0)
        {
            rem = originalNumber % 10;
            res += Math.pow(rem, 3);
            originalNumber /= 10;
        }

        if(res == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }
}




  
    
