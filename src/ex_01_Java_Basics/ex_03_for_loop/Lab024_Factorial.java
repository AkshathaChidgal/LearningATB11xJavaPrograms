package ex_01_Java_Basics.ex_03_for_loop;

import java.util.Scanner;

public class Lab024_Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value for N");
        int N=scanner.nextInt();
        int factorial=1;
        for (int i = 1; i <=N ; i++) {
            factorial=factorial*i;
        }
        System.out.println("Factorial of " +N+ " is " +factorial );
    }
}

/*
Formula:
n!=n×(n−1)×(n−2)×...×1
For example:
5!=5×4×3×2×1=120

Initialize fact = 1 (since factorial involves multiplication).
Loop from 1 to num using a for-loop.
Multiply fact by i at each iteration.
Print the result after the loop completes.
 */