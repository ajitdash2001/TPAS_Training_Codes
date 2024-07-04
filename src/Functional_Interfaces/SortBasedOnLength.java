package Functional_Interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnLength {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Banana");
        words.add("Cherry");
        words.add("Date");
        words.add("Elderberry");
        words.add("Fig");
        words.add("Grape");

        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());


        Collections.sort(words, lengthComparator);


        System.out.println("Sorted list of words by length: " + words);
    }
}
