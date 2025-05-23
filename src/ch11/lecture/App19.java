package ch11.lecture;

public class App19 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (SleepyException e) {
            e.printStackTrace();
        }
    }

    public static void method1() {
        throw new SleepyException("과로로 인해 졸리다");
    }
}

//    직접 필요한 Exception 만들어 사용할 수 있음
class SleepyException extends RuntimeException {
    SleepyException() {
        super("졸리다");
    }

    SleepyException(String message) {
        super(message);
    }
}
