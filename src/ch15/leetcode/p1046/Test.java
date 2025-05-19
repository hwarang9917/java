package ch15.leetcode.p1046;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] stones = {2, 7, 4, 1, 8, 1};  // int[] 배열
        int result = solution.lastStoneWeight(stones);

        System.out.println("마지막 남은 돌의 무게: " + result);
    }
}
