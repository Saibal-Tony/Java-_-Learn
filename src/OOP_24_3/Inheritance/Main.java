/* Inheritance -
1. Single inheritance - one class extends another class
2. Multilevel Inheritance - one class extends another class and that extended class can extend to another class
3. Hybrid Inheritance - It is a mixture of multiple and single inheritance. (not possible)
4. Multiple Inheritance - One class extends more than one class (not possible)
4. Hierarchical Inheritance - One class is being inherited by more than one class
*/

// Late binding - dynamic method resolution happens after the compilation and byte coding , when the program is running , then overloading determines which one to run , so late binding
// but since final class cannot be overridden , this can be resolved during compile time only , this is called early binding
package OOP_24_3.Inheritance;

public class Main
{
    public static void main(String[] args)
    {
        Box box1 = new Box();
        System.out.println(box1.l + " , " + box1.b + " , " + box1.h);
        Box box2 = new Box(box1);
        System.out.println(box2.l + " , " + box2.b + " , " + box2.h);

        BoxWeight boxWeight1 = new BoxWeight();
        System.out.println(boxWeight1.l + " , " + boxWeight1.weight);

      //Reference variable(Box)     // Object(BoxWeight)
        Box box3 = new BoxWeight(10 , 4 , 5 , 1.5);
        // System.out.println(box3.weight); --> can't be accessed because reference variable(Box)(parent) doesn't have the weight member
        //                                  --> the object class doesn't determine which members can be accessed
        //                                  --> you can access to variables that are available in the reference variable
    }
}
