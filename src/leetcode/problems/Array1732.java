package leetcode.problems;

public class Array1732 {
    public static void main(String[] args) {

        int[] gain = {-5, 1, 5, 0, -7};

        int high = 0;
        int net = 0;

        for (int i = 0; i < gain.length; i++) {
                net += gain[i];
                high = Math.max(high, net);

        }

        System.out.println(high);
    }
}
