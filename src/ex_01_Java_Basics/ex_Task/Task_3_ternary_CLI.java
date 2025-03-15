package ex_01_Java_Basics.ex_Task;

public class Task_3_ternary_CLI {
    public static void main(String[] args) {
//        Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        String result=(a>b)?"A = "+a+" greater than B":"B = "+b+" is the maximum number";

        System.out.println(result);

//        i/p: 25 50
//        B = 50 is the maximum number
    }
}
