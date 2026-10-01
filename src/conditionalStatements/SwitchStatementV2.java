package conditionalStatements;

/**
 * 여러 case를 같은 실행문으로 묶는 전통적인 switch 문 예제입니다.
 */
public class SwitchStatementV2 {

    public static void main(String[] args) {
        String position = "Senior";
        int monthlySalary;

        /*
         * Junior case에는 실행문과 break가 없습니다. 따라서 Manager case로 이어져
         * 두 직급에 같은 월급을 대입합니다. 의도적으로 fall-through를 사용한 경우입니다.
         * 모든 경로에서 monthlySalary에 값을 대입하므로 초기값 없이 선언할 수 있습니다.
         */
        switch (position) {
            case "Senior":
                monthlySalary = 7_000_000;
                break;
            case "Junior":
            case "Manager":
                monthlySalary = 5_000_000;
                break;
            default:
                monthlySalary = 3_000_000;
        }

        System.out.println(position + "의 월급은 " + monthlySalary + "원입니다.");
    }
}
