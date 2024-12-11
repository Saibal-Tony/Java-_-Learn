import java.util.Scanner;

public class test
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

//        String name = in.nextLine();
//        System.out.println(name);
//        System.out.print("Enter the Word : ");
//        char ch = in.next().trim().charAt(0);
//        // trim() - erases all the spaces / empty spaces
//        // charAt() - take the character form that particular location
//        if (ch >= 'A' && ch <='Z')
//        {
//            System.out.println("Uppercase");
//        }
//        if(ch >= 'OOP_24_2.OOP_24_2.b.a' && ch <= 'z')
//        {
//            System.out.println("Lowercase");
//        }

        // Question 1
//        int r = 7;
//        int unit = 2;
//        int n = 8;
//        int[] arr = {2,8,3,5,7,4,1,2};
//
//        int ans = rathouse(r ,unit , arr , n);
//        System.out.println(ans);

        //Question 2
        String str = "1C0C1C1A0B1";
        int ans = bianary(str);
        System.out.println(ans);
    }

    // Question 1
    static int rathouse(int r , int unit , int[] arr, int n)
    {
        Scanner in = new Scanner(System.in);
        int mul = r * unit;
        int sum = 0;
        int cnt = 0;
        if(arr.length == 0)
        {
            return -1;
        }
        for (int i : arr) {
            sum = sum + i;
            cnt++;
            if (mul <= sum)
            {
                return cnt;
            }
        }
        return cnt;
    }

    // Question 2
    static int bianary(String str)
    {
        int a = Character.getNumericValue(str.charAt(0));
        int res = 0;
        for (int i = 0; i < str.length()-2 ; i+=2)
        {
            res = a;
            char ch = str.trim().charAt(i+1);
            int lst = Character.getNumericValue(str.charAt(i+2));

            if(ch == 'A')
            {
                res = AND(res,lst);
            }
            else if (ch =='B')
            {
                res = OR(res , lst);
            }
            else if (ch == 'C')
            {
                res = XOR(res,lst);
            }
            else
            {
                System.out.println("Error character");
            }
            a =res;
        }
        return res;
    }
    static int AND(int val1 , int val2)
    {
        return val1 & val2;
    }
    static int OR(int val1 , int val2)
    {
        return val1 | val2;
    }
    static int XOR(int val1 , int  val2)
    {
        return val1 ^ val2;
    }
}
