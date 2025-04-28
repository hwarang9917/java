package ch02.lecture;

public class C12VariableName {
    public static void main(String[] args) {
//        영문대소문자, $, _, 숫자
//        숫자로 시작 X
//        의미있는 이름
//        LowerCamelCase 사용
//        예약어(키워드) X

        int modelName; // ok (관습에 적합)
//        int class; // class가 예약어
//        int 6hour; // 숫자로 시작 X
        int $value; // ok (관습에 부적합)
        int _age; // ok (관습에 부적합)
//        int #name; // # 사용불가
//        int int; // int가 예약어
    }
}
