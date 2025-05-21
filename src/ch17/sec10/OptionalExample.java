package ch17.sec10;

import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = List.of();

        OptionalDouble v1 = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        if (v1.isPresent()) {
            System.out.println("v1.getAsDouble() = " + v1.getAsDouble());
        } else {
            System.out.println(0.0);
        }

        double v2 = list.stream()
                .mapToInt(Integer::intValue)
                .average() // 최종연산
                .orElse(0.0);

        System.out.println("v2 = " + v2);

        list.stream()
                .mapToInt(Integer::intValue)
                .average() // 최종연산
                .ifPresent(System.out::println);
    }
}