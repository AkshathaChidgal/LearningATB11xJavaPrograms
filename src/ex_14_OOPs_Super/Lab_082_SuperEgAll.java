package ex_14_OOPs_Super;
//simple Java program using super to demonstrate all three uses: variable, method, and constructor.
public class Lab_082_SuperEgAll {
    public static void main(String[] args) {
        Rabbit r= new Rabbit();
        r.display();

    }
}

class Animal2
{
    String colour="white";

    Animal2()
    {
        System.out.println("Animal Constructor");
    }
    void display()
    {
        System.out.println("Animal display");
    }
}
class Rabbit extends Animal2
{
    String colour="black";

    Rabbit()
    {
        super();// Calling parent constructor
        System.out.println("Rabbit constructor");
    }


    void display()
        {
            super.display(); // Calling parent method
            System.out.println("Rabbit display");
            System.out.println(super.colour);// Accessing parent variable
            System.out.println(colour);
        }

}