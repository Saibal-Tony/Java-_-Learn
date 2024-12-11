import java.util.Arrays;

public class BinarySearch2D_14
{
    public static void main(String[] args)
    {
        int[][] arr = {
                        { 10 , 20 , 30 , 40 },
                        { 15 , 25 , 35 , 45 },
                        { 28 , 29 , 37 , 49 },
                        { 33 , 34 , 38 , 50 }
                      };
        int tar = 34;
        int[] ans = search(arr,tar);
        System.out.println(Arrays.toString(ans));

        int[][] mat = {
                        { 1 , 2 , 3 },
                        { 4 , 5 , 6 },
                        { 7 , 8 , 9 }
                      };
        int target = 7;
        int[] res = sortSearch(mat , target);
        System.out.println(Arrays.toString(res));
    }

    static int[] search(int[][] arr , int tar)
    {
        int r = 0;
        int c = arr.length - 1;
        while( r < arr.length && c >= 0)
        {
            if(tar == arr[r][c])
            {
                return new int[]{r , c};
            }
            else if( tar < arr[r][c])
            {
                c--;
            }
            else
            {
                r++;
            }
        }
        return new int[]{-1 , -1};
    }

    // Sorted 2D array search
    static int[] sortSearch(int[][] arr ,int target)
    {
        int r = arr.length;
        int c = arr[0].length;

        if( c == 0)
        {
            return new int[]{ -1 , -1 };
        }

        if(r == 1)
        {
            return binarySearch(arr , 0 , 0 , c-1 , target);
        }

        int rStart = 0;
        int rEnd = r - 1;
        int cMid = c / 2;

        while(rStart < (rEnd - 1))
        {
            int mid = rStart + ( rEnd - rStart ) / 2;
            if(arr[mid][cMid] == target)
            {
                return new int[]{ mid , cMid };
            }
            if (arr[mid][cMid] > target)
            {
                rEnd = mid;
            }
            else
            {
                rStart = mid;
            }
        }

        // Equal to center
        if(arr[rStart][cMid] == target)
        {
            return new int[]{ rStart , cMid };
        }
        // Equal to lower center
        if(arr[rStart + 1][cMid] == target)
        {
            return new int[]{ (rStart + 1) , cMid };
        }
        // 1st half
        if(arr[rStart][cMid - 1] >= target)
        {
            return binarySearch(arr , rStart , 0 , cMid - 1 , target );
        }
        // 2nd half
        if(arr[rStart][cMid + 1] <= target && target <= arr[rStart][c - 1])
        {
            return binarySearch(arr , rStart , cMid + 1 , c - 1 , target );
        }
        // 3rd half
        if(arr[rStart + 1][cMid - 1] >= target)
        {
            return binarySearch(arr , rStart + 1 , 0 , cMid - 1 , target );
        }
        // 4th half
        if(arr[rStart + 1][cMid + 1] < target && target <= arr[rStart + 1][c - 1])
        {
            return binarySearch(arr , rStart + 1 ,cMid + 1 , c - 1 , target );
        }
        else
        {
            return new int[]{ -1 , -1 };
        }
    }
    static int[] binarySearch(int[][] arr , int row , int cStart , int cEnd , int tar)
    {
        while(cStart <= cEnd)
        {
            int mid = cStart + ( cEnd - cStart ) / 2;
            if (arr[row][mid] == tar)
            {
                return new int[]{ row , mid };
            }
            else if (arr[row][mid] < tar)
            {
                cStart = mid + 1;
            }
            else
            {
                cEnd = mid - 1;
            }
        }
        return new int[]{ -1 , -1 };
    }
}
