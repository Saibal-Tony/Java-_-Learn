import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_ArrayList_9
{
    public static void main(String[] args)
    {
        // Array --> group of similar type of datatypes (they are mutable)
        // the memory allocation of array may not be continuous --> due to JVM (and array values ar stored in heap , and heap cannot store in continuous memory)
        int[] roll1 = new int[10]; // Storing capacity is 10
        int[] roll2 = {23, 64, 67, 76, 81, 85, 86};

        int[] ros; // declaration --> compile-time
        ros = new int[10]; // initialisation --> run-time (Dynamic memory allocation -> at run-time memory is allocated)
        // by default empty integer array give output "0".

        String[] arr = new String[20];
        // by default empty string array give output "null".

        Scanner in = new Scanner(System.in);

        //taking the input in OOP_24_2.OOP_24_2.b.a array
        for (int i = 0; i < roll1.length; i++)
        {
            System.out.print("Enter the roll number for " + (i+1) +" : ");
            roll1[i] = in.nextInt();
        }
        //showing output
        for (int i = 0; i < roll1.length; i++)
        {
            System.out.println("Roll number " + (i+1) +" : " +roll1[i]);
        }
        // enhanced for-loop
        for(int num : roll1)
        {
            System.out.print(num + " ");
        }
        //by to.String method
        System.out.println(Arrays.toString(roll1));

        // 2-D Array
        int[][] mat = new int[3][5]; // -> declaring the row no. is important , but not column
        int[][] mat1 = {
                        { 12 , 55 , 82},
                        { 34 , 75 , 93},
                        { 68 , 40 , 29}
                      };

        int[][] mat2 = {
                        {1 , 2 , 3},
                        {4 , 5},
                        {6 , 7 ,8 ,9}
                       };

        // 2-D array input
        for (int i = 0; i < mat.length ; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                mat[i][j] = in.nextInt();
            }
        }

        // 2-D array output
        for (int row = 0; row < mat.length; row++)
        {
            System.out.println(Arrays.toString(mat[row]));
        }
        //enhanced (int[] -> data-type)
        for(int[] a : mat)
        {
            System.out.println(Arrays.toString(a));
        }

        //Array List - An array that is not limited to storage
        ArrayList<Integer> list = new ArrayList<Integer>(10);

        list.add(81);
        list.add(104);
        list.add(85);
        list.add(27);
        list.add(86);
        list.add(100);
        list.add(61);
        list.add(11);
        list.add(23);
        list.add(39);

        list.set(0 , 99); // update values
        list.remove(5); // to remove OOP_24_2.OOP_24_2.b.a value from that index

        System.out.println(list);

        // add values
        for (int i = 0; i < 5; i++)
        {
            list.add(in.nextInt());
        }

        // look at the values
        for (int i = 0; i < 5; i++)
        {
            System.out.println(list.get(i));   // to see particular value
        }

        //2-D Array List
        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        for (int i = 0; i < 3; i++)
        {
            list2.add(new ArrayList<>());
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                list2.get(i).add(in.nextInt());
            }
        }

        System.out.println(list2);

        int[] arr1 = {1 , 3 , 23 , 9 , 18 };
        System.out.print("Before swap: ");
        System.out.println(Arrays.toString(arr1));
        reverse(arr1);
        System.out.print("After swap: ");
        System.out.println(Arrays.toString(arr1));
    }

    // Reverse of an array
    static void reverse(int[] arr)
    {
        int str = 0;
        int end = arr.length - 1;
 
        while(str < end)
        {
            swap(arr , str , end);
            str++;
            end--;
        }
    }
    static void swap(int[] arr ,int str ,int end )
    {
        int swap = arr[str];
        arr[str] = arr[end];
        arr[end] = swap;
    }
}
