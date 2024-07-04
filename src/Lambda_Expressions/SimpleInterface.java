package Lambda_Expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SimpleInterface {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("orange");
        fruits.add("Mengo");
        fruits.add("banabn");

        Comparator<String> comparator = (String s1, String s2) -> s1.compareTo(s2);

        // Sort the list using the comparator
        Collections.sort(fruits, comparator);

        // Print the sorted list
        System.out.println("Sorted list of fruits: " + fruits);
    }
}
