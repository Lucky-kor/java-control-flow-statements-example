package conditionalStatements;

/**
 * 여러 개의 독립적인 if 문으로 나이 구간을 판별하는 예제입니다.
 */
public class IfStatementsV3 {

    public static void main(String[] args) {
        int age = 40;

        /*
         * 아래 if 문은 서로 연결되어 있지 않으므로 위에서부터 모두 검사합니다.
         * 한 구간만 출력하려면 각 조건에 최솟값과 최댓값을 모두 정확히 적어야 합니다.
         */
        if (age < 1 || age > 150) {
            System.out.println("유효한 나이를 입력해 주세요.");
        }

        if (age >= 65 && age <= 150) {
            System.out.println("고령자입니다.");
        }

        if (age >= 20 && age < 65) {
            System.out.println("성인입니다.");
        }

        if (age >= 10 && age < 20) {
            System.out.println("청소년입니다.");
        }

        if (age >= 1 && age < 10) {
            System.out.println("어린이입니다.");
        }
    }
}
