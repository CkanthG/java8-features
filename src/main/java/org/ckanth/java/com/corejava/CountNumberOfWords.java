package org.ckanth.java.com.corejava;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWords {

    public Map<String, Integer> countWords(String str) {
        String[] strings = str.split(" ");
        Map<String, Integer> countMap = new HashMap<>();
        for (int i=0; i<strings.length; i++) {
            if (countMap.containsKey(strings[i])) {
                int count = countMap.get(strings[i]);
                countMap.put(strings[i], count + 1);
            } else {
                countMap.put(strings[i], 1);
            }
        }
        return countMap;
    }
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = new CountNumberOfWords().countWords("Hello World world is groung too fast is not?");
        System.out.println(stringIntegerMap);
    }
}
