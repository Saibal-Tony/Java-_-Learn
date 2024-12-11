import java.util.Arrays;

public class BinarySearchQuestions_13
{
    public static void main(String[] args)
    {

        // Question1 - 744
        char[] letters = {'a' , 'b' ,'c'};
        char tar1 = 'z';
        char res1 = nextGreatestLetter(letters , tar1);
        System.out.println(Arrays.toString(new char[]{res1}));

        // Question2 - 34
        int[] arr1 = {1 , 3 , 3 , 3 , 4 , 5 , 8 , 8 , 8 , 8 , 8 , 10};
        int tar2 = 8;
        int[] res2 = searchRange(arr1 , tar2);
        System.out.println(Arrays.toString(res2));

        // Question3 - GFG
        int[] arr2 = {11 , 23 , 24 , 27 , 28 , 29 , 33 , 37 , 39 , 40 , 43 , 44 , 47 , 48 , 49 , 51 , 53 , 55 , 58 , 60};
        int tar3 = 40;
        int res3 = FindElement(arr2, tar3);
        System.out.println(res3);

        // Question4 - 852 - 162 - Peek index in OOP_24_2.OOP_24_2.b.a mountain array
        int[] arr3 = { 1 , 2 , 3 , 5 , 7 , 4 , 3 , 1 };
        int res4 = peakIndex(arr3);
        System.out.println(res4);

        // Question5 - 1095 - Peak Mountain value
        int[] arr4 = { 1 , 2 , 3 , 5 , 7 , 4 , 3 , 1 };
        int tar4 = 3;
        int res5 = result(arr4 , tar4);
        System.out.println(res5);

        //  Question6 - 33 - Search in OOP_24_2.OOP_24_2.b.a rotated sorted array
        int[] arr5 = { 3 , 4 , 5 , 6 , 8 , 0 , 2 };
        int tar5 = 0;
        int res6 = rotateSEARCH(arr5 , tar5);
        System.out.println(res6);

        // Question7 - Pivot with duplicate
        int[] arr6 = { 5 , 6 , 6 , 7 , 7 , 9 , 10 , 0 , 2 , 2 , 4 };
        int res7 = pivotWithDuplicate(arr6);
        System.out.println(res7);

        // Question8 - Rotation count in rotated sorted array
        int[] arr7 = { 3 , 4 , 5 , 6 , 8 , 0 , 2 };
        int res8 = rotateCount(arr7);
        System.out.print("Rotate count: ");
        System.out.println(res8);

        // Question9 - 410 - Split array largest sum
        int[] arr8 = { 7 , 2 , 5 , 10 , 8 };
        int m = 2;
        int res9 = splitArray(arr8 , m);
        System.out.println(res9);
    }

    // Question1 - 744 - Find the smallest letter greater than target
    public static char nextGreatestLetter(char[] letters , char target)
    {
        int s = 0;
        int e = letters.length - 1 ;

        while(s <= e)
        {
            int m = s + (e - s) / 2;
            if(letters[m] > target)
            {
                e = m - 1;
            }
            else if(letters[m] < target)
            {
                s = m + 1;
            }
            else
            {
                return letters[s];
            }
        }
        return letters[0];
    }

    // Question2 - 34 - Find first and last position of element in sorted array
    public static int[] searchRange(int[] nums , int target)
    {
        int[] ans  = { -1 , -1 };

        ans[0] = search(nums , target , true);
        if(ans[0] != 0)
        {
            ans[1] = search(nums , target , false);
        }

        return ans;
    }
    public static int search(int[] nums , int target , boolean findstartIndex)
    {
        int ans = -1;
        int s = 0;
        int e = nums.length - 1;

        while(s <= e)
        {
            int m = s + ( e - s ) / 2;
            if(target > nums[m])
            {
                s = m + 1;
            }
            else if(target < nums[m])
            {
                e = m - 1;
            }
            else
            {
                ans = m;
                if(findstartIndex)
                {
                    e = m - 1;
                }
                else
                {
                    s = m + 1;
                }
            }
        }
        return ans;
    }

