package ex_07_Array;

public class Lab048_ArrayPrinitingElements {
    public static void main(String[] args) {


        int[] array = {100, 200, 300, 400};
        System.out.println(array.length);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]);//will print the elements from the index i
        }


        //we can also use for each loop/enhance loop to print array elements

        for(int n:array)
        {
            System.out.println(n);
        }
    }
}