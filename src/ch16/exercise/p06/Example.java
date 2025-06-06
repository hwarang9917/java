package ch16.exercise.p06;

public class Example {
    public static double calc(Function func) {
        double x = 10;
        double y = 4;
        return func.apply(x, y);
    }
    public static void main(String[] args) {
        double result = calc( (x, y) -> (x / y) );
        System.out.println("result: " + result);
    }
}