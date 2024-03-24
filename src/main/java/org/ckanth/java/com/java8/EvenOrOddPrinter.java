package org.ckanth.java.com.java8;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOrOddPrinter {

    private static Object object = new Object();
    private static IntPredicate evenPredicate = t -> t%2==0;
    private static IntPredicate oddPredicate = t -> t%2!=0;

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(() -> EvenOrOddPrinter.print(oddPredicate));
        CompletableFuture.runAsync(() -> EvenOrOddPrinter.print(evenPredicate));
        Thread.sleep(1000);
    }

    public static void print(IntPredicate intPredicate) {
        IntStream.rangeClosed(1,10).filter(intPredicate).forEach(EvenOrOddPrinter::execute);
    }
    public static void execute(int number) {
        synchronized (object) {
            try {
                System.out.println(Thread.currentThread().getName()+" : "+number);
                object.notify();
                object.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
