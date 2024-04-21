package classes.java8;

import classes.models.Employee;
import classes.models.User;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapOperations {

    public void userStreamMapOperations() {
        List<User> users = Stream.of(
                new User("sreekanth", "9848962806", Arrays.asList("sreekanthgaddoju@gmail.com", "ssist@gmail.com")),
                new User("devansh", "9848962807", Arrays.asList("devanshgaddoju@gmail.com", "dev@gmail.com"))
        ).collect(Collectors.toList());
        List<String> phoneNumbersList = users.stream().map(User::getPhone).collect(Collectors.toList());
        System.out.println(phoneNumbersList);
    }

    public void userStreamFlatMapOperations() {
        List<User> users = Stream.of(
                new User("sreekanth", "9848962806", Arrays.asList("sreekanthgaddoju@gmail.com", "ssist@gmail.com")),
                new User("devansh", "9848962807", Arrays.asList("devanshgaddoju@gmail.com", "dev@gmail.com"))
        ).collect(Collectors.toList());
        List<String> emailList = users.stream().flatMap(user -> user.getEmail().stream()).collect(Collectors.toList());
        System.out.println(emailList);
    }

    public void findHighestSalary() {
        List<Employee> employeeList = Stream.of(
                new Employee(1, "Sowmya", "DEV", 500000),
                new Employee(2, "Devansh", "DEV", 200000),
                new Employee(3, "Sreekanth", "QA", 300000),
                new Employee(4, "Ckanth", "QA", 100000),
                new Employee(5, "Anil", "DEVOPS", 400000)
        ).collect(Collectors.toList());

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
