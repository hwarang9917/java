package ch11.sec03.exam02;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo"};

        try {
            int v = Integer.parseInt(arr[0]);
            System.out.println("v = " + v);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 초과");
        } catch (Exception e) {
            System.out.println("여러 예외 발생");
        }

        try {
            int v = Integer.parseInt(arr[1]);
            System.out.println("v = " + v);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 초과");
        } catch (Exception e) {
            System.out.println("여러 예외 발생");
        }

        try {
            int v = Integer.parseInt(arr[2]);
            System.out.println("v = " + v);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 초과");
        } catch (Exception e) {
            System.out.println("여러 예외 발생");
        }
    }
}