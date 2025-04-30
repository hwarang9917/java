package ch03.exercise;

public class Exercise07 {
    public static void main(String[] args) {
        double x = 5.0;
        double y = 0.0;

        // y가 0.0이므로, 5 % 0.0 은 NaN이 됨
        double z = x % y;

        // z가 NaN인지 확인 (0으로 나눴을 때 발생)
        if (Double.isNaN(z)) {
            System.out.println("0.0으로 나눌 수 없습니다.");
        } else {
            double result = z + 10;
            System.out.println("결과 = " + result);
        }
    }
}
