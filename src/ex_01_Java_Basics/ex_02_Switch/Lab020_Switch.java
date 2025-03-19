package ex_01_Java_Basics.ex_02_Switch;

import java.util.Scanner;

public class Lab020_Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a grade between 1 to 100");
        int grade=sc.nextInt();

        char result=switch(grade/10)
        {
            case 10,9->'A';
            case 8,7->'B';
            case 6->'C';
            case 5,4->'D';
            default-> {
                System.out.println("Fail");
                yield 0;
            }


        };
        System.out.println("Grade is "+result);
    }
}
