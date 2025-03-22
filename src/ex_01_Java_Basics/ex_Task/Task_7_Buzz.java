package ex_01_Java_Basics.ex_Task;

import java.util.Scanner;

public class Task_7_Buzz {
    //    Write a program that prints numbers from 1 to 100. However, for multiples of 3, print "Fizz" instead of the number, and for multiples of 5, print "Buzz." For numbers that are multiples of both 3 and 5, print "FizzBuzz."
//
//(for loop, if else) ( i%3==0) → 3 , i%5==0 → 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i;
        for (i = 1; i <= num; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz" + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz" + i);
            } else if (i % 3 == 0) {
                System.out.println("Buzz" + i);
            } else {
                System.out.println(i);
            }
        }
    }
}

