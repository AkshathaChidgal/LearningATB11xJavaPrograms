package ex_07_Array;

public class Lab051_ArrayReverse {
    public static void main(String[] args) {
        int[] array = {300, 45, 67, 89, 34, 400, 5, 3};
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Array element is "+array[i]);
        }
    }
}

//to print reverse of elements, start from index legnth i.e, legnth-1 till index is equal 0 and index --
