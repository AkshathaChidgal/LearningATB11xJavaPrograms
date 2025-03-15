package ex_01_Java_Basics;

public class Lab015_AdavncedInc_op {
    public static void main(String[] args) {
        int a=10;
        System.out.println(a++ + a);
        System.out.println(a);
        // line num | expA (a++)| a
        //5 |10 |na
        //6 |10 | 11
        // 7 | 11

        int b=10;
        System.out.println(b++ + ++b);
        //Divide & conquer rule
        //A+B -> A= b++ , B =++b
        //A= exp b ->10 ,b=11 , B= b->11+1=12
        //o/p->22

    }

}
