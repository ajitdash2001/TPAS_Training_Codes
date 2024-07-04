package HashSet;

import java.util.HashSet;

public class InterSectionOfTwoHashSet {

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        set1.add("apple");
        set1.add("Banana");
        set1.add("Cherry");
        set1.add("Date");

        set2.add("Cherry");
        set2.add("Date");
        set2.add("Elderberry");
        set2.add("Fig");

        HashSet<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Intersection of set1 and set2: " + intersection);
    }
}
