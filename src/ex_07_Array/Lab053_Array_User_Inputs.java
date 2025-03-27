package ex_07_Array;

import java.util.Scanner;

public class Lab053_Array_User_Inputs {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size=sc.nextInt();

//        int[] numbers_marks =  new int[size];
//        float[] numbers_marks =  new float[size];

        String[] number= new String[size];

        for(int i=0;i<number.length;i++)
        {
            System.out.println("Enter the elements for the array");
            number[i]=sc.next();
//            numbers_marks[i] = sc.nextFloat();
        }


        for(int i=0;i<=number.length-1;i++)
        {
            System.out.print(" "+number[i]);
        }
        sc.close();
    }

}
///Enter size of the array
/// 5
/// Enter the elements for the array
/// 1
/// Enter the elements for the array
/// 2
/// Enter the elements for the array
/// 3
/// Enter the elements for the array
/// 4
/// Enter the elements for the array
/// 5
///  1 2 3 4 5