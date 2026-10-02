package breakContinueExample;

/**
 * 라벨이 있는 break로 중첩 반복문을 한 번에 종료하는 예제입니다.
 */
public class BreakExampleV5 {

    public static void main(String[] args) {
        /*
         * outerLoop은 바깥쪽 for 문에 붙인 라벨입니다.
         * break outerLoop은 가장 가까운 반복문만이 아니라 라벨이 붙은 문장 전체를 종료합니다.
         */
        outerLoop:
        for (int dan = 1; dan <= 9; dan++) {
            System.out.println(dan + "단을 시작합니다.");

            for (int multiplier = 1; multiplier <= 9; multiplier++) {
                System.out.println(dan + " * " + multiplier + " = " + (dan * multiplier));

                if (dan == 4 && multiplier == 6) {
                    System.out.println("4 * 6에서 전체 반복을 중단합니다.");
                    break outerLoop;
                }
            }

            System.out.println(dan + "단을 종료합니다.");
        }

        // 라벨 break도 메서드 전체가 아닌 라벨이 붙은 반복문만 종료합니다.
        System.out.println("구구단을 종료합니다.");
    }
}
