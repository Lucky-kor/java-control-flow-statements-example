package loop;

/**
 * 반복문 없이 반복 작업을 작성할 때 생기는 중복을 확인하는 예제입니다.
 */
public class ForLoopV1 {

    public static void main(String[] args) {
        /*
         * 1부터 10까지 더하는 코드를 한 줄씩 직접 작성했습니다.
         * 결과는 맞지만 범위가 100이나 1,000으로 바뀌면 코드를 계속 추가해야 합니다.
         * 다음 예제에서는 이 중복을 for 문으로 제거합니다.
         */
        int sum = 0;

        sum += 1;
        sum += 2;
        sum += 3;
        sum += 4;
        sum += 5;
        sum += 6;
        sum += 7;
        sum += 8;
        sum += 9;
        sum += 10;

        System.out.println("1부터 10까지의 합: " + sum);
    }
}
