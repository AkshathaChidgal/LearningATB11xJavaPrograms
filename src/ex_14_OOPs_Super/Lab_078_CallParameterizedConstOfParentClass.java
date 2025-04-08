package ex_14_OOPs_Super;

public class Lab_078_CallParameterizedConstOfParentClass {
    public static void main(String[] args) {
        Parrot p= new Parrot();

    }
}

class Birds
{ //creating parameterized constroctor
    Birds(String birdtype)
    {
        System.out.println("Parameterized constructor of bird class, Bird type is "+birdtype);
    }
}
class Parrot extends Birds
{
    Parrot()
    {
        super("Pegion");// Calls Bird(String birdtype)
        System.out.println("child class constructor");
    }
}

