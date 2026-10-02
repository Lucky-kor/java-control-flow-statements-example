package breakContinueExample;

/**
 * 하나의 for 문에서 break가 반복문을 즉시 종료하는 모습을 확인하는 예제입니다.
 */
public class BreakExampleV1 {

    public static void main(String[] args) {
        int stopCount = 6;

        /*
         * 원래 반복 범위는 1부터 10까지이지만 count가 stopCount에 도달하면
         * break가 가장 가까운 for 문을 즉시 종료합니다.
         * 출력문이 break 검사보다 앞에 있으므로 6은 출력되고 7부터는 출력되지 않습니다.
         */
        for (int count = 1; count <= 10; count++) {
            System.out.println("현재 반복 횟수: " + count);

            if (count == stopCount) {
                System.out.println(stopCount + "회에서 반복문을 종료합니다.");
                break;
            }
        }

        // break는 반복문만 종료하므로 반복문 다음 문장은 정상적으로 실행됩니다.
        System.out.println("프로그램이 종료됩니다.");
    }
}
