package ex_15_OOPs_Abstraction;

public class Lab_086_AbstractionEmployee {
    public static void main(String[] args) {

        //Emp1 e1=new Emp1();
        Emp1 e2=new Emp1("Jack","Delhi",250);

       // Employee("Jack,"Delhi",5000);
        e2.mailCheck();
    }
}
abstract class Employee
{
    private String name;
    private String address;
    private int number;
    Employee()
    {
        System.out.println("Default Constructor - Employee");
    }

    Employee(String name, String address, int number)
    {
        System.out.println("Parameterized Constructor - Employee");
        this.name=name;
        this.address=address;
        this.number=number;
    }

    abstract double computePay();

    void mailCheck()
    {
        System.out.println("Mailing to : "+this.address+" and name is : "+this.name);
    }
}
class Emp1 extends Employee
{
    Emp1(String name, String address, int number) {
        super(name, address, number); // Calling the parent parameterized constructor
        System.out.println("Constructor - Emp1");
        }
        @Override
        double computePay() {
            return 0;
    }
}

//⚠️ Java Rule:
//You cannot call both super() and super(...) in the same constructor, because only one constructor can be called, and it must be the first line.
//
//✅ Solution:
//To simulate calling both constructors, you can do this:
//
//Move common logic from the default constructor into a separate method.
//
//Call that method from the parameterized constructor.