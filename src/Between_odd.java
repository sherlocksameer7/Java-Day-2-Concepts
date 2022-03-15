import java.util.Scanner;

public class Between_odd {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a number between Ranges Upto: ");
        Integer num=input.nextInt();
        System.out.println("Enter lower value: ");
        Integer lower=input.nextInt();
        for (int i = lower; i <= num; i++)
        {
            if (i % 2 != 0)
            {
                System.out.print(i + " ");
            }
        }
    }
}