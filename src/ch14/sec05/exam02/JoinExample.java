package ch14.sec05.exam02;

public class JoinExample {
    public static void main(String[] args) throws InterruptedException {
        SumThread thread = new SumThread();
        thread.start();

        thread.join();

        long sum = thread.getSum();
        System.out.println("sum = " + sum);
    }
}