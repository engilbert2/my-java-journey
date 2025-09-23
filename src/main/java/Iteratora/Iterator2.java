package Iteratora;

import java.util.List;
import java.util.ArrayList;

public class Iterator2 {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("first");
        list.add("second");
        list.add("third");

        for(Object element : list) {
            System.out.println(element);
        }
    }
}
