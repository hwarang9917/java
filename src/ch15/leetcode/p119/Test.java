package ch15.leetcode.p119;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // 테스트할 행 번호
        int rowIndex = 3;
        List<Integer> result = solution.getRow(rowIndex);

        // 결과 출력
        System.out.println("rowIndex " + rowIndex + " → " + result);
    }
}
