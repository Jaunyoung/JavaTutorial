package oop3_3.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class MapExam2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕하세요");

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            String value = map.get(key);

            System.out.println(key + " : " + value);
        }
    }
}
