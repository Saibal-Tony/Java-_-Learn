import java.util.Arrays;

public class LinearSearch_10
{
    // Linear Searching - checks the full array and find the value
    public static void main(String[] args)
    {
        int[] arr1 = {100 , 33 , 82 , 58 , 49 , 21};
        int tar = 81;
        int res1 = linearSearchPos(arr1 , tar);
        System.out.println(res1);

        int res2 = linearSearchVal(arr1 , tar);
        System.out.println(res2);

        String str = "SaibalTony";
        boolean bool = StringSearch(str , 't');
        System.out.println(bool);

        //Minimum number
        int res3 = minNum(arr1);
        System.out.println(res3);

        // Search in 2D-Array
        int[][] arr2 ={
                        {23, 4, 1},
                        {18, 12, 3, 9},
                        {78, 99, 34, 56},
                        {18, 12}
                       };
        int tar2 = 99;
        int[] res4 = search2D(arr2 , tar2);
        System.out.println(Arrays.toString(res4));

        // Question 1: 1295 (leetcode)
        int[] nums = {12 , 345 , 2 , 61  , 7896};
        int res5 = findNumbers(nums);
        System.out.println(res5);

        // Question 2: 1672 (leetcode)
        int[][] accounts = {{ 1 , 2 , 3  } , { 3 , 2 , 1 }};
        int res6 = maximunWealth(accounts);
        System.out.println(res6);

    }

    // Linear Search (return position)
    static int linearSearchPos (int[] arr ,int val)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == val)
            {
                return i;
            }
        }
        return -1;
    }

    // Linear Search (return position)
    static int linearSearchVal (int[] arr ,int val)
    {
        for (int i : arr)
        {
            if (i == val)
            {
                return i;
            }
        }
        return Integer.MAX_VALUE; // Constant value
    }

    // Search in String
    static boolean StringSearch(String str , char ch)
    {
        if(str.isEmpty())
        {
            return false;
        }
//        for (int i = 0; i < str.length(); i++)
//        {
//            if(str.charAt(i) == ch)
//            {
//                return true;
//            }
//        }
        for(char cha : str.toCharArray()) // str.toCharArray() -> converts the string to char arrays.
        {
            if(cha == ch)
            {
                return true;

            }
        }
        return false;
    }

    // Minimum Number
    static int minNum(int[] arr)
    {
        int min = arr[0];
        for (int j : arr)
        {
            if (min > j)
            {
                min = j;
            }
        }
        return min;
    }

    // 2D-Array search
    static int[] search2D (int[][] arr , int val)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if(arr[i][j] == val)
                {
                     return new int[]{i , j}; // you have to initialize and then print
                }
            }
        }
        return new int[]{-1,-1};
    }

    // Q)1295: Find the even no. of digits
    public static int findNumbers(int[] nums)
    {
        int cnt = 0 ;
        for (int num : nums)
        {
            if (even(num))
            {
                cnt++;
            }
        }
        return cnt;
    }
    static boolean even(int n)
    {
        if(n < 0)
        {
            n = n * -1;
        }
        int cnt = 0;
        while(n > 0)
        {
            n = n / 10;
            cnt++;
        }
        return cnt % 2 == 0;
    }
    // previous question (counts the number of digits )
    static int digitNum(int num)
    {
        if(num < 0)
        {
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }

    // Q)1672: Find the richest bank account among the individuals
    static int maximunWealth(int[][] accounts)
    {
        int max = 0;

        for (int i = 0; i < accounts.length; i++)
        {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++)
            {
                sum = sum + accounts[i][j];
            }
            if(sum > max)
            {
                max = sum;
            }
        }
        return max;
    }

}
