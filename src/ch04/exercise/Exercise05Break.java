package ch04.exercise;

public class Exercise05Break {
    public static void main(String[] args) {

        boolean gotcha = false;

        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if ((4 * x + 5 * y) == 60) {
                    System.out.println("(" + x + ", " + y + ")");
                    gotcha = true;
                    break;
                }
            }
        if (gotcha) {
            break;
        }
        }
    }
}
