package ex_11_OOPs_Polymorphism.Method_overriding;

public class Lab_075_Methodoverriding {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.sound();
        Crow c=new Crow();
        c.sound();
        Animal a=new Animal();
        a.sound();

    }

}
class Animal
{
    void sound()
    {
        System.out.println("Animals make sound!");
    }
}
class Dog extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Dog makes barking sound");
    }
}
class Crow extends Animal
{
    @Override
    void sound()
    {
        System.out.println("Crow makes ka ka ka sound");
    }
}