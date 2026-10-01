package loop;

/**
 * 일반 for 문과 향상된 for 문으로 배열의 모든 요소를 순회하는 예제입니다.
 */
public class ForLoopV4 {

    public static void main(String[] args) {
        // 배열은 같은 타입의 값을 여러 개 순서대로 저장하는 자료구조입니다.
        String[] languages = {"Java", "Python", "JavaScript"};

        System.out.println("=== 일반 for 문: 인덱스와 값 사용 ===");
        for (int index = 0; index < languages.length; index++) {
            System.out.println(index + "번 요소: " + languages[index]);
        }

        System.out.println("=== 향상된 for 문: 값만 사용 ===");

        /*
         * 배열에서 값을 하나씩 꺼내 language 변수에 대입합니다.
         * 인덱스가 필요 없고 모든 요소를 처음부터 끝까지 읽을 때 간결합니다.
         */
        for (String language : languages) {
            System.out.println(language);
        }
    }
}
