package ch15.leetcode.p1200;

import java.util.*;

public class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            list.add(n);
        }
//            1. input 정렬
        Collections.sort(list);
//            2. 전체 탐색 -> 인접한 두 값의 차가 가장 적은 차이를 구해서 저장
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i - 1);
            minDiff = Math.min(minDiff, diff);
        }
//            3. 전체 탐색 -> (2)에서 구한 값과 같으면
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i < list.size(); i++) {
            int diff = list.get(i) - list.get(i - 1);
            if (diff == minDiff) {
//            두 값을 원소로 갖는 List를 만들어서
//            결과 list에 추가하기
                result.add(Arrays.asList(list.get(i - 1), list.get(i)));
            }
        }
        return result;
    }
}
