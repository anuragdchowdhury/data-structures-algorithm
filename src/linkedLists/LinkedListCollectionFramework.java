package linkedLists;

import java.util.LinkedList;

public class LinkedListCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addLast("This");
        list.addLast("is");
        list.addLast("a");
        list.addLast("book");
        System.out.println(list);
        //    Iterate and Print all Nodes
        System.out.println("Iterate and Print all Nodes");
        for (String s : list) {
            System.out.print(s + " -> ");
        }
        System.out.print("NULL");
        System.out.println("");

//        Remove First and Last Index
        System.out.println("Remove First and Last Index");
        list.removeFirst();
        list.removeLast();
        for (String s : list) {
            System.out.print(s + " -> ");
        }
        System.out.print("NULL");
        System.out.println("");

//        Remove Node at Particular Index
        System.out.println("Remove Node at Particular Index");
        list.remove(1);
        for (String s : list) {
            System.out.print(s + " -> ");
        }
        System.out.print("NULL");
        System.out.println("");

//        Add Node Particular Index
        System.out.println("Add Node Particular Index");
        list.add(1, "a");
        list.add(2, "book");
        for (String s : list) {
            System.out.print(s + " -> ");
        }
        System.out.print("NULL");
        System.out.println("");
    }
}
