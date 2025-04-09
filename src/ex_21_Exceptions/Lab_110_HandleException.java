package ex_21_Exceptions;

public class Lab_110_HandleException {
    public static void main(String[] args) {
        int a=0;
        try
        {
            a=10/0;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(a);
    }
}

 // Checked - JVM
       // JVM knows about it , During Compilation - JVM is saying that
       // there can be case when this file is not found.

       // JVM knows that this may lead to file not found exception
       // so its telling to handle it.