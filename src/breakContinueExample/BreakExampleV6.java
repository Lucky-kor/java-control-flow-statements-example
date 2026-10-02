package breakContinueExample;

/**
 * continue로 현재 반복의 남은 코드를 건너뛰는 모습을 확인하는 예제입니다.
 */
public class BreakExampleV6 {

    public static void main(String[] args) {
        for (int dan = 1; dan <= 9; dan++) {
            System.out.println(dan + "단을 시작합니다.");

            for (int multiplier = 1; multiplier <= 9; multiplier++) {
                /*
                 * 곱하는 수가 홀수이면 현재 회차의 출력문을 건너뜁니다.
                 * for 문의 증감식은 실행되므로 다음 multiplier 값으로 반복을 계속합니다.
                 */
                if (multiplier % 2 != 0) {
                    continue;
                }

                System.out.println(dan + " * " + multiplier + " = " + (dan * multiplier));
            }

            System.out.println(dan + "단을 종료합니다.");
        }

        System.out.println("구구단을 종료합니다.");
    }
}
