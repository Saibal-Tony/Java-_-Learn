import java.util.Arrays;

import static java.io.ObjectInputFilter.merge;

public class MergeSort_23
{
    public static void main(String[] args)
    {
        int[] arr1 = { 27 , 44 , 10 , 81 , 23 , 63 , 59 , 9 };
        int[] ans = mergeSort(arr1);
        System.out.println(Arrays.toString(ans));

        int[] arr2 = { 27 , 44 , 10 , 81 , 23 , 63 , 59 , 9 };
        mergeInplace(arr2 , 0 , arr2.length);
        System.out.println(Arrays.toString(arr2));
    }

    static int[] mergeSort(int[] arr)
    {
        if(arr.length == 1)
        {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr , 0 , mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid , arr.length));

        return  merge(left , right);
    }
    static int[] merge(int[] first , int[] second)
    {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length)
        {
            if(first[i] < second[j])
            {
                mix[k++] = first[i++];
            }
            else
            {
                mix[k++] = second[j++];
            }
        }
        while(i < first.length)
        {
            mix[k++] = first[i++];
        }
        while(j < second.length)
        {
            mix[k++] = second[j++];
        }

        return mix;
    }

    static void mergeInplace(int[] arr , int str , int end)
    {
        while(end - str == 1)
        {
            return;
        }
        int mid = str + ( end - str ) / 2;

        mergeInplace(arr , str , mid);
        mergeInplace(arr , mid , end);

        mergeMix(arr , str , mid , end);
    }
    static void mergeMix(int[] arr , int str , int mid , int end)
    {
        int i = str;
        int j = mid;
        int k = 0;
        int[] mix = new int[end - str];

        while(i < mid && j < end) // because i will be going till mid and j is going till end
        {
            if(arr[i] < arr[j])
            {
                mix[k++] = arr[i++];
            }
            else
            {
                mix[k++] = arr[j++];
            }
        }
        while(i < mid)
        {
            mix[k++] = arr[i++];
        }
        while(j < end)
        {
            mix[k++] = arr[j++];
        }

        for (int m = 0; m < mix.length; m++)
        {
            arr[str + m] = mix[m];
        }
    }

}
