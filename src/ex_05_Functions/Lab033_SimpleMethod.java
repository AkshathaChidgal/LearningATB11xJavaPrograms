package ex_05_Functions;

public class Lab033_SimpleMethod {
    public static void main(String[] args) {
//call the below methods here
        Akshathaf1();
        AkshathaInt();
        AkshathaString();
        AkshathaBoolean();
        AkshathaFloat(100.f);
        return_byte_Akshatha();
    }
    static void Akshathaf1()
    {
        System.out.println("This method does not return anything");
    }
    static int AkshathaInt()
    {
        //System.out.println("This method returns int value");
        return 1050;
    }
    static boolean AkshathaBoolean()
    {
        //System.out.println("Return boolean");
        return true;
    }
    static float AkshathaFloat(float a)
    {
        //System.out.println("return float");
        return 13.47f;
    }
    static String AkshathaString()
    {
        return "AkshathaC";
    }
    static byte return_byte_Akshatha(){
        return 100;
    }


}
