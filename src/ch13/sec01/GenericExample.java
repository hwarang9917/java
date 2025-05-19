package ch13.sec01;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.content = "안녕";

        Box<Integer> box2 = new Box<>();
        box2.content = 100;
    }
}