package OOP_24_5.Interface;

public class CDplayer implements Media
{

    @Override
    public void start()
    {
        System.out.println("Music Start");
    }

    @Override
    public void stop()
    {
        System.out.println("Music Stop");
    }
}
