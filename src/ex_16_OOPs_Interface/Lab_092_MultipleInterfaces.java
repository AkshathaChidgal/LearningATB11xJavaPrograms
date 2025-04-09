package ex_16_OOPs_Interface;
//✅ Exercise 4: Multiple Interfaces
//Task:
//Create interfaces Flyable and Swimmable with methods fly() and swim() respectively.
//Create a class Duck that implements both and prints suitable messages.
 class Lab_92_MultipleInterfaces {
    public static void main(String[] args) {
        Duck d=new Duck();
        d.fly();
        d.swim();
    }
}
interface Flyable{
    void fly();
}
interface Swimmable{
    void swim();
}
class Duck implements Flyable,Swimmable
{
    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}

