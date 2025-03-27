package ex_00_JavaTask;

public class Task_11_ArrayEvenOdd {
    public static void main(String[] args) {
        int[] arr={2,5,3,4,5,7,8,9};
        for(int i:arr)
        {
            if(i%2==0)
            {
                System.out.println("Number "+i+" is even");
            }
            else
            {
                System.out.println("Number "+i+" is odd");
            }
        }
    }
}
