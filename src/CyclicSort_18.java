import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort_18
{
    // Cyclic Sort - Swapping with the correct position (index =  value - 1)
    // Given range from 1 to N then use cyclic sort
    public static void main(String[] args)
    {
        int[] arr = {2 , 4 , 5 , 3 , 1 , 8 , 6 , 7};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));

        // Question1 - 268 - Missing Number
        int[] arr1 = {3 , 2 , 4 , 0 , 1};
        int ans1 = missingNumber(arr1);
        System.out.println(ans1);

        // Question2 - 448 - Find all numbers disappeared in an Array
        int[] arr2 = {4 , 5 , 1 , 1 , 2 , 8 , 2 , 3 };
        List<Integer> ans2 = disappearSearch(arr2);
        System.out.println(Arrays.toString(new List[]{ans2}));

        // Question3 - 287 - Find the Duplicate Number
        int[] arr3 = { 4 , 2 , 2 , 1 , 4};
        int ans3 = findDuplicate(arr3);
        System.out.println(ans3);

        // Question4 - 442 - Find all duplicate in an array
        int[] arr4 = { 2 , 3 , 1 , 5 , 3 , 4 , 4 };
        List<Integer> ans4 = findAllDuplicate(arr4);
        System.out.println(ans4);

        // Question5 - 645 - Set Mismatch
        int[] arr5 = { 1 , 2 , 1 , 3 };
        int[] ans5 = findErrorNums(arr5);
        System.out.println(Arrays.toString(ans5));

        // Question6 - 41 - Find the missing positive
        int[] arr6 = { 8 , 11 , 10 , 7 , 9 };
        int ans6 = missingPositive(arr6);
        System.out.println(ans6);

    }
    static void cyclicSort(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int val = arr[i] - 1;
            if(i != val )
            {
                int swap = arr[i];
                arr[i] = arr[val];
                arr[val] = swap;
            }
            else
            {
                i++;
            }
        }
    }

    // Question1 - 268 - Missing Number
    static int missingNumber(int[] arr)
    {
        int i = 0;
        while( i < arr.length)
        {
            int val = arr[i];
            if(i != val && val < arr.length)
            {
                int swap = arr[i];
                arr[i] = arr[val];
                arr[val] = swap;
            }
            else
            {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j] != j)
            {
                return j;
            }
        }
        return arr.length;
    }

    // Question2 - 448 - Find all numbers disappeared in an Array
    static List<Integer> disappearSearch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int val = arr[i] - 1;
            if (arr[i] != arr[val]) {
                int swap = arr[i];
                arr[i] = arr[val];
                arr[val] = swap;
            } else {
                i++; 
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < arr.length; j++)
        {
            if (j != (arr[j] - 1))
            {
                list.add(j+1);
            }
        }
        return list;
    }

    // Question3 - 287 - Find the Duplicate Number
    static int findDuplicate(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            if(arr[i] != i + 1)
            {
                int change = arr[i] - 1;
                if(arr[i] != arr[change])
                {
                    int swap = arr[i];
                    arr[i] = arr[change];
                    arr[change] = swap;
                }
                else
                {
                    return arr[i];
                }
            }
            else
            {
                i++;
            }
        }
        return -1;
    }

    // Question4 - 442 - Find all duplicate in an array
    static List<Integer> findAllDuplicate(int[] arr)
    {
        int i = 0;
        List<Integer> lst = new ArrayList<>();
        while(i < arr.length)
        {
            int val = arr[i] - 1;
            if(arr[i] != arr[val])
            {
                int swap = arr[i];
                arr[i] = arr[val];
                arr[val] = swap;
            }
            else
            {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j] != j+1)
            {
                lst.add(arr[j]);
            }
        }
        return lst;
    }

    // Question5 - 645 - Set Mismatch
    static int[] findErrorNums(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int val = arr[i] - 1;
            if(arr[i] != arr[val])
            {
                int swap = arr[i];
                arr[i] = arr[val];
                arr[val] = swap;
            }
            else
            {
                i++;
            }
        }
        int j = 0;
        for (j = 0; j < arr.length; j++)
        {
            if(arr[j] != j + 1)
            {
                return new int[]{arr[j] , j+1};
            }
        }
        return new int[]{-1,-1};
    }

    // Question6 - 41 - Find the missing positive
    static int missingPositive(int[] arr)
    {
        int i = 0;
        while(i < arr.length)
        {
            int sml = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[sml])
            {
                int swap = arr[i];
                arr[i] = arr[sml];
                arr[sml] = swap;
            }
            else
            {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++)
        {
            if(arr[j] != j + 1)
            {
                return j + 1;
            }
        }
        return arr.length + 1;
    }
}
