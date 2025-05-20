package leetcode.p287;

public class Test {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 2, 2};
        int[] nums2 = {3, 1, 3, 4, 2};

        Solution solution = new Solution();

        System.out.println(solution.findDuplicate(nums1)); // 출력: 2
        System.out.println(solution.findDuplicate(nums2)); // 출력: 3
    }
}
