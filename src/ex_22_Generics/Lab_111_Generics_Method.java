package ex_22_Generics;

public class Lab_111_Generics_Method {
    public static void main(String[] args) {

       temp_sum(3,5);
       temp_sum(11.4,4.6);
       temp_sum("Akshatha"," Chidgal");
    }
//    static int temp_sum(int a, int b)
//    {
//        return a+b;
//    }

    static <T> T temp_sum(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);

        return null;
    }

}

