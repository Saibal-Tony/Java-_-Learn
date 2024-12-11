// Polymorphism - Poly -> many
//              - morphism -> ways to represent
/*
types:-
1. Compile-time/static polymorphism - achieved by method overloading(same method name but different parameters)
2. Run-time/dynamic polymorphism - achieved by method overriding(same method name as parents class but different body)
*/

// Early binding - happens during the compilation
// Late binding - happens during the runtime
package OOP_24_3.Polymorphism;

public class Main
{
    public static void main(String[] args)
    {
        Shapes shapes = new Shapes();

        Triangle triangle = new Triangle();
        Square square = new Square();
        Shapes circle = new Circle();
        // The method to be called depends on the child class/type of object (Upcasting) --> this is how overriding works
        // --> this is determined by Dynamic method dispatch

        shapes.area();

        circle.area(); // overriding the parent class
        // what it is able to access if defined by the reference & which one to access is defined by the type of object
        // The parents class need to have this same method because while in compile time to ignore the error if by chance the child class doesn't have the method to run the parents class will run that method.

        // static method doesn't follow the rule it prints the parent function

        ObjectPrint obj = new ObjectPrint(25);
        System.out.println(obj); // runs the toString method which is overridden in the class block in runtime

    }

    // overriding depends on object , but static is not dependent on objects so static methods cannot be overridden

    // Method overriding  - while static method
//    public static class superclass
//    {
//        static void print()
//        {
//            System.out.println("print in superclass.");
//        }
//    }
//    public static class subclass extends superclass {
//        static void print() {
//            System.out.println("print in subclass.");
//        }
//    }
//
//    public static void main(String[] args) {
//        superclass A = new superclass();
//        superclass B = new subclass();
//        A.print(); // Outputs: "print in superclass."
//        B.print(); // Outputs: "print in superclass."
//    }
//    ----> because the static methods runs during compile time, so it prints  "print in superclass."

    // Method overriding  - while instance method
//    public static class superclass
//    {
//        void print()
//        {
//            System.out.println("print in superclass.");
//        }
//    }
//    public static class subclass extends superclass
//    {
//        @override
//        void print()
//        {
//            System.out.println("print in subclass.");
//        }
//    }
//
//    public static void main(String[] args) {
//        superclass A = new superclass();
//        superclass B = new subclass();
//        A.print(); // Outputs: "print in superclass."
//        B.print(); // Outputs: "print in subclass."
//    }
//    ----> because the instance methods runs during runtime time,so the overriding happens, so it prints  "print in superclass."

}
