package ex_10_OOPs_1Single_Inheritance;

class Father
{
    int gold=50000;
    void bhk_2()
    {
        System.out.println("Father has 2 bhk house");
    }
}
class Son extends Father
{
    void bhk_3()
    {
        System.out.println("son has 3 bhk house");
    }
}

public class Lab_068_SingleInheritanceEg {
    public static void main(String[] args) {
        Father f1=new Father();
        System.out.println(f1.gold);
        f1.bhk_2();

        System.out.println("-----Son class can access father class------");
        Son s1=new Son();
        System.out.println(s1.gold);
        s1.bhk_3();
        s1.bhk_2();

    }
}
