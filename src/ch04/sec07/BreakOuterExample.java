package ch04.sec07;

public class BreakOuterExample {
    public static void main(String[] args) {
        outer:
        for (char upper = 'A'; upper <= 'Z'; upper++) {
            for (char lower = 'a'; lower <= 'z'; lower++) {
                System.out.println(upper + "-" + lower);
                if (lower == 'g') {
                    break outer;
                }
            }
        }
    }
}