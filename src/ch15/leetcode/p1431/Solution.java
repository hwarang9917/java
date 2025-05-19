package ch15.leetcode.p1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Integer> kids = Arrays.stream(candies).boxed().toList();

//        1. kids List에서 가장 큰 값 구하기

        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

//        2. List<Boolean> result 객체 만들기
        List<Boolean> result = new ArrayList<>();

//        3. kids의 각 요소에 extraCandy 더해서 (1에서 구한 가장 큰 값)보다 크거나 같으면
        for (int candy : candies) {
//        result에 true 추가
            if (candy + extraCandies >= max) {
                result.add(true);
            } else {
//        아니면 false 추가
                result.add(false);
            }
        }
//        result 리턴
        return result;
    }
}



