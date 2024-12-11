import java.util.ArrayList;
import java.util.Arrays;

public class String_StringBuilder_19
{
    public static void main(String[] args)
    {
        String name1 = "Saibal";
        System.out.println(name1);
        String name2 = "Saibal"; // this name1 & name2 is pointing to the same name e.i. Saibal
        System.out.println(name2);
        System.out.println(name1 == name2); // True ; checking the same reference value

        // You can make separate reference in heap by "new" keyword
        String name3 = new String("Saibal");
        String name4 = new String("Saibal"); // these two variable ar pointing to different values in the heap
        System.out.println(name3.equals(name4)); // True ; because the values are same

        // println --> call the value of string using toString() method
        //         --> This only prints the String Type

        // Pretty Printing
        float a = 31313.4351f;
        System.out.printf("Formated number is %.2f" , a); // .2 prints the value till two decimal places
        // %s - String
        // %c - Character
        // %d - Decimal number (base IO)
        // %e - Exponential floating-point number
        // %f - Floating-point number
        // %i - Integer (base 10)
        // %o - Octal number (base 8)
        // %u - Unsigned decimal (integer) number
        // %x - Hexadecimal number (base 16)
        // %t - Date/time
        // %n - Newline

        System.out.printf("My name is %s and I live in %s" , "Saibal" , "Kolkata");

        System.out.println("a" + "b"); // 195
        System.out.println("a" + "b"); // ab
        System.out.println("a" + 3); // d
        System.out.println("tony" + new ArrayList<>()); // tony[]
      //System.out.println(new Integer(55) + new ArrayList<>()); --> Error ; because to give output any one of them must be string
        System.out.println(new Integer(55) + "" + new ArrayList<>());

        String series = "";
        for (int i = 0; i < 26; i++)
        {
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);

        // String Builder --> mutable ; it doesn't create new object everytime it changes in the original object itself
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++)
        {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
      // builder.reverse(); --> to reverse it
        System.out.println(builder);

        String name = "Saibal Bera";
        System.out.println(Arrays.toString(name.toCharArray())); // print the characters in array format
        System.out.println(name.toLowerCase()); // convert into lower-case
        System.out.println(name.indexOf('a')); // gives the location of the character
        System.out.println("    Tony        ".strip()); // removes the background spaces
        System.out.println(Arrays.toString(name.split(" "))); // depending on the regex the words are split
    }
}
