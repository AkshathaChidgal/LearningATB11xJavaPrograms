package ex_23_Collection_Frameworks_DSA.LIST;

import java.util.LinkedList;

public class Lab_118_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> animals=new LinkedList();

        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephant");
        System.out.println(animals);

        //accessing elements
        System.out.println("First element :"+animals.getFirst());
        System.out.println("Last element :"+animals.getLast());

        //removing elements
        animals.removeFirst();
        animals.removeLast();
        System.out.println("Linked list after removal: "+animals);
        System.out.println(animals.size());
    }
}
