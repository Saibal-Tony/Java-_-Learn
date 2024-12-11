import java.util.Scanner;

public class Prime_7
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter OOP_24_2.OOP_24_2.b.a number to check prime: ");
        int n = in.nextInt();
        boolean result = isPrime(n);
        System.out.println(result);
    }

    static boolean isPrime(int n)
    {
        if (n <= 1)
        {
            return false;
        }
        int c = 2;
        while(c * c <= n)
        {
            if(n % c == 0)
            {
                return false;
            }
            c++;
        }
        return c * c > n;
    }
}
