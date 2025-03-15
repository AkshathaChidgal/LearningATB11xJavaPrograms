package ex_01_Java_Basics.ex_Task;

public class Task_5_EvenOdd {
    public static void main(String[] args) {
//        Create a Program - Take user input & Check whether the input is even or odd number
        int a=Integer.parseInt(args[0]);
        if(a % 2==0)
        {
            System.out.println(+a+" is Even");
        }
        else
        {
            System.out.println(+a+" is odd");
        }
    }
}
//i/p:240
//o/p:240 is Even

//o/p:500 is Even

//o/p:9 is odd
