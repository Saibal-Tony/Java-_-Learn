public class CountOccurrence_Reverse_4
{
    public static void main(String[] args)
    {
        //Counting the occurrence
        int a = 1385757879;
        int cnt = 0;

        while (a > 0)
        {
            int rem = a % 10;
            if(rem == 7)
            {
                cnt ++;
            }
            a = a / 10;
        }
        System.out.println("Count: " + cnt);

        //Reverse
        long b = 1385757879;
        long sum = 0;
        while( b > 0)
        {
            long rem = b % 10;
            sum = sum*10 + rem;
            b = b / 10;
        }
        System.out.println("The reverse is: " + sum);
    }
}
