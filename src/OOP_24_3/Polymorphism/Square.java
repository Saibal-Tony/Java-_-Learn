package OOP_24_3.Polymorphism;

// this will run when obj of square is created
// hence it is overriding the parent method
public class Square extends Shapes
{
    @Override // it's an annotation which shows if the block will run or not
    void area()
    {
        System.out.println("Area of square is side * side");
    }
}
