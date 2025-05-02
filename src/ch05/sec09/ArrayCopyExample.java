package ch05.sec09; // 패키지 선언(해당 클래스가 속한 패키지 이름)

/**
 * 배열 복사를 보여주는 예제
 */
public class ArrayCopyExample {
    public static void main(String[] args) {
        // 복사할 원본 배열 선언 및 생성
        String[] oldStrArray = {"java", "array", "copy"}; // 길이가 3인 문자열 배열 생성 및 초기화

        // 복사될 새로운 배열 선언 및 생성 (길이 5)
        String[] newStrArray = new String[5]; // 길이가 5인 새로운 문자열 배열 생성(초기값은 모두 null)

        // 배열 복사 : System.arraycopy(원본, 시작 인덱스, 대상, 대상 시작 인덱스, 복사할 요소 수)
        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
        // oldStrArray의 0번 인덱스에서 시작해 전체(oldStrArray.length = 3) 요소를
        // newStrArray의 0번 인덱스부터 복사한다
        // => 결과적으로 0~2번까지 "java", "array", "copy"가 들어가고, 3~4번(총 5칸)은 null로 남음

        // 복사 결과 확인 : 배열 전체 출력
        for (int i = 0; i < newStrArray.length; i++) {
            System.out.print(newStrArray[i] + ", "); // 각 요소 출력(값이 없으면 null 출력)
        }
        // 출력 결과: java, array, copy, null, null,
    }
}