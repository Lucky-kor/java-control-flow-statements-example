package conditionalStatements;

/**
 * if-else 문으로 두 경로 중 정확히 한 경로를 선택하는 예제입니다.
 */
public class IfStatementsV2 {

    public static void main(String[] args) {
        int age = 18;
        boolean isAdult = age >= 20;

        /*
         * 조건식이 true이면 if 블록을 실행하고 else 블록은 건너뜁니다.
         * 조건식이 false이면 if 블록을 건너뛰고 else 블록을 실행합니다.
         * 두 블록이 동시에 실행되거나 둘 다 실행되지 않는 경우는 없습니다.
         */
        if (isAdult) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("성인이 아닙니다.");
        }

        System.out.println("나이: " + age + "세");
        System.out.println("프로그램을 종료합니다.");
    }
}
