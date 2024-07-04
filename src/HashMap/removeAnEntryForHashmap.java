package HashMap;

import java.util.HashMap;

public class removeAnEntryForHashmap {

    public static void main(String[] args) {
        HashMap<String,Integer>nameAgeMap=new HashMap<>();
        nameAgeMap.put("Alice", 30);
        nameAgeMap.put("Bob", 25);
        nameAgeMap.put("Charlie", 35);
        nameAgeMap.put("Diana", 28);
        nameAgeMap.put("Edward", 40);

        System.out.println("Original HashMap: " + nameAgeMap);

        String keyToRemove = "Charlie";
        Integer removedValue = nameAgeMap.remove(keyToRemove);

        if (removedValue != null) {
            System.out.println("Removed entry with key \"" + keyToRemove + "\" and value " + removedValue);
        } else {
            System.out.println("No entry found with key \"" + keyToRemove + "\"");
        }


        System.out.println("Updated HashMap: " + nameAgeMap);
    }
}
