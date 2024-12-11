public  class Recursion_22_1
{
    public static void main(String[] args)
    {
        message1();

        printNum(1);

        // fibonacci
        int num = 6;
        System.out.println(fibonacci(num));

        // Binary Search
        int[] arr = { 2 , 4 , 5 , 6 , 8 , 10 , 15 , 17 , 22 };
        int tar = 10;
        int res = binarySearch(arr , 0 , arr.length - 1 , tar);
        System.out.println("Binary Search location: " + res);
    }

    static void message1()
    {
        message2();
        System.out.println("Good Morning 1");
    }

    static void message2()
    {
        message3();
        System.out.println("Good Morning 2");
    }
    static void message3()
    {
        System.out.println("Good Morning 3");
    }

    // No. print
    static void printNum(int n)
    {
        if(n > 5)
        {
            return;
        }
        System.out.println(n);
        printNum(n + 1); // tail recursion --> this is the last function call
    }

    // Fibonacci no.
    static int fibonacci(int n)
    {
        if(n < 2)
        {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n -2);
    }

    // Binary search
    static int binarySearch(int[] arr , int str , int end , int tar)
    {
        if(str > end )
        {
            return -1;
        }
        int mid = str + ( end - str ) / 2;
        if(tar == arr[mid])
        {
            return mid;
        }
        else if (tar < arr[mid])
        {
            return binarySearch(arr, str ,mid - 1 , tar);
        }
        else
        {
            return binarySearch(arr, mid + 1 , end , tar);
        }
    }

}
