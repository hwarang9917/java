package leetcode.p1572;

class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;

        int red = 0;
        int blue = mat.length - 1;

        for (int i = 0; i < mat.length; i++) {
            sum += mat[i][red];
            sum += mat[i][blue];
            red++;
            blue--;
        }
        if (mat.length % 2 == 1) {
            int d = mat.length / 2;
            sum -= mat[d][d];
        }
        return sum;
    }
}