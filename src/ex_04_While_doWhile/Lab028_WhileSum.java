package ex_04_While_doWhile;

import java.util.Scanner;

public class Lab028_WhileSum {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the num to find the sum");
        int num=scanner.nextInt();
        int sum=0;
        while (num > 0) {
            sum += num % 10; // Extract last digit and add to sum
            num /= 10;       // Remove last digit
        }
        System.out.println("sum is" +sum);
    }
}
