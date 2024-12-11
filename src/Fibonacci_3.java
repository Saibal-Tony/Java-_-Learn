import java.util.Scanner;

public class Fibonacci_3
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("The no. of fibonacci no. :");
        int n = in.nextInt();

        for (int i = 2; i <= n; i++)
        {
            int c = a+b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }
}
