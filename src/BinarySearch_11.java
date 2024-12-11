public class BinarySearch_11
{
    // Binary Searching - checks from the center of the array  , if the no. is bigger then goes right , if not then left of the array
    // log N
    // for sorted array we use Binary search
    public static void main(String[] args)
    {
        int[] arr1 = { 2 , 4 , 6 , 9 , 11 , 12 , 14 , 20 , 36 , 48};
        int tar1 = 40;
        int ans = Binarysearch(arr1, tar1);
        System.out.println(ans);
    }
     static int Binarysearch(int[] arr , int tar)
     {
         int s = 0;
         int e = arr.length - 1;

         while(s <= e)
         {
             int m = s + (e - s) / 2; // for larger number
             //int m = (e + s)/2;
             // because the sum of int may cause to exceed the limit
             if(arr[m] > tar )
             {
                 e = m - 1;
             }
             else if(arr[m] < tar)
             {
                 s = m + 1;
             }
             else if (arr[m] == tar)
             {
                 return m;
             }
             else
             {
                 return -1;
             }
         }
         return -1;
     }
}
