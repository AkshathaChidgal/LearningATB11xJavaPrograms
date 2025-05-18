package ex_23_Collection_Frameworks_DSA.SET;

import java.util.*;

public class Lab_128_HS_LHS_TS {
    public static void main(String[] args) {

        Set<String> hs=new HashSet<>();
        // Hashing mechanism to store the element
        // no order.
        // no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add("Egg fruit");
        // hs.add(123);
        hs.add(null);
//        hs.add(null);
        System.out.println(hs);
        System.out.println("-----------------------------------");

        for(String s:hs) //for each loop to fetch data
        {
            System.out.println(s);
        }
        System.out.println("-----Iterator------");
        //Iterator
        Iterator iterator=hs.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("--------------------");
        System.out.println("--Linked hash set");
        // LinkedList mechanism to store the element,
        // order will maintain, no duplicates
        Set lhs=new LinkedHashSet();
        lhs.add("Apple");
        lhs.add("Apple");
        lhs.add("Mango");
        lhs.add("Orange");
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("------------------");
        System.out.println("----Tree Set-------------");

        Set ts=new TreeSet();
        // Black and Red Tree mechanism to store the element.
        // order will maintain, Natural Sorting is done.
        // Natural Sorting - ASCII values.

        ts.add("Banana");
        ts.add("Pappaya");
        ts.add("Apple");
        ts.add("apple");
        ts.add("Orange");
        ts.add("WaterMelon");
//        ts.add("");
//        ts.add(123);  // java.lang.ClassCastException
//        ts.add(null); // java.lang.NullPointerException --null is not allowed, sorting cannot be done is there is null
        System.out.println(ts);

        System.out.println(" ----- For Each ---- ");

        for(Object o:ts){
            System.out.println(o);
        }





    }
}
