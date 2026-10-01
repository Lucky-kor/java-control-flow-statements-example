package loop;

/**
 * 같은 누적 계산을 for 문과 while 문으로 작성하여 구조를 비교하는 예제입니다.
 */
public class WhileLoopV1 {

    public static void main(String[] args) {
        int forSum = 0;

        // 반복 횟수가 1부터 20까지로 명확하므로 for 문이 자연스럽습니다.
        for (int number = 1; number <= 20; number++) {
            forSum += number;
        }

        int whileSum = 0;
        int number = 1; // 초기화식이 while 문 밖에 위치합니다.

        /*
         * while 문은 반복 전에 조건을 검사합니다.
         * 본문에서 number를 증가시키지 않으면 조건이 계속 true여서 무한 반복되므로
         * 상태가 어떻게 변하는지 반드시 확인해야 합니다.
         */
        while (number <= 20) {
            whileSum += number;
            number++;
        }

        System.out.println("for 문으로 계산한 합: " + forSum);
        System.out.println("while 문으로 계산한 합: " + whileSum);
        System.out.println("두 결과가 같은가? " + (forSum == whileSum));
    }
}
