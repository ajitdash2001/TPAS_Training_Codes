package HashSet;

import java.util.HashSet;

public class SpaceficElementExitOrNot {
    public static void main(String[] args) {


        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");

        String elementToCheck = "Banana";

        if(hashSet.contains(elementToCheck)){
            System.out.println(elementToCheck + "exit in hashSet");
        }
        else{
            System.out.println(elementToCheck + "does not exit in hashset");
        }
    }
}