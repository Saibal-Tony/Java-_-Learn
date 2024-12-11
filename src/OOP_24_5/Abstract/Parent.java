package OOP_24_5.Abstract;

public abstract class Parent
{
    int age;

    Parent(int age) // you can't create an object of an abstract class --> so no abstract constructor
    // -> because if we call the object it will throw error because there is nothing in the body
    {
        this.age = age;
    }
    // abstract method needs to be overridden, but we can't override a static method
    abstract void career();
    abstract void partner();

    static void hello()
    {
        System.out.println("Hi there ! static method here");
    }

    void normal()
    {
        System.out.println("I am a normal method ");
    }
}
