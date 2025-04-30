package ch04.lecture;

public class C06Switch {
    public static void main(String[] args) {
//        switch : 특정 변수의 값이 같은 부분부터 실행

        int v = 40;
        switch (v) {

            case 10:
                System.out.println("코드1");
                break; // 코드블럭 효과
            case 20:
                System.out.println("코드2");
                break;
            case 30:
                System.out.println("코드3");
                break;
            default:
//                일치하는 case가 없을 때
                System.out.println("코드4");
//                break; 생략가능
        }


    }
}
