package ex_16_OOPs_Interface;
//✅ Exercise 7: Conflict Between Interfaces
//Task:
//Create two interfaces A and B both with a default method say().
//Create a class MyClass that implements both and resolves the conflict by overriding say().
//Use A.super.say() or B.super.say() in the implementation.
public class Lab_094_ConflictBetweenInterfaces {
    public static void main(String[] args) {
        MyClass obj =new MyClass();
        obj.say();// This will call the overridden method in MyClass
    }
}
interface Aa
{
    default void say()
    {
        System.out.println("Default say() from Aa");
    }
}
interface Bb
{
    default void say()
    {
        System.out.println("Default say() from Bb");
    }
}
class MyClass implements Aa,Bb
{
    public void say()
    {

        System.out.println("Overridden say() in MyClass");
        // Call default method from Aa
        Aa.super.say();
        // Call default method from Bb
        Bb.super.say();
    }
}
