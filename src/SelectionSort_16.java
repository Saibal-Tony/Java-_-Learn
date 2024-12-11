import java.util.Arrays;

public class SelectionSort_16
{
    // Selection Sort - Swapping the location of the largest/smallest element with its proper location
    // O(N^2)
    public static void main(String[] args)
    {
        int[] arr1 = { 81 , 4 , 30 , 7 , 10 , 1 , 11 , 44 };
        selectionSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void selectionSort(int[] arr)
    {
        for (int str = 0; str < arr.length; str++)
        {
            int lst = arr.length - str - 1;
            int maxmum = max( arr , 0 , lst );
            swap(arr , maxmum , lst);
        }
    }
    static int max(int[] arr, int str , int end)
    {
        int max = str;
        for (int j = str; j <= end ; j++)
        {
            if(arr[j] > arr[max])
            {
                max = j;
            }
        }
        return max;
    }
    static void swap(int[] arr , int fst , int lst)
    {
        int swap = arr[lst];
        arr[lst] = arr[fst];
        arr[fst] = swap;
    }
}
