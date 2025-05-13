package ch08.lecture.p04api;

import ch08.sec12.InstanceofExample;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        Object
//        Closeable
//        AutoCloseable
//        Iterator

//        instanceof

        System.out.println(s instanceof Object);
        System.out.println(s instanceof Closeable);
        System.out.println(s instanceof AutoCloseable);
        System.out.println(s instanceof Iterator);

    }
}
