package ex_01_Java_Basics.ex_03_for_loop;

import java.util.Scanner;

public class Lab021_PrintNumbers {
    public static void main(String[] args) {
//         Print Numbers from 1 to N
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter value for N");
        int N=scanner.nextInt();

        for(int i=1;i<=N;i++)
        {
            System.out.print(i+" ");
        }
    }
}
