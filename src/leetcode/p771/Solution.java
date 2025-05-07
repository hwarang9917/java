package leetcode.p771;

class Solution {
    public int numJewelsInStones(String jewels, String stones) {

        // jewels = "aA"
        // stones = "aAAbbbb"

        int count = 0;

        for (int j = 0; j < stones.length(); j++) {
            char stone = stones.charAt(j);
            for (int i = 0; i < jewels.length(); i++) {
                if (jewels.charAt(i) == stone) {
                    count++;
                }
            }
        }

        return count;
    }
}