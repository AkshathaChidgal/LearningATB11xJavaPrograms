package ex_06_Strings;

public class Lab037_StringImmutable {
    public static void main(String[] args) {
        String name="AkshathaChidgal";
        name.toUpperCase();//AKSHATHACHIDGAL  --it is not assigned
        System.out.println(name);//AkshathaChidgal


       String  s= name.toUpperCase();//AKSHATHACHIDGAL
        System.out.println(s); //AKSHATHACHIDGAL
    }
}
