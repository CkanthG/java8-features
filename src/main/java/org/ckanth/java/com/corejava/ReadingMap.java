package org.ckanth.java.com.corejava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReadingMap {

    public void readMapUsingWhile() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "abcd");
        map.put(2, "efgh");
        map.put(3, "ijkl");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey() +" - "+ next.getValue());
        }
    }
    public void readMapUsingAdvancedForLoop() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "abcd");
        map.put(2, "efgh");
        map.put(3, "ijkl");
        for (Map.Entry map1 : map.entrySet()) {
            System.out.println(map1.getKey() +"-"+map1.getValue());
        }
    }
    public static void main(String[] args) {
        new ReadingMap().readMapUsingWhile();
        new ReadingMap().readMapUsingAdvancedForLoop();
    }
}
