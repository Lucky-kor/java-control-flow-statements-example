package conditionalStatements;

/**
 * if-else if-else 문으로 여러 조건 중 한 경로만 선택하는 예제입니다.
 */
public class IfStatementsV4 {

    public static void main(String[] args) {
        int age = 40;

        /*
         * 연결된 조건문에서는 처음 true가 된 블록 하나만 실행됩니다.
         * 그러므로 잘못된 입력을 먼저 거르고, 나이 기준은 큰 값부터 검사합니다.
         * 앞선 조건이 false였다는 사실을 이용하므로 상한 조건을 반복할 필요가 없습니다.
         */
        if (age < 1 || age > 150) {
            System.out.println("유효한 나이를 입력해 주세요.");
        } else if (age >= 65) {
            System.out.println("고령자입니다.");
        } else if (age >= 20) {
            System.out.println("성인입니다.");
        } else if (age >= 10) {
            System.out.println("청소년입니다.");
        } else {
            System.out.println("어린이입니다.");
        }
    }
}
