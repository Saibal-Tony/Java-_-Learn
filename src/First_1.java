import java.util.Scanner;

// Everything that starts with OOP_24_2.OOP_24_2.b.a capital is class . like "Main"
// compile the Java file - javac (Main.java)
// to run the file - java Main
// javac -d .. Main.java (outputs the byte file in the previous folder)
// package - It is just OOP_24_2.OOP_24_2.b.a folder , where files inside can access each other
public class First_1 {
    // Public(Access modifier) - these class can be accessed from anywhere (because this is the main code it should be accessible to every class)
    // main is the object of Main class
    // Static - It doesn't create an object of the class
    // Because this is the first code (nothing is running before this)
    // Void(return type) - It decides what to return after the code ends
    // String[] args (command line argument) - collection of strings(what ever is at 0th string)
    // Class - It is OOP_24_2.OOP_24_2.b.a name group of properties and function
    // main - the entry point of the java program
    public static void main(String[] args)
    {
        // Output
        // out - print stream(if null(default) - command line)
        // out = File() - then out will print the file values
        // it takes string and prints it
        // println - Prints new line after this
        // print - prints from the same line
        System.out.println("Hello and welcome!");
        // System.out.println(args[0]);

        // Input
        // System.in (standard output stream) - input from the keyboard
        // new - keyword
        Scanner in = new Scanner(System.in);
        System.out.println(in.nextInt()); // inputs an integer
        System.out.println(in.next()); //inputs the first word
        System.out.println(in.nextLine()); // inputs the entire line

        // Primitives: (The datatypes that cannot bve broken into smaller datatypes)
        // like string can be broken into char.
        // EX - int / char / float / double / boolean
        int roll = 81; //4 bytes
        Integer rno = 65; // Wrapper classes
        // rno.doubleValue() ; we do this to get many methods
        char letter = 's';
        float marks = 8.905f; // 4 bytes
        double largedecimalno = 476476.84784324; // 8 bytes
        long largeinterger = 4442424424L; // 8 bytes
        boolean check = false;

        System.out.print("Enter your roll no. :");
        int roll1 = in.nextInt();
        System.out.println("Your roll no. is :" + roll1);

        int a = 10;
        //literal --> 10 --> syntactical representation of primitive data type
        //identifier --> OOP_24_2.OOP_24_2.b.a/Main --> name of the variable/packages/method/class

        int ab = 234_000_000 ; //( _ --> is replaced by comma )

        //String Input
        String name = in.nextLine();
        System.out.println(name);

        //Float input
        float mark = in.nextFloat();
        System.out.println(mark);
        // floating point error - because it  rounds off the value

        //Type casting
        int num = (int)(81.73f);

        // automatic type promotion
        int x = 257;
        byte y = (byte)(x); // --> 1 (max byte value 256 so it gives 257 % 256 = 1)

        byte m = 20 ;
        byte n = 40 ;
        byte o = 50 ;
        int p = m * n / o ; // because in byte operation it automatically promotes it to int;

        // ASCII
        int number = 'A';
        System.out.println(number); // --> 65 (ASCII value of A letter)

        //Type promotion
        // byte/short/char --> integer
        // if int * float --> float

        // if condition
        int s = 10;
        if(s / 2 == 0)//if true then loop will run & if false it will not
        {
            System.out.println("hello guys");
        }

        // while loop (use when you don't know how many times the loop may run)
        int cnt = 1;
        while(cnt != 5)
        {
            System.out.println(cnt);
            cnt++;
        }

        // for loop (use when you know how many times the loop will run)
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("i = " + i );
        }
    }
}