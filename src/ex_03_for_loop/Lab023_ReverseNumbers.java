package ex_03_for_loop;

import java.util.Scanner;

public class Lab023_ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value for N");
        int N=scanner.nextInt();

        for (int i = N; i >=1 ; i--) {
            System.out.print(i+ " ");
        }
    }
}
//Enter value for N
//20
//20 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1