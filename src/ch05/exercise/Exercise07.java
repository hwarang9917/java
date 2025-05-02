package ch05.exercise;

import java.util.Arrays;

public class Exercise07 {
    public static void main(String[] args) {
//        주어진 배열 항목 최댓값 출력 코드 작성

//        sort 정렬 활용
//        알고리즘
//        1. sort로 정렬
//        2. length - 1 로 마지막 인덱스 출력
        int[] arr = {1, 5, 3, 8, 2};
        System.out.println("정렬 전 : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));

        int max1 = arr[arr.length - 1];
        System.out.println("정렬로 구한 최댓값: " + max1);

        System.out.println("----------------");
//        for문 활용
        int max2 = arr[0];
//        배열의 첫 번째 요소로 max2를 초기화합니다.
//        현재까지 찾은 최댓값을 저장할 변수입니다.

        for (int i = 0; i < arr.length; i++) {
            // 배열의 모든 요소를 처음부터 끝까지 순회합니다.

            if (arr[i] > max2) {
                // 현재 요소가 max2보다 크면,

                max2 = arr[i];
                // max2 값을 현재 요소로 갱신합니다.
            }
        }
        System.out.println("for문으로 구한 최댓값: " + max2);

        System.out.println("----------------");
//        enhanced for문 활용
        for (int num : arr) {
            // 배열의 각 요소를 num에 하나씩 꺼내서 순회합니다.

            if (num > max2) {
                // 현재 요소(num)가 max2보다 크면,

                max2 = num;
                // max2 값을 현재 요소(num)로 갱신합니다.
            }
        }

        System.out.println("향상된 for문으로 구한 최댓값: " + max2);
// 최종적으로 가장 큰 값을 출력합니다.


    }
}



