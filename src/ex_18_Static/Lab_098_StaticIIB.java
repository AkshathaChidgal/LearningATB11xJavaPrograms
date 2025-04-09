package ex_18_Static;

public class Lab_098_StaticIIB {
    public static void main(String[] args) {
        P p=new P();
        P p1=new P();
        P p2=new P();
        P p3=new P();
    }
}
class P
{
    P()
    {
        System.out.println("constructor");
    }
    {
        System.out.println("IIB");
    }
    static {
        System.out.println("Static IIB -given first perfernce for execution");
    }
}
