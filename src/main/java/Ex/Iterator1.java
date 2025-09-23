package Ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterator1 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("cherry");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);

            if (fruit.equals("Banana")) {
                iterator.remove();
            }
        }
        System.out.println("After removal: " + list);
        }
    }

