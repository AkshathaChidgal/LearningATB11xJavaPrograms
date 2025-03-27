package ex_00_JavaTask;

import java.util.Scanner;

public class Task_10_Array_SecondHighest {
    public static void main(String[] args) {
        //Find Second Largest Number in an Array in java without any function
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        int arr[]=new int[size];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("enter the elements");
            arr[i]=sc.nextInt();
        }

        int max=0;
        int second_max=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                second_max=max;
                max=arr[i];
            }
            else if(arr[i]>second_max && arr[i]!=max)
                second_max=arr[i];
        }
        System.out.println("First highest: "+max);
        System.out.println("second highest: "+second_max );
    }

}
