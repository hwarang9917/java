package leetcode.p1480;

class Solution {
    public int[] runningSum(int[] nums) {
        int[] r = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            r[i] = sum;
        }
        return r;
    }
}