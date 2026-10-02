package breakContinueExample;

/**
 * 중첩 for 문의 실행 구조를 전체 구구단으로 확인하는 예제입니다.
 */
public class BreakExampleV2 {

    public static void main(String[] args) {
        /*
         * 바깥쪽 for 문은 1단부터 9단까지 순회합니다.
         * 바깥쪽 반복 한 번마다 안쪽 for 문이 1부터 9까지 모두 실행되므로
         * 곱셈 결과는 총 9 * 9 = 81개가 출력됩니다.
         */
        for (int dan = 1; dan <= 9; dan++) {
            System.out.println(dan + "단을 시작합니다.");

            for (int multiplier = 1; multiplier <= 9; multiplier++) {
                System.out.println(dan + " * " + multiplier + " = " + (dan * multiplier));
            }

            System.out.println(dan + "단을 종료합니다.");
        }

        System.out.println("구구단을 종료합니다.");
    }
}
