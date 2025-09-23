package MyCollectionUtil;

import java.util.*;
import java.util.Collection;

public class MYcollectionutil1 {

    public static void doSomething(Collection collection) {

        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object object = iterator.next();

        }


        Set set = new HashSet();
        List list = new ArrayList();

        MYcollectionutil1.doSomething(set);
        MYcollectionutil1.doSomething(list);


        String anElement = "an element";
        Collection<String> collection = new HashSet();

        boolean didCollectionChange = collection.add(anElement);
    }
        }


