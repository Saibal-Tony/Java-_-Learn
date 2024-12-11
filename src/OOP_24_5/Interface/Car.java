package OOP_24_5.Interface;
// interface --> class -- implements
// interface --> interface -- extends
public class Car implements Engine , Brake , Media
{
    // override method must be same or better than the parent class(protected -> protected/public , cannot be private which is more restrictive)
    @Override
    public void brake()
    {
        System.out.println("I brake like a normal car");
    }

    @Override
    public void start()
    {
        System.out.println("I start engine like a normal car");
    }

    @Override
    public void stop()
    {
        System.out.println("I stop like a normal car");
    }

    @Override
    public void acc()
    {
        System.out.println("I accelerate like a normal car");
    }
}
