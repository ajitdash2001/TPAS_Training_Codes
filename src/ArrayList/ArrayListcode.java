package ArrayList;

import java.util.ArrayList;

public class ArrayListcode {

    public static  void main(String[]args){
        ArrayList<String> stringArrayList = new ArrayList<>();

        stringArrayList.add("apple");
        stringArrayList.add("Banana");
        stringArrayList.add("Chery");
        stringArrayList.add("date");
        stringArrayList.add("Elderberry");

        System.out.println("Element in the array list are");

        for(String element : stringArrayList){
            System.out.println(element);
        }

    }
}
