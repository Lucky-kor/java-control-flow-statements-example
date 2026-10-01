package conditionalStatements;

/**
 * 향상된 switch 표현식으로 조건에 맞는 값을 반환하는 예제입니다.
 */
public class SwitchStatementV3 {

    public static void main(String[] args) {
        String position = "Senior";

        /*
         * switch 표현식은 선택한 값을 반환하므로 변수에 바로 대입할 수 있습니다.
         * 화살표(->) 오른쪽만 실행되므로 break가 필요 없고 fall-through도 없습니다.
         * 쉼표로 여러 case 값을 묶을 수도 있습니다.
         */
        int monthlySalary = switch (position) {
            case "Senior" -> 7_000_000;
            case "Junior", "Manager" -> 5_000_000;
            default -> 3_000_000;
        };

        // switch가 하나의 표현식이므로 끝에 세미콜론이 필요합니다.
        System.out.println(position + "의 월급은 " + monthlySalary + "원입니다.");
    }
}
