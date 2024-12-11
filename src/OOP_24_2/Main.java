package OOP_24_2;// the . binds the instance variables &  instance methods with the reference variable
import static OOP_24_2.b.Message.message; //the code is imported from different package

// packages - containers for classes
public class Main // outside classes must not be static because it itself is not dependent on other class
{
    static int ant = 10;

    // static block will only run once, when the first obj is created i.e. when the class is loaded for the first time
    public static void main(String[] args) {
        A tony = new A();
        message();

        Human saibal = new Human(23, "Saibal Bera", 15000, false);
        Human soumita = new Human(13, "Soumita Bera", 0, false);

        System.out.println(Human.population);
        System.out.println(Human.population);

        Main fun = new Main();
        // because main class doesn't need to create an object to run , so non-static functions needs to create its own object.
        fun.greetings();

        System.out.println(ant);

        System.out.println(tony); // returns the name --> because of the override

        // Singleton Class
        Singleton obj1 = Singleton.getInstance(); // only one object will be created
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
    }

    static class A {
        String name;

        A() {
            name = "TONY";
        }

        A(String naam) {
            this.name = naam;
        }

        // Override method
        @Override
        public String toString()
        {
            return name;
        }
    }

    static class Human {
        int age;
        String name;
        int salary;
        boolean married;
        static long population; // because this factor doesn't depend on the human class

        public Human(int age, String name, int salary, boolean married) {
            this.age = age;
            this.name = name;
            this.salary = salary;
            this.married = married;
            Human.population += 1; // because its static we declare it by class name
        }
    }

    // this is not dependent on objects
    static void fun() {
        //greetings(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instances

        Main obj = new Main();
        obj.greetings(); // now valid because an object is created
    }

    // this is dependent on objects
    void greetings() {
        System.out.println("Hello!");
    }

    // Singleton class - lets the user create the object once
    private static class Singleton
    {
        private Singleton()
        {

        }
        private static Singleton instance;

        public static Singleton getInstance()
        {
            if(instance == null)
            {
                instance = new Singleton();
            }
            return instance;
        }
    }


}

