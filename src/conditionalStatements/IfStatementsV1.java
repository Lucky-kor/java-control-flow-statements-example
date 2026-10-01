package conditionalStatements;

/**
 * if 문이 조건식의 결과에 따라 코드 블록을 선택적으로 실행하는 모습을 확인하는 예제입니다.
 */
public class IfStatementsV1 {

    public static void main(String[] args) {
        boolean isLoggedIn = true;

        /*
         * if 뒤의 괄호에는 결과가 true 또는 false인 조건식이 들어갑니다.
         * isLoggedIn은 true이므로 아래 중괄호 안의 코드가 실행됩니다.
         */
        if (isLoggedIn) {
            System.out.println("로그인한 사용자입니다.");
        }

        boolean hasCoupon = false;

        /*
         * 조건식이 false이면 코드 블록 전체를 건너뜁니다.
         * 따라서 아래 문장은 현재 실행되지 않습니다.
         */
        if (hasCoupon) {
            System.out.println("쿠폰을 사용할 수 있습니다.");
        }

        // if 문 실행 여부와 관계없이 다음 문장부터 프로그램은 계속 진행됩니다.
        System.out.println("프로그램을 종료합니다.");
    }
}
