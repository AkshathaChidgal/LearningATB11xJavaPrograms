package ex_07_Array;

import java.util.Scanner;

public class Lab_059_MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for multiplication");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print(i + "x" + j + "=" + (i * j) + "\t\t");
                //System.out.print((i * j) + "\t");
            }
            System.out.println();

        }
    }
}
