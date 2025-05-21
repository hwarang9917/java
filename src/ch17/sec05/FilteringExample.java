package ch17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = List.of("홍길동", "신용권", "감자바", "신용권", "신민철");

//        List<String> list = new ArrayList<>();
//        list.add("홍길동");
//        list.add("김길동");
//        list.add("신길동");
//        list.add("신길동");
//        list.add("최길동");

        list.stream()
                .distinct()
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
        System.out.println();

        list.stream()
                .distinct()
                .filter(n -> n.startsWith("신"))
                .forEach(n -> System.out.println(n));
    }
}
