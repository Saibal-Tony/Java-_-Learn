package OOP_24_5.Interface;

public class NiceCar
{
    private Engine engine;
    private Media media = new CDplayer();

    NiceCar()
    {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine)
    {
        this.engine = engine;
    }

    public void stop()
    {
        engine.stop();
    }
    public void start()
    {
        engine.start();
    }

    public void startMusic()
    {
        media.start();
    }
    public void stopMedia()
    {
        media.stop();
    }
}
