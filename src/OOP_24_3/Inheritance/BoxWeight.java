package OOP_24_3.Inheritance;

public class BoxWeight extends Box
{
    double weight;

    BoxWeight()
    {
        this.weight = -1;
    }
    BoxWeight(double l , double b , double h , double weight)
    {
        super(l , b , h); // it's just calling the parent class constructor to import these values from the parent class
        // but can't access the private parts
        // every class has object as  superclass
        System.out.println(super.weight); //use this super to access the variable from the class above , if there are two same variable names then
        // we use this.weight to access this class variable , and super for accessing the variable from parent class
        this.weight = weight;
    }
}
