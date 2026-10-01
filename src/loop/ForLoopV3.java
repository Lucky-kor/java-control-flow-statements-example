package loop;

/**
 * for 문의 증감식과 조건식을 바꾸어 다양한 반복을 만드는 예제입니다.
 */
public class ForLoopV3 {

    public static void main(String[] args) {
        int oddSumWithCondition = 0;

        // 방법 1: 1부터 150까지 모두 확인하고 홀수일 때만 더합니다.
        for (int number = 1; number <= 150; number++) {
            if (number % 2 != 0) {
                oddSumWithCondition += number;
            }
        }

        int oddSumWithStep = 0;

        // 방법 2: 1에서 시작하여 2씩 증가하면 홀수만 방문할 수 있습니다.
        for (int number = 1; number <= 150; number += 2) {
            oddSumWithStep += number;
        }

        System.out.println("조건문을 사용한 홀수의 합: " + oddSumWithCondition);
        System.out.println("2씩 증가시킨 홀수의 합: " + oddSumWithStep);
        System.out.println("두 결과가 같은가? " + (oddSumWithCondition == oddSumWithStep));

        // 증감식에는 감소 연산도 사용할 수 있습니다.
        System.out.println("=== 카운트다운 ===");
        for (int count = 5; count >= 1; count--) {
            System.out.println(count);
        }
        System.out.println("시작!");
    }
}
