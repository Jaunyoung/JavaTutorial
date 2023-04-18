package oop3_3.main;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;

public class ListExam03 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("kim");
        collection.add("lee");
        collection.add("hong");

        System.out.println(collection.size());

        Iterator<String> iter = collection.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            System.out.println(str);
        }
    }
}
