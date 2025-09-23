package Ietrateforloop;

import java.util.List;
import java.util.ArrayList;

public class Iterrateforeloop1 {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("fruit");
        list.add("secod");
        list.add("third");

        for(int i = 0; i < list.size(); i++){
            Object element = list.get(i);
        }
    }
}
