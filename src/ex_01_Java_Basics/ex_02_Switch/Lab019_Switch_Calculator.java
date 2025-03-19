package ex_01_Java_Basics.ex_02_Switch;

import java.util.Scanner;

public class Lab019_Switch_Calculator {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();


        int result = switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> (num2 != 0) ? num1 / num2 : 0; // Prevent divide by zero
            case '%' -> (num2 != 0) ? num1 % num2 : 0; // Modulo operation
            default -> {
                System.out.println("Invalid operator!");
                yield 0; // Return 0 for invalid operator
            }
        };
        System.out.println("Result "+result);

        scanner.close();

    }
}
