package ex_16_OOPs_Interface;
//✅ Exercise 6: Default and Static Methods
//Task:
//Create an interface Greeting with:
//a method sayHello() (abstract)
//a default method sayHi() that prints "Hi from Greeting"
//a static method sayWelcome() that prints "Welcome!"
//Implement the interface in a class and test all methods.
public class Lab_093_DefaultandStaticMethods {
    public static void main(String[] args) {
        Greeting g=new Test();
        g.sayHello();
        g.sayHi();
        Greeting.sayWelcome();
    }
}
interface Greeting
{
    void sayHello();
    default void sayHi()
    {
        System.out.println("Hi from Greeting");
    }
    static void sayWelcome()
    {
        System.out.println("Welcome!");
    }
}
class Test implements Greeting
{
    public void sayHello()
    {
        System.out.println("Hello!");

    }
}

