package classes.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ComparatorExample {

    public void comparatorUse() {
        List<String> list = Arrays.asList("90", "100", "-1", "20");
        list.sort((o1, o2) -> {
            Double d1 = Double.parseDouble(o1);
            Double d2 = Double.parseDouble(o2);
            return d1.compareTo(d2);
        });
        System.out.println(list);
    }

    public static void minMax() {
        List<Integer> list = Arrays.asList(1000,1,10,2,3,5,4,100,20,20);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        Optional<Integer> min = list.stream().min(Integer::compareTo);
        System.out.println("Min "+min.get()+" & Max "+max.get());
        boolean b = list.stream().allMatch((x) -> x % 2 == 0);
        System.out.println("Stream allMatch "+b);
        boolean status = list.stream().anyMatch((x) -> x % 2 == 0);
        System.out.println("Stream anyMatch "+status);
        long count = list.stream().count();
        System.out.println("list count "+count);
        Stream<Integer> distinct = list.stream().distinct();
        System.out.print("distinct stream ");
        distinct.forEach(x -> System.out.print(x +" "));
        System.out.println("");
        Optional<Integer> any = list.stream().findAny();
        System.out.println("Stream findAny "+any);
        Optional<Integer> first = list.stream().findFirst();
        System.out.println("Stream findFirst "+first);
        Stream<Integer> limit = list.stream().limit(4);
        System.out.println("Stream limit ");
        limit.forEach(System.out::println);
        Integer reduce = list.stream().reduce(0, Integer::sum);
        System.out.println("Stream reduce "+reduce);
        Stream<Integer> mapStream = list.stream().map(i -> i * 2);
        System.out.println("Stream map");
        mapStream.forEach(System.out::println);
        Stream<Integer> skip = list.stream().skip(5);
        System.out.println("Stream skip");
        skip.forEach(System.out::println);
        System.out.println("Stream sort");
        list.stream().sorted().forEach(System.out::println);

        list.sort(((o1, o2) -> o1.compareTo(o2)));
        System.out.println(list);
    }

    public static void method() {
        List<String> list = Arrays.asList("ram", "sita", "hanuma", "laxmana", "ravana", "dasharadha");
        List<String> collect = list.stream().filter(e -> e.length() > 5)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
        System.out.println(collect);
    }

    public static void main(String[] args) {
        minMax();
//        method();
    }
}
