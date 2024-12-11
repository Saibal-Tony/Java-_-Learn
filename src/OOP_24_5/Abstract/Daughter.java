package OOP_24_5.Abstract;

public class Daughter extends Parent
{
    public Daughter(int age)
    {
        super(age);
    }
    @Override
    void career()
    {
        System.out.println("I am going to be Teacher");
    }

    @Override
    void partner()
    {
        System.out.println("I love Naruto");
    }
}
