import java.util.ArrayList;

public class Recursion_22_3
{
    public static void main(String[] args)
    {
        int[] arr1 = { 1 , 2 , 3 , 6 , 9 , 11 , 18 };
        sortedArray(arr1);

        int[] arr2 = { 3 , 10 , 42 , 32 , 32 , 18 , 1 , 0 };
        int target = 32;
        boolean bool1 = linearSearch(arr2 , target , 0);
        System.out.println(bool1);
        int ans1 = linearSearchIndex(arr2 , target , 0);
        System.out.println(ans1);
        linearSearchMultiple_1(arr2 , target , 0);
        System.out.println(lst);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans2 = linearSearchMultiple_2(arr2 , target , 0 , list );
        System.out.println(ans2);
        ArrayList<Integer> ans3 = linearSearchMultiple_3(arr2 , target , 0 );
        System.out.println(ans3);

        int[] arr3 = { 4 , 5 , 7 , 9 , 11 , 16 , 1 , 3};
        int targ = 1;
        int ans4 = rotatedBinary(arr3 , 0 , arr3.length -1 , targ);
        System.out.println(ans4);
    }

    // Sorted Array
    static void sortedArray(int[] arr)
    {
        boolean bool1 = search_1(arr , 0 , true);
        System.out.println(bool1);

        boolean bool2 = search_2(arr, 0);
        System.out.println(bool2);
    }
    static boolean search_1(int[] arr , int index , boolean cont)
    {
        if(cont && index + 1 < arr.length)
        {
            if(arr[index] < arr[index+1])
            {
                return search_1(arr , index + 1 , true);
            }
            else
            {
                return search_1(arr , index + 1 , false);
            }
        }
        return cont;
    }
    static boolean search_2(int[] arr , int index)
    {
        if(index + 1 == arr.length)
        {
            return true;
        }
        return arr[index] < arr[index + 1] && search_2(arr , index + 1);
    }

    // Linear Search
    static boolean linearSearch(int[] arr , int target , int idx)
    {
        if(idx == arr.length - 1 )
        {
            return false;
        }
        return arr[idx] == target || linearSearch(arr , target , idx + 1 );
    }
    static int linearSearchIndex(int[] arr , int target , int idx)
    {
        if(idx == arr.length - 1)
        {
            return -1;
        }
        if(arr[idx] == target)
        {
            return idx;
        }
        else
        {
            return linearSearchIndex(arr , target , idx + 1);
        }
    }
    static ArrayList<Integer> lst = new ArrayList<>();
    static void linearSearchMultiple_1(int[] arr , int target , int idx )
    {
        if(idx == arr.length - 1)
        {
            return;
        }
        if(arr[idx] == target)
        {
            lst.add(idx);
        }
        linearSearchMultiple_1(arr , target , idx + 1 );
    }
    static ArrayList<Integer> linearSearchMultiple_2(int[] arr , int target , int idx , ArrayList<Integer> list)
    {
        if(idx == arr.length - 1)
        {
            return list;
        }
        if(arr[idx] == target)
        {
            list.add(idx);
        }
        return linearSearchMultiple_2(arr , target , idx + 1 , list);
        // these are all different reference variables pointing to the same object
    }
    static ArrayList<Integer> linearSearchMultiple_3(int[] arr , int target , int idx)
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length - 1)
        {
            return list;
        }
        if(target == arr[idx])
        {
            list.add(idx);
        }
        ArrayList<Integer> listOther =  linearSearchMultiple_3(arr, target , idx + 1);

        list.addAll(listOther);

        return list;
    }

    // Rotated Binary Search
    static int rotatedBinary(int[] arr , int str , int end , int target)
    {
        if(str > end)
        {
            return -1;
        }
        int mid = str + ( end - str ) / 2;
        if( target == arr[mid])
        {
            return mid;
        }
        if(arr[mid] >= arr[str])
        {
            if(target < arr[mid] && target > arr[str])
            {
                return rotatedBinary(arr , str , mid - 1 , target);
            }
            return rotatedBinary(arr , mid + 1 , end , target);
        }
        else
        {
            if (target >= arr[mid] && target <= arr[end])
            {
                return rotatedBinary(arr , mid + 1 , end , target);
            }
            return rotatedBinary(arr , str , mid - 1 , target);
        }
    }

}
