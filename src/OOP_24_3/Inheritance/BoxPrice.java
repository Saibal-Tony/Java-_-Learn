package OOP_24_3.Inheritance;

public class BoxPrice extends BoxWeight
{
    double cost;

    BoxPrice()
    {
        super();
        this.cost = 0;
    }

    BoxPrice(double l, double h, double w, double weight, double cost)
    {
        super(l , h , w , weight);
        this.cost = cost;
    }
}
