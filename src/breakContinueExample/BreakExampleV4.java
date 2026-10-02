package breakContinueExample;

/**
 * 상태 변수와 break를 조합하여 중첩 반복문 전체를 종료하는 예제입니다.
 */
public class BreakExampleV4 {

    public static void main(String[] args) {
        // 안쪽 반복문에서 종료 조건을 발견했는지 바깥쪽 반복문에 전달합니다.
        boolean shouldStop = false;

        for (int dan = 1; dan <= 9; dan++) {
            System.out.println(dan + "단을 시작합니다.");

            for (int multiplier = 1; multiplier <= 9; multiplier++) {
                System.out.println(dan + " * " + multiplier + " = " + (dan * multiplier));

                /*
                 * 라벨이 없는 break는 자신을 감싸는 가장 가까운 반복문 하나만 종료합니다.
                 * 따라서 여기서는 안쪽 for 문만 끝나며, 바깥쪽 for 문은 별도로 종료해야 합니다.
                 */
                if (dan == 4 && multiplier == 6) {
                    shouldStop = true;
                    break;
                }
            }

            if (shouldStop) {
                System.out.println(dan + "단을 중간에 종료합니다.");
                break;
            }

            System.out.println(dan + "단을 종료합니다.");
        }

        System.out.println("구구단을 종료합니다.");
    }
}
