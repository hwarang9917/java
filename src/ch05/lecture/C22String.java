package ch05.lecture;

public class C22String {
    public static void main(String[] args) {
//        9번째 기본타입 String
//        new 생략 가능
        String a = "java";
        String f = "java";
        System.out.println(a == f); // true

        String g = "ja";
        String h = "va";
        String i = g + h;

        System.out.println(a == i); // false

        String b = new String("java");
        String c = new String("react");

        System.out.println(b == c);

        String d = new String("java");
        String e = new String("java");

        System.out.println(d == e);

//        결론 : 문자열의 내용이 같은지 확인할 때
//        == 쓰지 말 것!!! -> equals() 메소드 사용
        System.out.println(d == e);
    }
}
