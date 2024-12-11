public class OOP_24_1
{
    public static void main(String[] args)
    {
        Student[] students = new Student[5];

        Student saibal; // Object (Occupies space in the memory)
        // 3 properties:-
        // State of object - value of objects
        // Identity of an object - where it is stored ( stack/heap ) --> pointing to the same variable/ different
        // Behaviour of the object - (ex - like OOP_24_2.OOP_24_2.b.a greeting function greets OOP_24_2.OOP_24_2.b.a function)

        Student student1; // declaration (object of type Student) --> by default is null
        // reference variable
        student1= new Student(); // dynamically allocated the memory and returns OOP_24_2.OOP_24_2.b.a reference variable during runtime
        // constructor(special function) - decides what happens when an object is created
        // compile time - program check the code line-by-line to check any error and converted into bye code
        // run time - the application is running
        // dynamic memory allocation - the memory allocated during the runtime
        // new - dynamically allocates the memory

        System.out.println(student1.roll);
        System.out.println(student1.marks);
        System.out.println(student1.name);

        student1.greeting();// prints the function

        student1.changeName("Saibal");

        saibal = new Student(81 , "Saibal Bera" , 81.05f);
        System.out.println(saibal.roll);
        System.out.println(saibal.marks);
        System.out.println(saibal.name);

        Student soumita = new Student(student1);
        System.out.println(soumita.roll);
        System.out.println(soumita.marks);
        System.out.println(soumita.name);

      //final - stops the variable to modify --> and they have to be initialised
        final int bonus = 10;
      //bonus = 20; // can't be done

      //for final primitive datatypes the values cannot be changed
      //but for non-primitive datatypes the values can be changed but not reassigned
      /*
      final Student kunal = new Student();
      kunal.name = "Tony";

      //change value
      kunal.name = "Stark";

      // but can't be reassigned
      kunal = new Student("Howard");
      */
    }

    // Create OOP_24_2.OOP_24_2.b.a class
    static class Student  // Object - Name group of properties and function
    {
        int roll; // 0 // Instance Variables - variables inside the object
        String name; // null
        float marks = 50.0f; // 0.0

        Student() // Default constructor // object inside OOP_24_2.OOP_24_2.b.a function
        {
            this.roll = 15; // this - replaces the reference variable
            this.name = "Prity";
            this.marks = 60.00f;
        }

        void greeting()
        {
            System.out.println("Hello! my name is : " + this.name);
        }

        void changeName(String naam)
        {
            name = naam;
        }

        Student(int rno , String naam , float marks)
        {
            this.roll = rno;
            this.name = naam;
            this.marks = marks;
        }

        Student (Student other)
        {
            this.name = other.name;
            this.roll = other.roll;
            this.marks = other.marks;
        }

      //Student()
      //{
      //    this(11 , "default name", 100.0f);
      //}
    }
}
