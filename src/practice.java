import java.util.Scanner;

public class practice
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the first no.: ");
        int a = in.nextInt();
        System.out.print("Enter the second no.: ");
        int b = in.nextInt();
//        a=5;b=7 ;
        int sum = a + b;

        System.out.println("The result is " + (a+b) + ".");


//        System.out.println(sum);

        // function
//        double abc = 15;
        double result1 = sum(5 , 56.98);
        double result2 = sum(45 , 2342847.0928442);
        System.out.println(result1);
        System.out.println(result2);

    }

    // function
    public static double sum(int a , double b) // parameter
    {
        return a + b;
    }
}
