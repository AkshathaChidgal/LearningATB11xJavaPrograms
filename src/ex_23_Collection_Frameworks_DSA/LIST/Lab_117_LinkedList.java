package ex_23_Collection_Frameworks_DSA.LIST;
import java.util.List;
import java.util.LinkedList;

public class Lab_117_LinkedList {
    public static void main(String[] args) {

        //linked list -> doubly linked list implemented for the list & deque interface
        //provides better performance to add & delete

        List list=new LinkedList();//doesnot take initial capacity
        list.add("a");
        list.add("b");
        list.add("c");
    }
}
