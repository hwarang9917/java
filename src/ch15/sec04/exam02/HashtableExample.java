package ch15.sec04.exam02;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashtableExample {
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new ConcurrentHashMap<>();
//        Map<String, Integer> map = new HashMap<>();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                map.put(String.valueOf(i), i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                map.put(String.valueOf(i), i);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("map.size() = " + map.size());
    }
}