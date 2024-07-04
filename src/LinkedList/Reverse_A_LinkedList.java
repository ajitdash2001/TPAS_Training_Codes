package LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class Reverse_A_LinkedList {


    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList= new LinkedList<>();
        integerLinkedList.add(10);
        integerLinkedList.add(20);
        integerLinkedList.add(30);
        integerLinkedList.add(40);
        integerLinkedList.add(50);

        System.out.println("linked list before reverse"+integerLinkedList);
        Collections.reverse(integerLinkedList);
        System.out.println("linked list after reverse"+integerLinkedList);
    }
}
