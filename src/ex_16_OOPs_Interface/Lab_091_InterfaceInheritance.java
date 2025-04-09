package ex_16_OOPs_Interface;
//✅ Exercise 3: Interface Inheritance
//Task:
//Create an interface Printable with method print().
//Create another interface Showable that extends Printable and adds show().
//Create a class Document that implements Showable and defines both methods.
 class Lab_91_InterfaceInheritance {
    public static void main(String[] args) {
        Document d=new Document();
        d.print();
        d.show();
    }
}
interface Printable
{
    void print();
}
interface Showable extends Printable
{
    void show();
}
class Document implements Showable
{
    public void show()
    {
        System.out.println("show");
    }

    @Override
    public void print() {
        System.out.println("Print");
    }
}

