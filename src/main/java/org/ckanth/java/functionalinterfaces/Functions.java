package org.ckanth.java.com.functionalinterfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Functions {

    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("Johnny", s -> s.length());
        Integer value1 = nameMap.computeIfAbsent("Johnny", String::length);
        System.out.println(value);
        System.out.println(value1);
        Function<Integer, String> intToString = Object::toString;
        System.out.println(intToString);
        Function<String, String> quote = s -> "'" + s + "'";
        System.out.println(quote);
        Function<Integer, String> quoteIntToString = quote.compose(intToString);
        if("'5'".equals(quoteIntToString.apply(5))) {
            System.out.println("Welcome");
        }
    }

}
