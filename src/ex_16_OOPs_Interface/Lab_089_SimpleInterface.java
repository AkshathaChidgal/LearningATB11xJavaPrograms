package ex_16_OOPs_Interface;
//✅ Exercise 1: Implement a Simple Interface
//Task:
//Create an interface Vehicle with a method start(). Create two classes Car and Bike that implement this interface and provide their own implementation of start().

//Expected Output:

//Car started.
//Bike started.
public class Lab_089_SimpleInterface {
    public static void main(String[] args) {
        Vehicle Car=new Car();
        Car.start();

        Vehicle Bike=new Bike();
        Bike.start();

    }
}
interface Vehicle
{
    void start();
}
class Bike implements Vehicle
{
    @Override
    public void start() {
        System.out.println("Bike started.");
    }
}
class Car implements Vehicle
{
    @Override
    public void start() {
        System.out.println("Car started.");
    }
}

