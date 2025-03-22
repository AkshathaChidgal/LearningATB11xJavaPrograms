package ex_01_Java_Basics.ex_Task;

import java.util.Scanner;

public class Task_9_Palindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string to check its palindrome or not palindrome");
        String str=scanner.nextLine().toLowerCase();
        String reverse=new StringBuilder(str).reverse().toString();
        if(str.equals(reverse))
            System.out.println(str+" is palindrome");
        else
            System.out.println(str+" is not apalindrome");
    }
}
//Creates a StringBuilder with str.
//
//Reverses the string using .reverse().
//
//Converts it back to a String using .toString().
//
//Stores the reversed string in reverse.