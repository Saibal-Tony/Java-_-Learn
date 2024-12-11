import java.util.Arrays;

public class Recursion_22_4
{
    public static void main(String[] args)
    {
        // Triangle 1
        triangle_1( 4 , 0);

        // Triangle 2
        triangle_2_1( 1 , 0 , 5);
        triangle_2_2(4 , 0);

        // Bubble Sort
        int[] arr1 = { 4 , 8 , 2 , 10 , 7 , 3 };
        bubbleSort(arr1 , arr1.length - 1 , 0 );
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = { 4 , 9 , 8 , 2 , 10 , 7 , 3 };
        selectionSort(arr2 , arr2.length  , 0 , 0);
        System.out.println(Arrays.toString(arr2));
    }

    // Triangle 1
    static void triangle_1(int r , int c)
    {
        if(r == 0)
        {
            return;
        }
        if(c < r)
        {
            System.out.print("* ");
            triangle_1(r , c + 1);
        }
        else
        {
            System.out.println();
            triangle_1(r - 1 , 0);
        }
    }

    // Triangle 2
    static void triangle_2_1(int r , int c , int n)
    {
        if(c == n)
        {
            return;
        }
        if(r > c)
        {
            System.out.print("* ");
            triangle_2_1(r , c + 1 , n);
        }
        else
        {
            System.out.println();
            triangle_2_1(r + 1 , 0 , n);
        }
    }
    static void triangle_2_2(int r , int c)
    {
        if(r == 0)
        {
            return;
        }
        if(r > c)
        {
            triangle_2_2(r , c + 1);
            System.out.print("* ");
        }
        else
        {
            triangle_2_2( r - 1 , 0 );
            System.out.println();
        }
    }

    // Bubble sort
    static void bubbleSort(int[] arr , int row , int col)
    {
        if(row == 0 )
        {
            return;
        }
        if( row > col )
        {
            if(arr[col] > arr[col + 1])
            {
                int swap = arr[col + 1];
                arr[col + 1] = arr[col];
                arr[col] = swap;
            }
            bubbleSort(arr , row , col + 1);
        }
        else
        {
            bubbleSort(arr, row - 1 , 0);
        }
    }

    // Selection Sort
    static void selectionSort(int[] arr , int r , int c , int max )
    {
        if (r == 0)
        {
            return;
        }
        if(r > c)
        {
            if(arr[c] > arr[max])
            {
                selectionSort(arr, r , c + 1 , c);
            }
            else
            {
                selectionSort(arr , r , c + 1 , max);
            }
        }
        else
        {
            int swap = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = swap;
            selectionSort(arr, r -1 , 0 , 0);
        }


    }
}
