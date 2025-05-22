package ch17.exercise.p06;

import java.lang.management.MemoryManagerMXBean;
import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
                new Member("홍길동", 30),
                new Member("신용권", 40),
                new Member("감자바", 26)
        );

//        고전적 for문
        double sum = 0;
        for (Member member : list) {
            sum += member.getAge();
        }
        double avg = sum / list.size();
        System.out.println("avg = " + avg);

//        참조타입 Stream
        Integer sum2 = list.stream()
                .map(Member::getAge)
                .reduce(0, Integer::sum);
        Double avg2 = sum2.doubleValue() / list.size();
        System.out.println("avg2 = " + avg2);

//        기본타입 Stream
        double avg3 = list.stream()
                .mapToInt(Member::getAge)
                .average()
                .getAsDouble();

        System.out.println("평균 나이: " + avg3);
    }
}
