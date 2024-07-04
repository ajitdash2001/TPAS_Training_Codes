package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamsToMaximam {
    public static void main(String[] args) {
        List<Integer>  numbers= new ArrayList<>();

        numbers.add(30);
        numbers.add(43);
        numbers.add(65);
        numbers.add(70);
        numbers.add(88);

        Optional<Integer> maxNumber=numbers.stream()
                .max(Integer::compareTo);
        maxNumber.ifPresent(max -> System.out.println("Maximum number: " + max));

    }
}
