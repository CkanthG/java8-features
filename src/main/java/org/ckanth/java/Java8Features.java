package org.ckanth.java;

import org.ckanth.java.com.corejava.IterateArrayList;
import org.ckanth.java.com.java7.FutureExample;
import org.ckanth.java.com.java7.PrintEvenOrOddUsingThread;
import org.ckanth.java.com.java8.AmazonPay;
import org.ckanth.java.com.java8.Paytm;
import org.ckanth.java.com.models.Employee;
import org.ckanth.java.com.models.User;

import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.Comparator;
import java.util.Optional;
import java.util.concurrent.ExecutionException;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Features {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("IterateArrayList Class Invoked from Java8Features");
        IterateArrayList.main(args);
        System.out.println("IterateArrayList Class Executed Successfully");
        String paytmPayment = new Paytm().doPayment("Germany", "India");
        System.out.println(paytmPayment);
        String amazonPayment = new AmazonPay().doPayment("India", "Germany");
        System.out.println(amazonPayment);
        new Java8Features().userStreamMapOperations();
        new Java8Features().userStreamFlatMapOperations();
        new Java8Features().countRepeatedCharacters("sreekanth");
        new Java8Features().findHighestSalary();
        org.ckanth.java.functionalinterfaces.Functions.main(args);
        FutureExample.main(args);
        PrintEvenOrOddUsingThread.main(args);
    }
    public void userStreamMapOperations() {
        List<User> users = Stream.of(
                new User("sreekanth", "9848962806", Arrays.asList("sreekanthgaddoju@gmail.com", "ssist@gmail.com")),
                new User("devansh", "9848962807", Arrays.asList("devanshgaddoju@gmail.com", "dev@gmail.com"))
        ).toList();
        List<String> phoneNumbersList = users.stream().map(User::getPhone).collect(Collectors.toList());
        System.out.println(phoneNumbersList);
    }
    public void userStreamFlatMapOperations() {
        List<User> users = Stream.of(
                new User("sreekanth", "9848962806", Arrays.asList("sreekanthgaddoju@gmail.com", "ssist@gmail.com")),
                new User("devansh", "9848962807", Arrays.asList("devanshgaddoju@gmail.com", "dev@gmail.com"))
        ).toList();
        List<String> emailList = users.stream().flatMap(user -> user.getEmail().stream()).collect(Collectors.toList());
        System.out.println(emailList);
    }
    public void countRepeatedCharacters(String str) {
        String[] strings = str.split("");
        Map<String, Long> stringLongMap = Arrays.stream(strings).collect(
                Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()
                )
        );
        System.out.println(stringLongMap);
    }
    public void findHighestSalary() {
        List<Employee> employeeList = Stream.of(
          new Employee(1, "Sowmya", "DEV", 500000),
                new Employee(2, "Devansh", "DEV", 200000),
                new Employee(3, "Sreekanth", "QA", 300000),
                new Employee(4, "Ckanth", "QA", 100000),
                new Employee(5, "Bishwas", "DEVOPS", 400000)
        ).toList();

        Comparator<Employee> salaryComp = Comparator.comparing(Employee::getSalary);
        Map<String, Optional<Employee>> salaryMap = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDept, Collectors.reducing(BinaryOperator.maxBy(salaryComp)))
        );
        System.out.println(salaryMap);
        Map<String, Employee> employeeMap = employeeList.stream().collect(
                Collectors.toMap(Employee::getDept, Function.identity(), BinaryOperator.maxBy(Comparator.comparingInt(Employee::getSalary)))
        );
        System.out.println(employeeMap);
    }
}
