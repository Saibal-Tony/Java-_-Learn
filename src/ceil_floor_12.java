public class ceil_floor_12
{
    public static void main(String[] args)
    {
        int[] arr = { 2 , 3 , 5 , 9 , 14 , 16 , 18};
        int tar = 17;
        int res1 = ceil(arr , tar);
        System.out.println(res1);

        int res2 = floor(arr , tar);
        System.out.println(res2);
    }

    // Ceil of an array
    static int ceil(int[] arr , int tar)
    {
        int s = 0;
        int e = arr.length - 1;
        int m = 0;

        while(s <= e)
        {
            m = s + ( e - s ) / 2;
            if (arr[m] == tar)
            {
                return tar;
            }
            else if(arr[m] > tar)
            {
                e = m - 1;
            }
            else if(arr[m] < tar)
            {
                s = m + 1;
            }
        }
        return arr[s];
    }

    // Floor of an array
    static int floor(int[] arr , int tar)
    {
        int s = 0;
        int e = arr.length - 1;
        int m = 0;

        while(s <= e)
        {
            m = s + ( e - s ) / 2;
            if (arr[m] == tar)
            {
                return tar;
            }
            else if(arr[m] > tar)
            {
                e = m - 1;
            }
            else if(arr[m] < tar)
            {
                s = m + 1;
            }
        }
        return arr[e];
    }
}
