package ex_01_Java_Basics;

public class Lab013_DecrementOP {
    public static void main(String[] args) {

        int c=9;
        int d=--c; //pre decrement
        System.out.println(c);  //8
        System.out.println(d); //8

        //post decrement
        int e=9;
        int f=e--;
        System.out.println(f); // 9
        System.out.println(e); //8
    }
}
