package ch04.exercise;

public class Exercise03For {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
            System.out.println("3의 배수의 총합: " + sum);
        }
    }
}
