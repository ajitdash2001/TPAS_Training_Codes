package HashMap;

import java.util.HashMap;

public class PrintKeyvaluPair {
    public static void main(String[] args) {


        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ajit",23);
        map.put("Abhijeet",25);
        map.put("Hemanhga",27);
        map.put("Amit",22);
        map.put("Asit",21);
        System.out.println("Entries in the HashMap:");

        map.forEach((name, age) -> {
            System.out.println("Name: " + name + ", Age: " + age);
        });
    }
}