package org.ckanth.java.com.corejava;

public class PrimeNumberOrNot {

    public void findPrimeNumber(int a) {
        int tmp = 0;
        boolean isPrime = true;
        for(int i=2; i<a/2 ; i++) {
            System.out.println(i +" - "+a/2+" - "+(a%i));
            tmp = a % i;
            if (tmp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(a+" is prime number");
        } else {
            System.out.println(a+" is not prime number");
        }
    }
    public static void main(String[] args) {
        new PrimeNumberOrNot().findPrimeNumber(15);
    }
}
