package ex_16_OOPs_Interface;

public class Lab_088_Interface2 {
    public static void main(String[] args) {
        C c=new C();
        c.show();
        c.greet();//✅ This will call default method, which calls private method internally


        A c1=new C();
        c1.show();

        // Call static method from interface A
        A.print(); //  you must use the interface name itself to call the interface static method
    }
}
interface A{
    static void print()
    {
        System.out.println("Static method in Interface");
    }
    void show();
    // static methods are allowed in interfaces from java 8 onwards

    private static void helper()
    {
        System.out.println("Private helper method");
//        starting from Java 9, interfaces can have private methods to support code reuse within default or static methods.
    }
    default void greet()
    {
        helper();//👈 Private method call
        System.out.println("Hello from greet()");
    }

}
interface B{
    void show();
}
class C implements A,B{
    public void show()
    {
        System.out.println(" If a class implements both interfaces, it just needs to provide one implementation for the common method.");
    }
}

//1. Default Methods in Interfaces (Java 8+)
//Default methods allow you to provide method implementations inside interfaces.
//You can call them via object reference of the implementing class.