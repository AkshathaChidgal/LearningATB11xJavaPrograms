package ex_21_Exceptions;

public class Lab_109_TryCatch {
    public static void main(String[] args) {
        System.out.println("1");
        try{
            int a=100/0;
        }
        catch (Exception e)
        {
            System.out.println("Div by zero is not possible");
        }
        System.out.println("2");
    }
}

//output:
//1
//Div by zero is not possible
//2
