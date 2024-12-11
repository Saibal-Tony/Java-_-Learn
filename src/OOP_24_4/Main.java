/*
Private - doesn't give the action / only can be accessed in that class itself
Protected - it can be accessed from anywhere
Public -
*/
package OOP_24_4;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        A obj = new A(25 , "Saibal");

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(obj.getNum());
    }
}
