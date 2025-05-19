package ch15.leetcode.p1200;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {4, 2, 1, 3};
        List<List<Integer>> result = sol.minimumAbsDifference(arr);
        System.out.println(result);  // [[1, 2], [2, 3], [3, 4]]
    }
}
