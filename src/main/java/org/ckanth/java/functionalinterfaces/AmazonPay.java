package org.ckanth.java.com.functionalinterfaces;

import java.util.Random;

public class AmazonPay implements org.ckanth.java.com.functionalinterfaces.UPIPayment {
    @Override
    public String doPayment(String source, String dest) {
        String date = org.ckanth.java.com.functionalinterfaces.UPIPayment.datePatterns("yyyy-mm-dd");
        System.out.println("Date of transaction " + date);
        return "Successfully transaction done from "+source+" to "+dest+" on "+date;
    }

    @Override
    public double getScratchCard() {
        return new Random().nextDouble() + new Random().nextDouble();
    }
}
