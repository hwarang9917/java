package ch13.exercise.p02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> c1 = new Container<>();
        c1.set("gildong");
        String s = c1.get();
        System.out.println("s = " + s);

        Container<Integer> c2 = new Container<>();
        c2.set(6);
        Integer i = c2.get();
        System.out.println("i = " + i);
    }
}