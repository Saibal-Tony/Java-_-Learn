import java.util.Arrays;

public class InsertionSort_17
{
    // Insertion Sort - sorting in parts , first two elements then the remaining
    public static void main(String[] args)
    {
        int[] arr = { 81 , 4 , 30 , 7 , 10 , 1 , 11 , 44 };
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr)
    {
        for (int i = 0; i < arr.length - 2; i++)
        {
            for (int j = i + 1; j > 0 ; j--)
            {
                if ( arr[j - 1] > arr[j] )
                {
                    swap(arr, j , j-1);
                }
                else
                {
                    break;
                }
            }
        }
    }
    static void swap(int[] arr , int str , int end )
    {
        int swap = arr[end];
        arr[end] = arr[str];
        arr[str] = swap;
    }


}
