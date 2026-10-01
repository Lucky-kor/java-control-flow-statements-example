package loop;

/**
 * while 문과 do-while 문의 조건 검사 시점을 비교하는 예제입니다.
 */
public class DoWhileLoopV1 {

    public static void main(String[] args) {
        boolean shouldRepeat = false;

        /*
         * while 문은 본문보다 조건식을 먼저 검사합니다.
         * shouldRepeat가 처음부터 false이므로 본문은 한 번도 실행되지 않습니다.
         */
        int whileCount = 0;
        while (shouldRepeat) {
            whileCount++;
        }

        /*
         * do-while 문은 본문을 먼저 실행하고 마지막에 조건식을 검사합니다.
         * 같은 false 조건이어도 본문이 반드시 한 번은 실행됩니다.
         * while 뒤에 세미콜론(;)이 있다는 점에도 주의합니다.
         */
        int doWhileCount = 0;
        do {
            doWhileCount++;
        } while (shouldRepeat);

        System.out.println("while 문 실행 횟수: " + whileCount);
        System.out.println("do-while 문 실행 횟수: " + doWhileCount);
    }
}
