package loop;

/**
 * while 문에서 break와 continue로 반복 흐름을 제어하는 예제입니다.
 */
public class WhileLoopV2 {

    public static void main(String[] args) {
        int count = 0;
        int target = 10;

        /*
         * 조건식 true는 스스로 끝나지 않는 반복을 만듭니다.
         * count가 target에 도달하면 break가 while 문을 즉시 종료합니다.
         */
        while (true) {
            count++;

            if (count == target) {
                System.out.println("목표 숫자 " + target + "에 도달했습니다.");
                break;
            }

            /*
             * continue는 현재 반복의 남은 코드를 건너뛰고 다음 조건 검사로 이동합니다.
             * 따라서 아래 출력문에는 홀수만 도달합니다.
             */
            if (count % 2 == 0) {
                continue;
            }

            System.out.println("현재 홀수: " + count);
        }
    }
}
