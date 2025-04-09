package ex_16_OOPs_Interface;
//✅ Exercise 2: Interface with Parameters
//Task:
//Create an interface Calculator with a method add(int a, int b). Implement this in a class BasicCalculator and return the sum.

//Also create a main() method to test it.

public class Lab_090_InterfaceWithParameters {
    public static void main(String[] args) {
        BasicCalculator test=new BasicCalculator();
       int result= test.add(5,6);
        System.out.println(result);
    }
}
interface Calculator
{
    int add(int a, int b);
}
class BasicCalculator
{
    int add(int a,int b)
    {
        return a+b;
    }
}
