package HashMap;

import java.util.HashMap;

public class ExitInHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> nameAgeMap = new HashMap<>();


        nameAgeMap.put("Alice", 30);
        nameAgeMap.put("Bob", 25);
        nameAgeMap.put("Charlie", 35);
        nameAgeMap.put("Diana", 28);
        nameAgeMap.put("Edward", 40);


        String keyToCheck = "Charlie";


        if (nameAgeMap.containsKey(keyToCheck)) {
            System.out.println("The key \"" + keyToCheck + "\" exists in the HashMap with value: " + nameAgeMap.get(keyToCheck));
        } else {
            System.out.println("The key \"" + keyToCheck + "\" does not exist in the HashMap.");
        }


        String anotherKeyToCheck = "Frank";

        if (nameAgeMap.containsKey(anotherKeyToCheck)) {
            System.out.println("The key \"" + anotherKeyToCheck + "\" exists in the HashMap with value: " + nameAgeMap.get(anotherKeyToCheck));
        } else {
            System.out.println("The key \"" + anotherKeyToCheck + "\" does not exist in the HashMap.");
        }
    }
}
