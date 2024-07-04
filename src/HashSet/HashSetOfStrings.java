package HashSet;
import  java.util.*;
public class HashSetOfStrings {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();


        hashSet.add("Ajit");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");


        for (String element : hashSet) {
            System.out.println(element);
        }

    }
}
