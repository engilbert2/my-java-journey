package Iteratorb;

import java.util.ArrayList;
import java.util.List;

public class Iterator3 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();

        list.add("Ben10");
        list.add("Ben11");
        list.add("Ben12");

        for (String element : list ){
            System.out.println(element);
        }
    }
}
