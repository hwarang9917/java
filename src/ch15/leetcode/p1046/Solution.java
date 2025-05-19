package ch15.leetcode.p1046;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for (int s : stones) {
            list.add(s);
        }

//        4. 1번부터 반복
        while (list.size() > 1) {
//        1. 오름차순 정렬 후 reverse로 내림차순 정렬
            list.sort(Collections.reverseOrder());
//        2. 마지막 index 요소와 마지막 index -1 요소를 꺼내고(지우고)
            int first = list.removeFirst();
            int second = list.removeFirst();
//        3. 차이를 구해서 list에 다시 넣고
            int difference = first - second;
            if (difference != 0) {
                list.add(difference);
            }
        }
//        5. 하나만 남을 때까지 반복해서, 하나 남은 값을 리턴
        return list.isEmpty() ? 0 : list.getFirst();
    }
}
