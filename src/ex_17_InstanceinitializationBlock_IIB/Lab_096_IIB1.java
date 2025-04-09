package ex_17_InstanceinitializationBlock_IIB;

public class Lab_096_IIB1 {
    public static void main(String[] args) {
        new Aaa(); // calls the IIB once
        Aaa a=new Aaa(); // calls the IIB again
    }
}
class Aaa
{
    Aaa()
    {
        System.out.println("Default constructor");
    }
    {
        System.out.println("Hi, I'm instance initialization block");
        System.out.println("If you want to execute or call something when object is created");
        // mysql connection
        // read a csv, xlsx file
        // read json, xml.
        // read a text file or env file
    }
    {
        System.out.println("I'm IIB2");
    }
    {
        System.out.println("I'm IIB3");
    }
}

//Execution Order: During object creation, the sequence is as follows:
//The constructor of the superclass is called.
//The instance initialization blocks are executed in the order they appear in the class.
//The constructor of the current class is executed.

//Instance Initialization Block (IIB) executes when an object is created

//Execution Frequency: An IIB runs each time an instance of the class is instantiated. This means if you create multiple objects of the class, the IIB will execute once for each object creation.