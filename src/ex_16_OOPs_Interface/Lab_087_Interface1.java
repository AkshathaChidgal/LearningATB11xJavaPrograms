package ex_16_OOPs_Interface;

public class Lab_087_Interface1 {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.sound();
    }
}
interface Animal
{
    void sound();
}
class Dog implements Animal
{
    public void sound()
    {
        System.out.println("Dogs Barks");
    }
}
//you cannot create an object of an interface directly because it is abstract by nature. But you can create a reference to an interface and assign it an object of a class that implements it.

// An interface in Java is a blueprint of a class that can contain abstract methods (without implementation) and static or default methods (from Java 8 onwards). It is used to achieve abstraction and multiple inheritance in Java.

//interfaces cannot have constructors because they cannot be instantiated directly.