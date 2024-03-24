package org.ckanth.java.com.interview;

import java.util.Arrays;
import java.util.stream.IntStream;

// Use two threads, one thread printing even numbers, the other printing odd numbers only
public class EvenAndOddNumberPrintingUsingThreads {

    Runnable evenThread;
    Runnable oddThread;

    public void print() {
        int[] a = IntStream.range(1, 10).toArray();
        evenThread = () -> Arrays.stream(a).asLongStream().forEach(
                i -> {
                    if (i%2 == 0) {
                        System.out.println("Even Number "+ i);
                    }
                }
        );
        evenThread.run();
        oddThread = () -> Arrays.stream(a).asLongStream().forEach(
                i -> {
                    if (i%2 != 0) {
                        System.out.println("Odd Number "+ i);
                    }
                }
        );
        oddThread.run();
    }

    public static void main(String[] args) {
        new EvenAndOddNumberPrintingUsingThreads().print();
    }
}
