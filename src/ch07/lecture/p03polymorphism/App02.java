package ch07.lecture.p03polymorphism;

public class App02 {
    public static void main(String[] args) {
        SuperClass02 a = new SuperClass02();  //  SuperClass02 타입의 객체 생성
        SubClass021 b = new SubClass021();    //  SubClass021은 SuperClass02의 자식 클래스
        SubClass022 c = new SubClass022();    //  SubClass022도 SuperClass02의 자식 클래스
        SubClass023 d = new SubClass023();    //  SubClass023은 SubClass021의 자식 클래스 (손자)
        SubClass024 e = new SubClass024();    //  SubClass024는 SubClass022의 자식 클래스 (손자)

        // 자동 형변환 (Upcasting)

        // b 관련 형변환
        SubClass021 f = b;                   //  같은 타입끼리 대입
        SuperClass02 g = f;                  //  SubClass021 → SuperClass02 (업캐스팅)

        // c 관련 형변환
        SubClass022 h = c;                   //  같은 타입끼리 대입
        SuperClass02 i = h;                  //  SubClass022 → SuperClass02 (업캐스팅)

        // d 관련 형변환
        SubClass023 j = d;                   //  같은 타입끼리 대입
        SubClass021 k = d;                   //  SubClass023 → SubClass021 (업캐스팅)
        SuperClass02 l = d;                  //  SubClass023 → SuperClass02 (업캐스팅)

        // e 관련 형변환
        SubClass024 m = e;                   //  같은 타입끼리 대입
        SubClass022 n = e;                   //  SubClass024 → SubClass022 (업캐스팅)
        SuperClass02 o = e;                  //  SubClass024 → SuperClass02 (업캐스팅)
    }
}

// 클래스 계층 구조 정의
class SuperClass02 {}                        //  최상위 슈퍼클래스
class SubClass021 extends SuperClass02 {}    //  SuperClass02의 자식 클래스
class SubClass022 extends SuperClass02 {}    //  SuperClass02의 자식 클래스
class SubClass023 extends SubClass021 {}     //  SubClass021의 자식 클래스
class SubClass024 extends SubClass022 {}     //  SubClass022의 자식 클래스
