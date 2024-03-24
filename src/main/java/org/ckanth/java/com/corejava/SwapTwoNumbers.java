package org.ckanth.java.com.corejava;

public class SwapTwoNumbers {

    public void swapTwoNumbers(int a, int b) {
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("a : "+a+" b : "+b);
    }

    public static void main(String[] args) {
        new SwapTwoNumbers().swapTwoNumbers(1, 3);
    }
}
