package Arrraylist2;


import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("first");
        list.add("second");
        list.add("third");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
        }
    }
}
