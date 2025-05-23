package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

        try {
            int value = Integer.parseInt(array[0]);
            System.out.println("value = " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 잘못");
        } catch (NumberFormatException e) {
            System.out.println("숫자 변환 안됨");
        }

        try {
            int value = Integer.parseInt(array[1]);
            System.out.println("value = " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 잘못");
        } catch (NumberFormatException e) {
            System.out.println("숫자 변환 안됨");
        }

        try {
            int value = Integer.parseInt(array[2]);
            System.out.println("value = " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 잘못");
        } catch (NumberFormatException e) {
            System.out.println("숫자 변환 안됨");
        }
    }
}