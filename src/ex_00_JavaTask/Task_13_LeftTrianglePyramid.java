package ex_00_JavaTask;

import java.util.Scanner;

public class Task_13_LeftTrianglePyramid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter size for pattern");
        int n=scanner.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//Enter size for pattern
//6
//******
//*****
//****
//***
//**
//*