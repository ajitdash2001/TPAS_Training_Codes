package ArrayLists;

import java.util.ArrayList;
import java.util.HashSet;

public class removeDuplecate {

    public static void main(String[] args) {


        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(2);
        integerArrayList.add(3);
        integerArrayList.add(2);
        integerArrayList.add(4);
        integerArrayList.add(3);
        integerArrayList.add(5);


        System.out.println("original arrayList"+integerArrayList);

        ArrayList<Integer>uniqueList= removeDuplicate(integerArrayList);

        System.out.println("ArrayList after removeing duplicate"+uniqueList);
    }
    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer>list){
        HashSet <Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }
}
