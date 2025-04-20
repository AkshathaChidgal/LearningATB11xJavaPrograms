package ex_23_Collection_Frameworks_DSA.LIST;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Lab_120_Vectors {
    public static void main(String[] args) {
        Vector v=new Vector();
        Vector v1= new Vector(10);

        v.add("Akshatha");
        v.add("Rahul");
        v.add("Abhi");
        v.add("Vicky");
        System.out.println(v);
        v.remove("Vicky");
        v.contains("Rahul");
        System.out.println(v);

        System.out.println("-------------");

        for (int i=0;i<v.size();i++)
        {
            System.out.println(v.get(i));
        }

        System.out.println("----for each----");
        for(Object o:v)
        {
            System.out.println(o);
        }

        System.out.println("----iterator-----");
        Iterator iterator =v.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("---------enumeration---------");
        Enumeration<Object> enumeration=v.elements();
        while (enumeration.hasMoreElements())
        {
            System.out.println(enumeration.nextElement());
        }

        System.out.println("-----list iterator---------");
        ListIterator listIterator=v.listIterator();
        while (listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

        System.out.println("----Backward direction print");
        System.out.println("\nBackward Direction:");
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }
    }
}
