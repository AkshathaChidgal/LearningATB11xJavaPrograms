package ex_15_OOPs_Abstraction;

public class Lab_084_Abstraction2 {
    public static void main(String[] args) {
        Father c=new Child();
        c.Loan25k();
        c.Loan50k();


    }
}
abstract  class Father
{
    abstract  void Loan25k();
    void Loan50k()
    {
        System.out.println("50k loan");
    }

}
class Child extends Father
{
    @Override
    void Loan25k() {
        {
            System.out.println("Child will pay the father loan");
        }
    }
    void Loan50k()//overriding the Loan50k() method in the Child class.
    {
        super.Loan50k(); // Calling Father's Loan50k()
        System.out.println("Child will pay his own loan also");
    }
}

