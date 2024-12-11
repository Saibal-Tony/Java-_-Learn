package OOP_24_5.Interface;

public class Main
{
    public static void main(String[] args)
    {
        Car car = new Car();

        car.acc();
        car.brake();
        car.start();

        Media mediaCar = new Car();

        mediaCar.start(); // will print engine start , so it's wrong

        NiceCar car_nice = new NiceCar();
        car_nice.start();
        car_nice.startMusic();
    }
}
