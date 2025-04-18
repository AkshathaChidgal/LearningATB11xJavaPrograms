package ex_23_Collection_Frameworks_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab_114_Interface {
    public static void main(String[] args) {


//        List ->interface object not possible
//        List fruits =new List();
       List fruits=List.of("orange","gauva","apple","grapes");
        System.out.println(fruits);
        //add is a incomplete funtion in list
//        fruits.add("chikku");//java.lang.UnsupportedOperationException
//        fruits.remove("apple");// java.lang.UnsupportedOperationException

        List l=new ArrayList();  //Dynamic dispatch
        l.add("hello");
        l.add(123);
        l.add("Blah blah");

    }
}
