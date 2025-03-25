package ex_03_for_loop;

import java.util.Scanner;

public class Lab025_FibonacciLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for N");
        int N = scanner.nextInt();

//Fibonacci Series Logic in Java
//The Fibonacci series is a sequence where:
//The first two terms are 0 and 1.
//Each subsequent term is the sum of the previous two terms.
//Formula:
//F(n)=F(n−1)+F(n−2);

/*Explanation:
Initialize first two numbers: a = 0, b = 1
Loop from 2 to n-1
Calculate next = a + b
Update a = b and b = next
Print the series
 Output for n = 10:
Fibonacci Series: 0 1 1 2 3 5 8 13 21 34*/

    int a=0,b=1,next;
        System.out.print("Fibonacci Series: " + a + " " + b);
    for(int i=2;i<N;i++)
    {
        next=a+b;
        System.out.println(" "+next);
        a=b;
        b=next;
        //System.out.println("Fibonacci series for "+N+ "is "+next);
    }

    }
}
/*
public class FibonacciSeries {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2 + " ");

        for(int i = 2; i < 10; i++) {
            n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
        }
    }
}

 */