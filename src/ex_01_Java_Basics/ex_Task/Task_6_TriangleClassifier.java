package ex_01_Java_Basics.ex_Task;

public class Task_6_TriangleClassifier {
//    Write a program that classifies a triangle based on its side lengths. Given three input values representing the lengths of the sides, determine if the triangle is equilateral (all sides are equal), isosceles (exactly two sides are equal), or scalene (no sides are equal). Use an if-else statement to classify the triangle.
public static void main(String[] args) {
    int a=Integer.parseInt(args[0]);
    int b=Integer.parseInt(args[1]);
    int c=Integer.parseInt(args[2]);
    if(a==b)
    {
        if(b==c)
        {
            System.out.println("equilateral triangle (all sides are equal)");
        }
        else
            System.out.println("isosceles triangle (exactly two sides are equal)");
    }
    else
        System.out.println("scalene triangle (no sides are equal)");
}

}

//i/p: 2 3 4
//o/p:scalene triangle (no sides are equal)
//i/p: 2 2 2
//o/p:equilateral triangle (all sides are equal)
//i/p: 2 2 4
//o/p:isosceles triangle (exactly two sides are equal)