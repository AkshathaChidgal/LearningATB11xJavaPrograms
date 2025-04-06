package ex_11_OOPs_Polymorphism.Method_overloading;

public class Lab_074_MethodoverloadingTask {
    public static void main(String[] args) {
        Home h=new Home();
        h.task(1);
        h.task(1,2);
        h.task(1,2,3);
    }
}
class Home
{
    void task(int a)
    {
        System.out.println(a);
    }
    void task(int a, int b)
    {
        System.out.println(a+b);
    }
    void task(int a, int b,int c)
    {
        System.out.println(a+b+c);
    }
}
