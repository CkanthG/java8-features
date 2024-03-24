package org.ckanth.java.com.corejava;

public class AmstrongNumber {
    public static void main(String[] args) {
        for (int i=0;i<10000;i++) {
            new AmstrongNumber().findAmstrongNumber(i);
        }
    }
    public void findAmstrongNumber(int number) {
        int originalNo = number;
        int countOfCharacters = String.valueOf(number).length();
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum = (int) (sum + Math.pow(digit, countOfCharacters));
            number = number / 10;
        }
        if (sum == originalNo) {
            System.out.println(originalNo+ " is amstrong");
        }
    }
}
