import java.util.Scanner;

public class Odd_or_even {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a Number: ");
        Integer a=input.nextInt();
        if(a%2==0)
        {
            System.out.println("The given number is EVEN");
        }
        else
        {
            System.out.println("The given number is ODD");
        }
    }
}
