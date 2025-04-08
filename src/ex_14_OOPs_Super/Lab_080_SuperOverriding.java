package ex_14_OOPs_Super;

public class Lab_080_SuperOverriding {
    public static void main(String[] args) {
        Cat c=new Cat();
        c.sound();
    }
}
class Animal1
{
    void sound()
    {
        System.out.println("Animals makes sound");
    }
}
class Cat extends Animal1
{
    @Override
    void sound() {
        super.sound();
        System.out.println("Cats make sound");
    }
}
//When a subclass overrides a method from its parent, super.methodName() can be used to call the overridden method of the parent class.