    // Question3 - Find the position of an element in OOP_24_2.OOP_24_2.b.a sorted array of infinite numbers
    public static int FindElement(int[] arr , int target)
    {
        int s = 0;
        int e = 1;

        while(target > arr[e])
        {
            int nStart = e + 1;
            e = e + (e - s + 1) * 2;
            s = nStart;
        }

        return BinarySearch(arr , target , s , e);
    }
    public static int BinarySearch(int[] arr, int tar , int str , int end)
    {
        while(str <= end)
        {
            int mid = str + ( end - str ) / 2;
            if(tar < arr[mid])
            {
                end = mid - 1;
            }
            else if(tar > arr[mid])
            {
                str = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;
    }

    // Question4 - 852 - 162 - Peek index in OOP_24_2.OOP_24_2.b.a mountain array
    public static int peakIndex(int[] arr)
    {
        int s = 0;
        int e = arr.length - 1;
        while(s < e)
        {
            int m = s + ( e - s ) / 2;
            if(arr[m] > arr[m + 1])
            {
                e = m;
            }
            else
            {
                s = m + 1;
            }
        }
        return s; // return e ; --> as they are both equal
    }

    // Question5 - 1095 - Peak Mountain value
    public static int result(int[] arr , int target)
    {
        int ans = peak(arr);
        int res = BinaryLeft(arr , target , 0 , ans);
        if(res == -1)
        {
            res = BinaryRight(arr , target , (ans+1) , arr.length -1);
        }

        return res;
    }
    public static int peak(int[] arr)
    {
        int s = 0;
        int e = arr.length - 1;

        while(s < e)
        {
            int m = s + ( e - s ) / 2;
            if(arr[m] > arr[m + 1])
            {
                e = m ;
            }
            else
            {
                s = m + 1;
            }
        }
        return s;
    }
    public static int BinaryLeft(int[] arr , int tar , int s , int e )
    {
        while(s < e)
        {
            int m = s + (e - s) / 2;
            if(tar < arr[m])
            {
                e = m - 1;
            }
            else if (tar > arr[m])
            {
                s = m + 1;
            }
            else
            {
                return m ;
            }
        }
        return -1;
    }
    private static int BinaryRight(int[] arr, int target, int s, int e)
    {
        while(s <= e)
        {
            int m = s + ( e  - s ) / 2;
            if(target  > arr[m])
            {
                e = m - 1;
            }
            else if(target < arr[m])
            {
                s = m + 1;
            }
            else
            {
                return m;
            }
        }
        return -1;
    }

    // Question6 - 33 - Search in OOP_24_2.OOP_24_2.b.a rotated sorted array
    static int rotateSEARCH(int[] arr , int target)
    {
        int pivot = RotatedSearch(arr);
        int ans = BIsearch(arr , target , 0 , pivot);
        if(ans == -1)
        {
            ans = BIsearch(arr, target , (pivot+1) , arr.length -1);
        }

        return ans;
    }
    public static int RotatedSearch(int[] arr )
    {
        int s = 0;
        int e = arr.length - 1;

        while(s < e)
        {
            int m = s + ( e - s ) / 2;
            if(m < e && arr[m] > arr[m + 1]) // to prevent array out of bound ( m < e )
            {
                return m;
            }
            if(m > s && arr[m] < arr[m - 1])
            {
                return  (m - 1);
            }
            if(arr[m] <= arr[s])
            {
                e = m - 1;
            }
            else
            {
                s = m + 1;
            }
        }
        return -1;
    }
    static int BIsearch(int[] arr , int tar , int s , int e)
    {
        while( s <= e)
        {
            int m = s + ( e - s ) / 2;
            if(arr[m] < tar)
            {
                s = m + 1;
            } else if (arr[m] > tar)
            {
                e = m - 1;
            }
            else
            {
                return m;
            }
        }
        return -1;
    }

    // Question7 - Find pivot with duplicate
    static int pivotWithDuplicate(int[] arr)
    {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e)
        {
            int m = s + ( e - s ) / 2;
            if(arr[m] > arr[m + 1] && m < e)
            {
                return m;
            }
            if(arr[m] < arr[m - 1] && m > s)
            {
                return (m - 1);
            }
            if(arr[m] == arr[s] && arr[m] == arr[e])
            {
                if(arr[s] > arr[s+1])
                {
                    return s;
                }
                s++;
                if(arr[e] < arr[e-1])
                {
                    return (e - 1);
                }
                e--;
            }
            else if(arr[s] < arr[m] || (arr[s] == arr[m] && arr[m] > arr[e]))
            {
                s = m + 1;
            }
            else
            {
                e = m - 1;
            }
        }
        return -1;
    }

    // Question8 - Rotation count in rotated sorted array
    static int rotateCount(int[] arr)
    {
        int s = 0;
        int e = arr.length - 1;

        while(s <= e)
        {
            int m = s + ( e - s ) / 2;
            if(m < e && arr[m] > arr[m + 1])
            {
                return (m + 1);
            }
            if(m > s && arr[m] < arr[m - 1])
            {
                return m ;
            }
            if(arr[m] >= arr[s])
            {
                s = m + 1;
            }
            else
            {
                e = m - 1;
            }
        }
        return 0;
    }

    // Question9 - 410 - Split array largest sum
    static int splitArray(int[] arr , int m)
    {
        int s = 0;
        int e = 0;

        for (int j : arr)
        {
            s = Math.max(s, j);
            e += j;
        }

        while( s < e )
        {
            int mid = s + ( e - s ) / 2;

            // calculate the pieces
            int sum = 0;
            int pieces = 1;

            for( int nums : arr)
            {
                if(sum + nums > mid)
                {
                    sum = nums;
                    pieces++;
                }
                else
                {
                    sum += nums;
                }
            }

            if(pieces > m)
            {
                s = mid + 1;
            }
            else
            {
                e = mid;
            }
        }
        return e;
    }

}
