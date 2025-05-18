package ex_23_Collection_Frameworks_DSA.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab_127_Set {
    public static void main(String[] args) {
        Set hs=new HashSet();
        Set lhs=new LinkedHashSet();
        Set ts=new TreeSet();

        hs.add("Akshatha");
        hs.add("Akshatha"); //Duplicates are not allowed
        hs.add(null); //one null can be added to hash set
        System.out.println(hs);
    }
}
