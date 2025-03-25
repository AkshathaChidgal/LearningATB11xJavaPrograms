package ex_03_for_loop;

import java.util.Scanner;

public class Lab022_EvenOddNumbers {
//    Print Even and Odd Numbers up to N
public static void main(String[] args) {

    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter value for N");
    int N=scanner.nextInt();

    for (int i = 0; i <= N; i++) {
        if(i%2==0)
        {
            System.out.println(i+" is Even number");
        }
        else
        {
            System.out.println(i+ " is Odd number");
        }
    }
}

}
