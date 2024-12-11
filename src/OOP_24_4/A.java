package OOP_24_4;

public class A
{
    private int num;
    String name;
    int[] arr;

    public A(int num , String name)
    {
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }

    public int getNum() // getter gets the value
    {
        return num;
    }
    public void setNUm(int num) // setters sets the value
    {
        this.num = num;
    }

}
