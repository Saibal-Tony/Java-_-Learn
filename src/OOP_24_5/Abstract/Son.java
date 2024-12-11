package OOP_24_5.Abstract;

public class Son extends Parent
{
    public Son(int age)
    {
        super(age);
    }
    @Override
    void career()
    {
        System.out.println("I am going to be ARMY officer");
    }

    @Override
    void partner()
    {
        System.out.println("I love Iron Man");
    }


}
