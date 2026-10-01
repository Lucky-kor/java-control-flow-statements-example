package loop;

/**
 * for 문의 초기화식, 조건식, 증감식이 실행되는 순서를 확인하는 예제입니다.
 */
public class ForLoopV2 {

    public static void main(String[] args) {
        int sum = 0;

        /*
         * 실행 순서
         * 1. 초기화식 int i = 1을 반복 시작 전에 한 번 실행합니다.
         * 2. 조건식 i <= 10이 true인지 검사합니다.
         * 3. 본문 sum += i를 실행합니다.
         * 4. 증감식 i++을 실행한 뒤 2번으로 돌아갑니다.
         * 조건식이 false가 되면 반복을 끝냅니다.
         */
        for (int i = 1; i <= 10; i++) {
            int previousSum = sum;
            sum += i;

            // 각 반복에서 누적값이 어떻게 바뀌는지 확인합니다.
            System.out.println(previousSum + " + " + i + " = " + sum);
        }

        // i는 for 문의 초기화식에서 선언했으므로 반복문 밖에서는 사용할 수 없습니다.
        System.out.println("최종 합계: " + sum);
    }
}
