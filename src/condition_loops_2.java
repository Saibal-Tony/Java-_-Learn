import java.util.Scanner;

public class condition_loops_2
{
    public static void main(String[] args)
    {
        // if condition
        Scanner in = new Scanner (System.in);
        System.out.print("Enter your salary");
        int sal = in.nextInt();

        if(sal > 10000)
        {
            sal += 2000;
        }
        else if (sal > 2000)
        {
            sal += 3000;
        }
        else
        {
            sal += 1000;
        }
        System.out.println(sal);


        // loop
        // for loop
        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.println(i);
        }

        // while loop
        int j = 0;
        while(j <= 5)
        {
            System.out.println(j);
            j += 1;
        }

        // do while loop (This loop will run at least once)
        int n = 1;
        do
        {
            System.out.println(n);
            n++;
        }while(n <= 5);

        // largest no.
        System.out.print("Enter 1st no.:");
        int x = in.nextInt();
        System.out.print("Enter 2nd no.:");
        int y = in.nextInt();
        System.out.print("Enter 3rd no.:");
        int z = in.nextInt();

        int max = x;
        if(y > max)
        {
            max = y;
        }
        if (z > max)
        {
            max = z;
        }

        System.out.println("Maximum value is :" + max);

        int maximum = Math.max(z , Math.max(x,y));
        System.out.println("Maximum value is :" + maximum);

        // Case Check
        System.out.print("Enter the Word : ");
        char ch = in.next().trim().charAt(0);
        // trim() - erases all the spaces / empty spaces
        // charAt() - take the character form that particular location
        if (ch >= 'A' && ch <='Z') // && - And  --- || - Or
        {
            System.out.println("Uppercase");
        }
        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase");
        }
    }
}
