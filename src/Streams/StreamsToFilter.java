package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsToFilter {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Applie");
        fruits.add("Banana");
        fruits.add("Avocado");
        fruits.add("Cherry");
        fruits.add("Apricot");

        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .collect(Collectors.toList());


        System.out.println("Filtered list of fruits: " + filteredFruits);
    }
}
