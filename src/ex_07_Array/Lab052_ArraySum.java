package ex_07_Array;

public class Lab052_ArraySum {
    public static void main(String[] args) {
        int[] array = {12, 34, 10};

        int sum=0;
        for(int index =0;index < array.length;index++)
        {
            sum=sum+array[index];
        }
        System.out.println("Sum is "+sum
        );

        //with for each
        int total=0;
        for(int n:array)
        {
            total=total+n;
        }
        System.out.println(total);
    }
}
