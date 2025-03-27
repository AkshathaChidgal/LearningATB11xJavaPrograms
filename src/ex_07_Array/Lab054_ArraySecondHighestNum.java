package ex_07_Array;

import java.util.Arrays;

public class Lab054_ArraySecondHighestNum {
    public static void main(String[] args) {
        int numbers[]={100,34,56,78,35,57};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1]); //highest num -> last index is highest after sorting
        System.out.println(numbers[numbers.length-2]); //second highest -> length-2


    }
}
