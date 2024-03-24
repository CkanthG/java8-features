package org.ckanth.java.com.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

// Implement a program that prints the numbers 1 .. 100 in ascending order
public class Printing1to100 {

    public static void print() {
        int[] a = IntStream.range(1, 100).toArray();
        Arrays.stream(a).asLongStream().forEach(System.out::println);
    }
    public static void main(String[] args) {
        print();
    }

}
