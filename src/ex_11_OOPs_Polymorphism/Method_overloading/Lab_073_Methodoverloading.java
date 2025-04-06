package ex_11_OOPs_Polymorphism.Method_overloading;

public class Lab_073_Methodoverloading {
    public static void main(String[] args) {
      AddOperation a= new AddOperation();
     int r1= a.add(10,20);
        System.out.println(r1);
     int r2=a.add(100,200,300);
        System.out.println(r2);
     double r3=a.add(3.14,4);
        System.out.println(r3);
     String r4=a.add("Hello"," World");
        System.out.println(r4);


    }
}
class AddOperation
{
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b,int c)
    {
        return a+b+b;
    }
    double add(double a, int b)
    {
        return a+b;
    }
    String add(String a, String b)
    {
        return a+b;
    }

}
