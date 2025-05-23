package ch11.lecture;

public class App20 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (AngryException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws AngryException {
        throw new AngryException("직접 메세지 작성");
    }
}

//  필요해서 직접 만든 Exception (checked exception)
class AngryException extends Exception {
    public AngryException() {
        super("기본 메시지");
    }

    public AngryException(String message) {
        super(message);
    }
}
