package ch17.sec12.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student("hong", "m", 92),
                new Student("kim", "f", 87),
                new Student("java", "m", 95),
                new Student("oh", "f", 93)
        );

        // 남자들만 리스트에 담기
        // 고전적 for
        List<Student> mList = new ArrayList<>();
        for (Student s : list) {
            if (s.getSex().equals("m")) {
                mList.add(s);
            }
        }
        for (Student s : mList) {
            System.out.println(s);
        }

        System.out.println();
        // Stream 사용
        List<Student> mList2 = list.stream()
                .filter(s -> s.getSex().equals("m"))
                .toList();
        mList2.forEach(System.out::println);

        System.out.println();
        // (학생 이름, 학생 점수)을 갖는 Map
        // 고전적 for
        Map<String, Integer> map1 = new HashMap<>();

        for (Student s : list) {
            map1.put(s.getName(), s.getScore());
        }

        for (Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        System.out.println();
        // Stream 사용
        Map<String, Integer> map2 = list.stream()
                .collect(Collectors.toMap(Student::getName, Student::getScore));

        map2.entrySet()
                .stream()
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }
}