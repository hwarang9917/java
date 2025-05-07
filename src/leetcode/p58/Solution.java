package leetcode.p58;

class Solution {
    public int lengthOfLastWord(String s) {
        // strip해서 양끝의 공백 지우고
        // 공백 기준으로 split 한 배열의
        // 마지막 요소(문자열)의 길이를 리턴
        String t = s.strip();
        String[] u = t.split(" ");
        int a = u[u.length - 1].length();
        return a;
    }
}