public class Pattern_21
{
    public static void main(String[] args)
    {
        int a = 4;
        pattern2(a);
        pattern3(a);
        pattern4(a);
        pattern5_1(a);
        pattern5_2(a);
        pattern6(a);
        pattern17(a);
        pattern28(a);
        pattern30(a);
        pattern31(a);
    }


    // Pattern 2
    /*
    *
    * *
    * * *
    * * * *
    */
    static void pattern2(int a)
    {
        System.out.println("Pattern 2");
        for (int i = 1; i <= a; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 3
    /*
     * * * *
     * * *
     * *
     *
     */
    static void pattern3(int a)
    {
        System.out.println("Pattern 3");
        for (int i = 1; i <= a; i++)
        {
            for (int j = 1; j <= a - i + 1 ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 4
    /*
    1
    1 2
    1 2 3
    1 2 3 4
    */
    static void pattern4(int a)
    {
        System.out.println("Pattern 4");
        for (int i = 1; i <= a; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 5
    /*
     *
     * *
     * * *
     * * * *
     * * *
     * *
     *
     */
    static void pattern5_1(int a)
    {
        System.out.println("Pattern 5_1");
        for (int i = 1; i <= a; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= a - 1 ; i++)
        {
            for (int j = 1; j <= a - i  ; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern5_2(int a)
    {
        System.out.println("Pattern 5_2");
        for (int i = 0; i < 2 * a; i++)
        {
            int totrow = i > a ? 2 * a - i : i;
            for (int j = 0 ; j < totrow; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 6
    /*
           *
         * *
       * * *
     * * * *
     */
    static void pattern6(int a)
    {
        System.out.println("Pattern 6");
        for (int i = 1; i <= a; i++)
        {
            for (int j = 1; j <= a - i; j++)
            {
                System.out.print("  ");
            }
            for (int k = 1; k <= i ; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 17
    /*
       1
      212
     32123
    4321234
     32123
      212
       1
    */
    static void pattern17(int a)
    {
        System.out.println("Pattern 17");
        for (int i = 1 ; i <= a * 2 ; i++)
        {
            int c = i > a ? 2 * a - i : i;

            for (int space = 0; space < a - c; space++)
            {
                System.out.print("  ");
            }
            for (int col = c; col >= 1 ; col--)
            {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c ; col++)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
    // Pattern 28
    /*
         *
        * *
       * * *
      * * * *
       * * *
        * *
         *
     */
    static void pattern28(int a)
    {
        System.out.print("Pattern 28");
        for (int i = 0; i < a * 2; i++)
        {
            int noCol = i > a ? 2 * a - i : i;
            int space =  a - noCol;
            for (int j = 0; j < space; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k < noCol ; k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 30
    /*
          1
        2 1 2
      3 2 1 2 3
    4 3 2 1 2 3 4
    */
    static void pattern30(int a)
    {
        System.out.println("Pattern 30");
        for (int i = 1; i <= a; i++)
        {
            for (int space = 0; space < a - i ; space++)
            {
                System.out.print("  ");
            }
            for (int col = i; col >= 1 ; col--)
            {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= i ; col++)
            {
                System.out.print( col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Pattern 31
    /*
    4 4 4 4 4 4 4
    4 3 3 3 3 3 4
    4 3 2 2 2 3 4
    4 3 2 1 2 3 4
    4 3 2 2 2 3 4
    4 3 3 3 3 3 4
    4 4 4 4 4 4 4
    */
    static void pattern31(int a)
    {
        System.out.println("Pattern 31");
        int ori = a ;
        a = a * 2 - 1;
        for (int row = 0; row < a ; row++)
        {
            for (int col = 0; col < a  ; col++)
            {
                int indexFind = ori - Math.min(Math.min(row , col) , Math.min(a - row - 1  , a - col - 1));
                System.out.print(indexFind + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

}
