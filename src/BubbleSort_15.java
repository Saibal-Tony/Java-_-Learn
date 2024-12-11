import java.util.Arrays;

public class BubbleSort_15
{
    // Bubble Sort (sinking sort / exchange sort) - comparing the next element for bigger no. , if yes swap .
    public static void main(String[] args)
    {
        int[] arr1 = { 81 , 4 , 30 , 7 , 10 , 1 , 11 , 44 };
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    static void bubbleSort(int[] arr)
    {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++)
        {
            swapped = false;
            for (int j = 1; j < arr.length - i ; j++)
            {
                if(arr[j] < arr[j-1])
                {
                    int swap = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = swap;
                    swapped = true;
                }
            }
            if(!swapped) // !false = true
            {
                break;
            }
        }
    }


}
