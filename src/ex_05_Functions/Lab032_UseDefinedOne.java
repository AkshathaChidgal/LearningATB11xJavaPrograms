package ex_05_Functions;

public class Lab032_UseDefinedOne {
    public static void main(String[] args) {
        int c = sum_of_two_numbers(5, 10);
        int d = sum_of_two_numbers(100, 78);
        System.out.println("c "+c);
        System.out.println("d "+d);
    }

    static int sum_of_two_numbers(int a, int b) {
        //this method has int as the return type
        return a + b;
    }
}
