package ex_07_Array;

public class Lab049_ArrayMax {
    public static void main(String[] args) {
        int[] numbers={34,56,78,56,101,45,99,67,89,300,99};
        int max=numbers[0];
        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>max)
                max=numbers[i];
        }
        System.out.println("max element is "+max);
    }

}
