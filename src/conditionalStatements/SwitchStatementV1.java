package conditionalStatements;

/**
 * 전통적인 switch 문과 break의 역할을 확인하는 예제입니다.
 */
public class SwitchStatementV1 {

    public static void main(String[] args) {
        int dice = 3;

        /*
         * switch는 dice 값과 일치하는 case부터 실행합니다.
         * break는 switch 문을 즉시 빠져나가게 합니다. break가 없으면 다음 case의
         * 실행문까지 이어서 실행되는 fall-through가 발생하므로 주의해야 합니다.
         */
        switch (dice) {
            case 1:
                System.out.println("주사위 결과는 1입니다.");
                break;
            case 2:
                System.out.println("주사위 결과는 2입니다.");
                break;
            case 3:
                System.out.println("주사위 결과는 3입니다.");
                break;
            case 4:
                System.out.println("주사위 결과는 4입니다.");
                break;
            case 5:
                System.out.println("주사위 결과는 5입니다.");
                break;
            case 6:
                System.out.println("주사위 결과는 6입니다.");
                break;
            default:
                // 어떤 case와도 일치하지 않을 때 실행됩니다.
                System.out.println("주사위 값은 1부터 6까지만 가능합니다.");
        }
    }
}
