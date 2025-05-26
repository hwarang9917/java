package ch14.sec05.exam01;

public class SleepExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}