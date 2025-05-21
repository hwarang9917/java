package ch15.exercise.p09;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int max = 0;
        int total = 0;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // 가장 높은 점수 인지?
            if (max < entry.getValue()) {
                name = entry.getKey();
                max = entry.getValue();
            }

            // 점수의 합
            total += entry.getValue();
        }

        System.out.println("name = " + name);
        System.out.println("max = " + max);
        System.out.println("total = " + total);
        double avg = (double) total / map.size();
        System.out.println("avg = " + avg);

    }
}