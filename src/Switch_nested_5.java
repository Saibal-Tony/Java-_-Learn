import java.util.Scanner;

public class Switch_nested_5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        if (fruit.equals("Mango"))// = = --> compares the value as well as reference , but .equals() --> just compares the value
//        {
//            System.out.println("King of fruits");
//        }

        // Switch statement
        System.out.print("Enter fruit name: ");
        String fruits = in.next();
        switch(fruits)
        {
            case "Mango":
                System.out.println("King of fruits");
                break;// break - to terminate the sequence
            case "Apple":
                System.out.println("A red fruit");
                break;
            case "Grapes":
                System.out.println("A small green fruit");
            default:
                System.out.println("Enter OOP_24_2.OOP_24_2.b.a valid name");
        }

        switch(fruit)
        {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A red fruit");
            case "Grapes" -> System.out.println("A small green fruit");
            default -> System.out.println("Enter OOP_24_2.OOP_24_2.b.a valid name");
        }

        System.out.println("Enter the no. of the day: ");
        int day = in.nextInt();
        switch (day)
        {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out. println("Tuesday");
            case 3 -> System.out.println ("Wednesday") ;
            case 4 -> System.out.println ("Thursday") ;
            case 5 -> System.out.println("Friday");
            case 6 -> System.out. println("Saturday") ;
            case 7 -> System.out. println("Sunday") ;
            default -> System.out.println("Wrong day");
        }

        switch(day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
                break;
        }

        //Nested Switch
        int empID = in.nextInt();
        String department = in. next();

        switch(empID)
        {
            case 1:
                System.out.println("Saibal Bera");
                break;
            case 2:
                System.out.println("Soumita Bera");
                break;
            case 3:
                switch (department)
                {
                    case "CSE":
                        System.out.println("CSE");
                    case "IT":
                        System.out.println("IT");
                    case "ECE":
                        System.out.println("ECE");
                    default:
                        System.out.println("No department !");
                }
                break;
            default:
                System.out.println("Wrong employee ID.");
        }
    }
}
