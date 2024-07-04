package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class AddElementInLinkedList {
    public static void main(String[] args) {


        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        integerLinkedList.add(10);
        integerLinkedList.add(20);
        integerLinkedList.add(30);
        integerLinkedList.add(40);
        integerLinkedList.add(50);
        integerLinkedList.add(60);

        System.out.println("Element in the linked list");
        Iterator<Integer> iterator = integerLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("Elements in the LinkedList using a for-each loop:");
        for (Integer element : integerLinkedList) {
            System.out.println(element);

        }
    }
}