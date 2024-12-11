// If any of the methods are abstract then the class should also be abstract class
package OOP_24_5.Abstract;

public class Main
{
    public static void main(String[] args)
    {
        Son son  = new Son(23);
        son.career();
        System.out.println(son.age);

        Daughter daughter = new Daughter(13);
        daughter.career();
        System.out.println(daughter.age);

        Parent.hello();

//        Parent mom = new Parent(); --> cannot be used because abstract doesn't create objects;
    }
}
