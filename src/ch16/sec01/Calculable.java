package ch16.sec01;

@FunctionalInterface
public interface Calculable {
    // @formatter:off
    int max = 0;
    static void method() {}
    private static void method3() {}
    default void method1() {}
    private void method2() {}
    // @formatter:on

    void calculate(int x, int y);
}