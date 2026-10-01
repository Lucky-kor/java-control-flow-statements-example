package loop;

import java.util.Scanner;

/**
 * do-while 문으로 정답을 맞힐 때까지 입력을 반복하는 숫자 맞히기 예제입니다.
 */
public class DoWhileLoopV2 {

    public static void main(String[] args) {
        // Math.random()은 0.0 이상 1.0 미만의 값을 만들므로 결과 범위는 1부터 10입니다.
        int answer = (int) (Math.random() * 10) + 1;
        int input;

        try (Scanner scanner = new Scanner(System.in)) {
            /*
             * 사용자에게 최소 한 번은 숫자를 물어봐야 하므로 do-while 문이 잘 어울립니다.
             * 정답과 입력이 다르면 조건식이 true가 되어 다시 반복합니다.
             */
            do {
                System.out.print("1부터 10 사이의 정수를 입력하세요: ");

                // 정수가 아닌 입력을 제거한 후 다시 입력받습니다.
                while (!scanner.hasNextInt()) {
                    String invalidInput = scanner.next();
                    System.out.println(invalidInput + "은(는) 정수가 아닙니다.");
                    System.out.print("정수를 다시 입력하세요: ");
                }

                input = scanner.nextInt();

                if (input < 1 || input > 10) {
                    System.out.println("입력 범위를 벗어났습니다.");
                } else if (input > answer) {
                    System.out.println("더 작은 정수를 입력하세요.");
                } else if (input < answer) {
                    System.out.println("더 큰 정수를 입력하세요.");
                }
            } while (input != answer);

            System.out.println(answer + " 정답입니다!");
        }
    }
}
