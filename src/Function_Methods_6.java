import java.util.Arrays;
import java.util.Scanner;

//In java there is pass by value.
public class Function_Methods_6
{
    static int A = 81; // Shadowing
    public static void main(String[] args)
    {
        // A function that is inside OOP_24_2.OOP_24_2.b.a class is class OOP_24_2.OOP_24_2.b.a method
        sum1();

        int ans2 = sum2();

        int ans3 = sum3(20 ,30);

        String name = greeting("Saibal Bera");
        System.out.println(name);

        //Pass-by-reference
        int[] arr = {1 , 33, 81 , 64 , 27};
        change(arr);
        System.out.println(Arrays.toString(arr));

        // Scoping
        int x = 10;
        int y = 20;
        {
            x = 11; // you can't declare the variable again
            int z = 30;
        }
        //System.out.println(z); --> cannot be printed , because OOP_24_2.OOP_24_2.b.a value initialised in OOP_24_2.OOP_24_2.b.a block remains in OOP_24_2.OOP_24_2.b.a block

        // Overlapping scope (lower level scoping will override higher level scoping)
        System.out.println(A); // 81
        int A = 64;
        System.out.println(A); // 64

        // Variable Arguments
        varArgs( 2 , 3 , 4 , 5 , 6 , 7 , 8);

        // Multiple Variable arguments
        MultvarArgs( 81 ,64 , "Saibal" , "Bera" , "Tony");

        // Function overloading --> same function name , but different function parameter
        fun(20);
        fun("Stark");
    }

    static void sum1()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter no. 2: ");
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println(sum);
    }
    static int sum2()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter no. 2: ");
        int num2 = in.nextInt();

        return num1 + num2;
    }

    static int sum3(int a , int b)
    {
        return a+b;
    }

    static String greeting(String name)
    {
        return "Hi there" + name;
     }
    // Primitive --> pass-by-value (so change doesn't occur to the original)
    // Non-Primitive --> pass-by-value-by-reference (so change occurs to the original)

    static void change(int[] nums)
    {
        nums[0] = 99;
    }

    // Scoping
    //Function scope --> variables that can be only accessed inside OOP_24_2.OOP_24_2.b.a function

    // Variable Arguments
    static void varArgs(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }

    static void MultvarArgs(int a ,int b , String ...naam)
    {
        System.out.println( a + " " + b + " " + Arrays.toString(naam));
    }

    //function overloading
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(String naam)
    {
        System.out.println(naam);
    }
}
