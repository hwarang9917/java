package ch11.lecture;

public class App07 {
    public static void main(String[] args) {

        try {
            int[] arr = {5, 0};
            // ArithmeticException
            // IndexOutOfBoundsException
            int c = arr[0] / arr[1];
            System.out.println("c = " + c);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("예외 처리 코드");
        }
    }
}