import java.util.Scanner;

public class Reading_an_input {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);

        Integer a,b,c;
        System.out.println("Enter 1st Number");
        a=input.nextInt();
        System.out.println("Enter 2nd Number");
        b= input.nextInt();
        c=a+b;
        System.out.println(c);
    }
}
