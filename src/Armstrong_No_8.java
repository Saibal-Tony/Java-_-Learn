import java.util.Scanner;

public class Armstrong_No_8
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter OOP_24_2.OOP_24_2.b.a number to check the Armstrong no.: ");
        int n = in.nextInt();

        boolean res = armstrongNo(n);
        System.out.println(res);
    }

    static boolean armstrongNo(int n)
    {
        int len = String.valueOf(n).length();
        int a = n;
        int sum = 0;
        while (n > 0)
        {
            int rem = n % 10;
            int cube = (int) Math.pow(rem , len);
            sum += cube;
            n = n/10;
        }
        return a == sum;
    }
}
