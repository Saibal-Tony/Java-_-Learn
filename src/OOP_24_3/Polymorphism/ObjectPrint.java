package OOP_24_3.Polymorphism;

public class ObjectPrint
{
    int num;

    ObjectPrint(int num)
    {
        this.num = num;
    }


    @Override
    public String toString()
    {
        return "ObjectPrint{" + " num = " + num + " }";
    }

}
