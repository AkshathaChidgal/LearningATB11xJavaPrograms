package ex_23_Collection_Frameworks_DSA.LIST;
import java.util.ArrayList;
import java.util.List;

public class Lab_115_ArrayList {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Akshatha");
        a.add(null);
        a.add(23354654);//different datatype is allowed
        a.add("hello");
        a.add("hello"); //duplicate is allowed
        a.add(false);
        System.out.println(a);
        System.out.println(a.size());

         List l=new ArrayList(); // Dynamic dispatch
         l.add(123);
         l.add("Hello");
         l.add("Hi");
        System.out.println(l);
        System.out.println(l.isEmpty());

         List l2=new ArrayList();
        System.out.println(l2.isEmpty());



    }
}
