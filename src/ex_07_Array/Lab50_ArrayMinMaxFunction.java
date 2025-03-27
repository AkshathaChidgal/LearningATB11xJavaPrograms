package ex_07_Array;

public class Lab50_ArrayMinMaxFunction {
    public static void main(String[] args) {
        int[] array = {300, 45, 67, 89, 34, 400, 5, 3};

        int max_output = give_me_max(array);
        System.out.println("Max is "+max_output);
        int min_output = give_me_min(array);
        System.out.println("Min is "+min_output);

    }

    static int give_me_min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int give_me_max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max)
                max = array[i];
        }
        return max;
    }
}
