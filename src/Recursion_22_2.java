public class Recursion_22_2
{
    public static void main(String[] args)
    {
        printRev(5);
        printFor(5);

        int ans1 = factorial(4);
        System.out.println(ans1);

        int ans2 = sum(5);
        System.out.println(ans2);

        int ans3 = sumOfDigits(143);
        System.out.println(ans3);

        reverse_1(1824);
        System.out.println(sum);

        int ans4 = reverse_2(1829);
        System.out.println(ans4);

        countZero(10442010 , 0);

        // Question - 1342
        int ans5 = numberOfSteps(14);
        System.out.println(ans5);
    }

    static void printRev(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        printRev(n - 1);
    }

    static void printFor(int n)
    {
        if( n == 0 )
        {
            return;
        }
        printFor(n - 1 );
        System.out.println(n);
    }

    // Factorial
    static int factorial(int n)
    {
        if(n == 0)
        {
            return 1 ;
        }
        return factorial(n - 1) * n;
    }

    // Sum of n numbers
    static int sum(int a )
    {
        if(a <= 1)
        {
            return 1;
        }
        return a + sum(a - 1);
    }

    static int sumOfDigits(int a)
    {
        if(a <=  0)
        {
            return 0;
        }
        return a%10 + sumOfDigits(a/10);
    }

    // Reverse of OOP_24_2.OOP_24_2.b.a
    static int sum = 0;
    static void reverse_1(int a)
    {
        if(a <= 0)
        {
            return;
        }
        int rem = a%10 ;
        sum = sum*10 + rem;
        reverse_1(a/10);
    }
    static int reverse_2(int a)
    {
        int digit = (int)(Math.log10(a)) + 1;
        return helper(a , digit);
    }
    static int helper(int a , int digit)
    {
        if(a%10 == a)
        {
            return a;
        }

        int rem = a % 10;
        return (int) (rem * Math.pow(10 , digit - 1) + helper(a/10 , digit -1 ));
    }

    // Count no. of 0
    static void countZero(int a , int cnt)
    {
        if(a <= 0)
        {
            System.out.println(cnt);
            return;
        }
        if(a%10 == 0)
        {
            countZero(a/10 , cnt + 1);
        }
        else
        {
            countZero(a/10 , cnt);
        }
    }

    // Question - 1342 - Number of steps to reduce OOP_24_2.OOP_24_2.b.a number to zero
    static int numberOfSteps(int num)
    {
        return countSteps(num , 0);
    }
    static int countSteps(int num , int cnt)
    {
        if(num <= 0)
        {
            return cnt;
        }
        if(num%2 == 0)
        {
            return countSteps(num/2 , cnt + 1);
        }
        else
        {
            return countSteps(num - 1 , cnt + 1);
        }
    }

}
