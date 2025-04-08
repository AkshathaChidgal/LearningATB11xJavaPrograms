package ex_15_OOPs_Abstraction;

public class Lab_083_Abstraction1 {
    public static void main(String[] args) {
        Animal d=new Dog(); //Polymorphism
        d.sound();// Dog's implementation
        d.eat();// Inherited method
    }


}
abstract class Animal
{
    Animal()
    {
        System.out.println("Animal class constructor");
    }
   abstract void sound();//abstract method , No body
    void eat() //concrete or complete method
    {
        System.out.println("Animals eat food");
    }
}
class Dog extends Animal
{
    void sound()
    {
        System.out.println("Animals make sound");
    }
}

// The abstract keyword is used to define:
//Abstract classes (cannot be instantiated / cannot create object)
//Abstract methods (no body, must be implemented in a subclass)
//It's used when you want to provide a base class with common structure, but force subclasses to provide specific implementations.