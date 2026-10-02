package breakContinueExample;

/**
 * 중첩 반복문에서 바깥쪽 for 문에 사용한 break의 동작을 확인하는 예제입니다.
 */
public class BreakExampleV3 {

    public static void main(String[] args) {
        for (int dan = 1; dan <= 9; dan++) {
            System.out.println(dan + "단을 시작합니다.");

            // 안쪽 반복문에는 break가 없으므로 현재 단의 1부터 9까지를 모두 출력합니다.
            for (int multiplier = 1; multiplier <= 9; multiplier++) {
                System.out.println(dan + " * " + multiplier + " = " + (dan * multiplier));
            }

            System.out.println(dan + "단을 종료합니다.");

            /*
             * 이 break는 바깥쪽 for 문의 본문에 있으므로 바깥쪽 반복을 종료합니다.
             * 3단은 끝까지 출력되지만 다음 반복인 4단은 시작되지 않습니다.
             */
            if (dan == 3) {
                System.out.println("3단까지 출력했으므로 반복을 중단합니다.");
                break;
            }
        }

        System.out.println("구구단을 종료합니다.");
    }
}
