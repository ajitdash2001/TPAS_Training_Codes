package LinkedList;

import java.util.LinkedList;

public class MiddleElementOfLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.add(40);
        integerList.add(50);
        integerList.add(60);

        Integer middleElement = findMiddleElement(integerList);


        System.out.println("The middle element is: " + middleElement);
    }

    public static Integer findMiddleElement(LinkedList<Integer> list) {
        if (list.isEmpty()) {
            return null;

        }
        int slowPointer = 0;
        int fastPointer = 0;

        while (fastPointer < list.size() && fastPointer + 1 < list.size()) {
            slowPointer++;
            fastPointer += 2;
        }


        return list.get(slowPointer);
    }
}