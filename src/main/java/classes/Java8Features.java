package classes;

import classes.corejava.IterateArrayList;
import classes.java7.FutureExample;
import classes.java8.*;
import classes.sample.EvenAndOddNumberPrintingUsingThreads;
import classes.sample.Printing1to100;
import classes.java7.PrintEvenOrOddUsingThread;
import classes.functionalinterfaces.Functions;

import java.util.concurrent.ExecutionException;

public class Java8Features {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("StreamOfNullable");
        new StreamOfNullable().streamOfNullable();
        System.out.println("StreamIterate");
        new StreamIterate().streamIterate();
        System.out.println("CollectorsCollectingAndThen");
        new CollectorsCollectingAndThen().collectingAndThen();
        System.out.println("StreamTakeWhileAndDropWhile");
        new StreamTakeWhileAndDropWhile().takeWhileAndDropWhile();
        System.out.println("CollectorsTeeing");
        new CollectorsTeeing().teeing();
        System.out.println("StreamConcat");
        new StreamConcat().concat();
        System.out.println("CollectorsPartitioningBy");
        new CollectorsPartitioningBy().partitioningBy();
        System.out.println("IntStreamRangeAndRangeClosed");
        new IntStreamRangeAndRangeClosed().rangeAndRangeClosed();
        System.out.println("IterateArrayList Class Invoked from Java8Features");
        IterateArrayList.main(args);
        System.out.println("IterateArrayList Class Executed Successfully");
        String paytmPayment = new Paytm().doPayment("Germany", "India");
        System.out.println(paytmPayment);
        String amazonPayment = new AmazonPay().doPayment("India", "Germany");
        System.out.println(amazonPayment);
        new MapOperations().userStreamMapOperations();
        new MapOperations().userStreamFlatMapOperations();
        new CountRepeatedChars().countRepeatedCharacters("sreekanth");
        new MapOperations().findHighestSalary();
        System.out.println("Functions Class Invoked from Java8Features");
        Functions.main(args);
        System.out.println("FutureExample Class Invoked from Java8Features");
        FutureExample.main(args);
        System.out.println("PrintEvenOrOddUsingThread Class Invoked from Java8Features");
        PrintEvenOrOddUsingThread.main(args);
        System.out.println("Printing1to100 Class Invoked from Java8Features");
        Printing1to100.main(args);
        System.out.println("EvenAndOddNumberPrintingUsingThreads Class Invoked from Java8Features");
        EvenAndOddNumberPrintingUsingThreads.main(args);

    }
}
