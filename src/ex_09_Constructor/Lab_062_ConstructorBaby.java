package ex_09_Constructor;

public class Lab_062_ConstructorBaby {
    public static void main(String[] args) {

        Baby b1=new Baby();
        new Baby(); //calling second time
        Baby b2 =new Baby(); // calling 3rd time


    }
}

class Baby
{
    /*instance variables, data variable,member variable,properties,atrributes*/
    String name;

    void cry()
    {
        System.out.println("Crying!!!");
    }
    void sleep()
    {
        System.out.println("Sleep!");
    }
    void eat()
    {
        System.out.println("Eating!");
    }

    Baby()//default constructor
    {
        System.out.println("I'm called, Default Constructor!!!");
    }

}

