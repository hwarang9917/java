package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] arr = {"100", "1oo", null, "200"};

        try {
            int v = Integer.parseInt(arr[0]);
            System.out.println("v = " + v);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("데이터 문제 있음");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 잘못");
        }

        try {
            int v = Integer.parseInt(arr[1]);
            System.out.println("v = " + v);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("데이터 문제 있음");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 잘못");
        }

        try {
            int v = Integer.parseInt(arr[2]);
            System.out.println("v = " + v);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("데이터 문제 있음");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 잘못");
        }

        try {
            int v = Integer.parseInt(arr[3]);
            System.out.println("v = " + v);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("데이터 문제 있음");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 잘못");
        }

        try {
            int v = Integer.parseInt(arr[4]);
            System.out.println("v = " + v);
        } catch (NumberFormatException | NullPointerException e) {
//            e.printStackTrace();
            System.out.println("데이터 문제 있음");
        } catch (ArrayIndexOutOfBoundsException e) {
//            e.printStackTrace();
            System.out.println("인덱스 잘못");
        }
    }
}