package ch15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("java");
        set.add("JDBC");
        set.add("JSP");
        set.add("Java"); // 중복 객체이므로 저장하지 않음
        set.add("Spring");

        int size = set.size();
        System.out.println("총 객체 수 = " + size);
    }
}
