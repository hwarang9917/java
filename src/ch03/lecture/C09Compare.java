package ch03.lecture;

public class C09Compare {
    public static void main(String[] args) {
//        비교연산자
//        >, <, >=, <=, ==, !=
//        연산결과 boolean

//        > (크다, greater than, gt)
        int a = 10;
        int b = 30;
        System.out.println("(a > b) = " + (a > b)); // false

//        < (작다, less than, lt)
        System.out.println(" (a < b) = " +  (a < b)); // true

//        >= (크거나 같다, greater than equal, gte, ge)
        System.out.println("(a >= b) = " +(a >= b));

//        <= (작거나 같다, less than equal, lte, le)
        System.out.println("(a <= b) = " +(a <= b));

//        == (같다, equals, eq)
        System.out.println("(a == b) = " + (a == b));

//        != (같지 않다, not equals, ne, neq)
        System.out.println("(a != b) = " + (a != b));
    }
}
