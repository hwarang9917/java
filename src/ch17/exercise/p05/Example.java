package ch17.exercise.p05;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("This is a java book",
                "Lambda Expressions",
                "Java8 supports lambda expressions"
        );
//      ‘java’라는 단어가 포함된 문자열만
//      필터링해서 출력
        list.stream()
                .filter(a -> a.toLowerCase().contains("java"))
                .forEach(System.out::println);
    }
}

