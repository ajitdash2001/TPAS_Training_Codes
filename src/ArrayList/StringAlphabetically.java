package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class StringAlphabetically {
    public static void main(String[] args) {

    ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("ball");
        stringList.add("cat");
        stringList.add("mango");
        stringList.add("dog");
        stringList.add("orange");

        System.out.println("string after sort"+stringList );

        Collections.sort(stringList);
        System.out.println("String after sort are"+stringList);

}
}
