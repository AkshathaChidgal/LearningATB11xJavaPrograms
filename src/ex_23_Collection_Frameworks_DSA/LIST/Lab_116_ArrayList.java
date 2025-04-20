package ex_23_Collection_Frameworks_DSA.LIST;

import java.util.ArrayList;

import java.util.List;

public class Lab_116_ArrayList {
    public static void main(String[] args) {
     List lt=new ArrayList();
     lt.add("1");
     lt.add("2");
     lt.add("3");
     lt.add("3");
     lt.add(4);
     lt.add(true);

        System.out.println(lt.size());
        System.out.println(lt.isEmpty());
        System.out.println(lt.contains("1"));
        System.out.println(lt.contains(1));
        System.out.println(lt.indexOf("3")); //first index
        System.out.println(lt.lastIndexOf("3"));
        System.out.println(lt);


        //by defult length of the array list is 10 , auto increase if more entries needs to be added

        System.out.println("-----------------");
        for(int i=0;i<lt.size();i++)
        {
            System.out.println(lt.get(i));
        }

        lt.clear();  //clears all the elements
        System.out.println(lt);

    }


}
