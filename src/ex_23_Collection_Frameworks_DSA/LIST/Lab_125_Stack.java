package ex_23_Collection_Frameworks_DSA.LIST;

import java.util.Stack;

public class Lab_125_Stack {
    public static void main(String[] args) {

        //Stack
        //Last in fast out - LIFO

        Stack s=new Stack();
        s.push("akshatha");
        s.push("Hello");
        s.push("Ram");
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Snehal"));
        System.out.println(s);
        s.add("Chethan");
        s.add("Chethan");
        s.add("Rahul");
        System.out.println(s);
    }
}
