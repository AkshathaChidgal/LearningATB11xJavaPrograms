package ex_23_Collection_Frameworks_DSA.LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_119_LL2 {
    public static void main(String[] args) {
        List mylist=new ArrayList();
        List mylist1=new ArrayList();

        List mylist2=new LinkedList();

        mylist2.add("Akshatha");
        mylist2.add("Ram");
        mylist2.add("Amit");
        mylist2.add("meenu");
        mylist2.add("ritwik");
        mylist2.add("ritwik");
        mylist2.add(null);
        mylist2.add(true);
        mylist2.add(123);
        System.out.println(mylist2);

        System.out.println(mylist2.isEmpty());
        System.out.println(mylist2.size());
        System.out.println(mylist2.contains("Chidgal"));
        System.out.println(mylist2.indexOf("Akshatha"));
    }
}
