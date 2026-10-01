# 자바 제어문 학습 가이드

이 프로젝트는 자바의 조건문과 반복문을 작은 예제로 나누어 순서대로 학습하기 위한 프로젝트입니다.
각 코드를 바로 실행하기보다 **어떤 문장이 실행되고 반복이 몇 번 일어날지 먼저 예상한 후**, 실제 결과와 비교하며 학습하세요.

## 학습 목표

이 프로젝트를 모두 학습하면 다음 내용을 설명할 수 있어야 합니다.

- `if`의 조건식에 어떤 값이 들어가야 하는지 설명할 수 있다.
- `if-else`와 여러 개의 독립적인 `if` 문의 차이를 설명할 수 있다.
- `if-else if-else`에서 조건의 순서가 결과에 미치는 영향을 설명할 수 있다.
- 전통적인 `switch` 문에서 `case`, `break`, `default`의 역할을 설명할 수 있다.
- 의도적인 fall-through와 실수로 발생한 fall-through를 구분할 수 있다.
- 전통적인 `switch` 문과 향상된 `switch` 표현식의 차이를 설명할 수 있다.
- `for` 문의 초기화식, 조건식, 본문, 증감식이 실행되는 순서를 설명할 수 있다.
- 일반 `for` 문과 향상된 `for` 문을 상황에 맞게 선택할 수 있다.
- `while`과 `do-while`의 조건 검사 시점을 구분할 수 있다.
- 반복문의 무한 반복 가능성을 발견하고 종료 조건을 확인할 수 있다.
- `break`와 `continue`가 반복 흐름을 어떻게 바꾸는지 설명할 수 있다.
- 조건문과 반복문을 조합하여 간단한 프로그램을 작성할 수 있다.

## 권장 학습 순서

| 순서 | 예제 | 핵심 주제 |
| --- | --- | --- |
| 1 | `IfStatementsV1` | `if`와 참·거짓 조건 |
| 2 | `IfStatementsV2` | `if-else`로 두 경로 중 하나 선택 |
| 3 | `IfStatementsV3` | 여러 개의 독립적인 `if` 문 |
| 4 | `IfStatementsV4` | `if-else if-else`와 조건 순서 |
| 5 | `SwitchStatementV1` | 전통적인 `switch`, `case`, `break`, `default` |
| 6 | `SwitchStatementV2` | 여러 `case` 묶기와 fall-through |
| 7 | `SwitchStatementV3` | 향상된 `switch` 표현식과 화살표 문법 |
| 8 | `ForLoopV1` | 반복문이 필요한 이유 |
| 9 | `ForLoopV2` | `for` 문의 구조와 실행 순서 |
| 10 | `ForLoopV3` | 다양한 증감 방식과 조건문 조합 |
| 11 | `ForLoopV4` | 일반 `for` 문과 향상된 `for` 문 |
| 12 | `WhileLoopV1` | `for`와 `while` 비교 |
| 13 | `WhileLoopV2` | 무한 반복, `break`, `continue` |
| 14 | `DoWhileLoopV1` | `while`과 `do-while` 비교 |
| 15 | `DoWhileLoopV2` | 입력과 조건문·반복문을 조합한 프로그램 |

먼저 조건에 따라 실행 경로를 선택하는 법을 익힌 뒤, 같은 작업을 반복하는 방법을 학습합니다. 마지막에는 조건문과 반복문을 함께 사용하여 숫자 맞히기 프로그램을 완성합니다.

## 예제 실행 방법

### IntelliJ IDEA에서 실행

1. `src` 폴더에서 학습할 Java 파일을 엽니다.
2. `main` 메서드 왼쪽의 실행 아이콘을 누릅니다.
3. 실행 결과를 아래쪽 **Run** 창에서 확인합니다.
4. `DoWhileLoopV2`는 Run 창에 직접 값을 입력하며 실행합니다.

### 터미널에서 실행

프로젝트 최상위 폴더에서 다음 명령으로 모든 예제를 컴파일할 수 있습니다.

```bash
mkdir -p out/classes
javac -encoding UTF-8 -d out/classes src/conditionalStatements/*.java src/loop/*.java
```

패키지 이름과 클래스 이름을 함께 사용하여 원하는 예제를 실행합니다.

```bash
java -cp out/classes conditionalStatements.IfStatementsV1
java -cp out/classes loop.ForLoopV2
java -cp out/classes loop.DoWhileLoopV2
```

`SwitchStatementV3`의 향상된 `switch` 표현식을 컴파일하려면 Java 14 이상이 필요합니다. 안정적인 학습 환경으로는 JDK 17 이상을 권장합니다.

## 1. if 문으로 실행 여부 결정하기

학습 파일: [`src/conditionalStatements/IfStatementsV1.java`](src/conditionalStatements/IfStatementsV1.java)

### 먼저 확인할 내용

`if` 문은 조건식의 결과가 `true`일 때만 중괄호 안의 코드를 실행합니다.

```java
if (조건식) {
    // 조건식이 true일 때만 실행
}
```

조건식에는 반드시 `boolean` 결과가 필요합니다. 자바에서는 다른 언어와 달리 숫자 `0`이나 `1`을 조건식 대신 사용할 수 없습니다.

```java
boolean isLoggedIn = true;

if (isLoggedIn) {
    System.out.println("로그인한 사용자입니다.");
}
```

예제에서 `isLoggedIn`은 `true`이므로 첫 번째 출력문은 실행됩니다. `hasCoupon`은 `false`이므로 두 번째 `if` 블록은 건너뜁니다. 조건문 뒤에 있는 프로그램 종료 문장은 조건과 관계없이 실행됩니다.

### 직접 해보기

- `isLoggedIn`을 `false`로 변경하고 출력 결과를 예상합니다.
- `hasCoupon`을 `true`로 변경하여 두 `if` 블록이 모두 실행될 수 있는지 확인합니다.
- `if (isLoggedIn == true)`로 변경한 뒤 `if (isLoggedIn)`과 결과가 같은지 확인합니다.
- `if (1)`을 작성해 보고 자바가 왜 컴파일을 허용하지 않는지 오류 메시지를 읽어 봅니다. 확인 후 원래 코드로 되돌립니다.

## 2. if-else로 두 경로 중 하나 선택하기

학습 파일: [`src/conditionalStatements/IfStatementsV2.java`](src/conditionalStatements/IfStatementsV2.java)

`if-else`는 두 코드 블록 중 정확히 하나를 실행합니다.

```java
if (isAdult) {
    System.out.println("성인입니다.");
} else {
    System.out.println("성인이 아닙니다.");
}
```

- 조건이 `true`: `if` 블록 실행, `else` 블록 생략
- 조건이 `false`: `if` 블록 생략, `else` 블록 실행

예제의 `age`는 `18`이고, `age >= 20`의 결과는 `false`입니다. 따라서 `else` 블록이 실행됩니다.

### 직접 해보기

- `age`를 `19`, `20`, `21`로 바꾸어 경계값 전후의 결과를 비교합니다.
- `boolean isAdult` 변수 없이 `if (age >= 20)`으로 직접 작성해 봅니다.
- `else`를 제거하고 두 번째 블록을 독립적인 `if (!isAdult)`로 바꾸었을 때 차이가 있는지 생각합니다.

## 3. 독립적인 if 문과 연결된 조건문 비교하기

학습 파일:

- [`src/conditionalStatements/IfStatementsV3.java`](src/conditionalStatements/IfStatementsV3.java)
- [`src/conditionalStatements/IfStatementsV4.java`](src/conditionalStatements/IfStatementsV4.java)

### 여러 개의 독립적인 if 문

`IfStatementsV3`의 각 `if` 문은 서로 독립적입니다. 앞 조건이 `true`였는지와 관계없이 모든 조건을 검사합니다.

```java
if (조건A) {
    // 조건A가 true이면 실행
}

if (조건B) {
    // 조건A의 결과와 관계없이 조건B 검사
}
```

여러 결과가 동시에 나와도 되는 검사에는 독립적인 `if` 문이 적합합니다. 예를 들어 사용자가 성인이면서 회원이고 쿠폰도 가지고 있는지 각각 확인하는 경우입니다.

나이처럼 하나의 구간만 선택해야 한다면 조건이 겹치지 않도록 최솟값과 최댓값을 모두 적어야 합니다. 예제에서는 `age >= 20 && age < 65`처럼 범위를 명시합니다.

### if-else if-else 문

`IfStatementsV4`에서는 조건들이 하나의 사슬로 연결됩니다. 위에서부터 검사하다가 처음 `true`가 된 블록 하나를 실행한 뒤 전체 조건문을 빠져나갑니다.

```java
if (age < 1 || age > 150) {
    // 잘못된 값
} else if (age >= 65) {
    // 65 이상
} else if (age >= 20) {
    // 앞 조건이 false이므로 자동으로 65 미만
} else {
    // 앞의 모든 조건이 false
}
```

### 조건 순서가 중요한 이유

나이 기준을 다음과 같이 작은 값부터 검사하면 모든 성인도 먼저 `age >= 10`에 걸립니다.

```java
// 잘못된 순서의 예
if (age >= 10) {
    System.out.println("청소년입니다.");
} else if (age >= 20) {
    System.out.println("성인입니다.");
}
```

서로 포함되는 범위를 검사할 때는 보통 더 제한적인 조건이나 더 큰 경계값부터 배치합니다. 입력값 검증처럼 다른 분류보다 먼저 처리해야 하는 조건도 맨 위에 둡니다.

### 직접 해보기

- 두 예제에서 `age`를 `-1`, `1`, `9`, `10`, `19`, `20`, `64`, `65`, `150`, `151`로 바꾸어 봅니다.
- `IfStatementsV3`에서 각 조건의 상한을 제거하면 어떤 나이에 여러 문장이 출력되는지 확인합니다.
- `IfStatementsV4`에서 `age >= 10`을 `age >= 20`보다 위로 옮긴 뒤 잘못된 결과가 생기는 이유를 설명합니다.
- 한 사람에게 여러 혜택을 독립적으로 적용해야 한다면 V3와 V4 중 어느 구조가 알맞은지 생각합니다.

## 4. 전통적인 switch 문과 break

학습 파일: [`src/conditionalStatements/SwitchStatementV1.java`](src/conditionalStatements/SwitchStatementV1.java)

`switch` 문은 하나의 값을 여러 후보와 비교할 때 사용합니다.

```java
switch (dice) {
    case 1:
        System.out.println("주사위 결과는 1입니다.");
        break;
    case 2:
        System.out.println("주사위 결과는 2입니다.");
        break;
    default:
        System.out.println("올바르지 않은 값입니다.");
}
```

### 각 키워드의 역할

- `switch`: 괄호 안의 값을 각 `case` 값과 비교합니다.
- `case`: 일치할 수 있는 후보 값을 나타냅니다.
- `break`: 현재 `switch` 문을 즉시 종료합니다.
- `default`: 어떤 `case`와도 일치하지 않을 때 실행됩니다.

전통적인 `switch` 문은 일치하는 `case`로 이동한 뒤 `break`를 만날 때까지 계속 실행합니다. 따라서 `break`를 실수로 빼면 다음 `case`의 코드까지 실행되는 **fall-through**가 발생합니다.

### 직접 해보기

- `dice`를 `1`부터 `7`까지 변경하며 `default`가 언제 실행되는지 확인합니다.
- `case 3`의 `break`를 잠시 제거하고 어떤 문장이 추가로 출력되는지 관찰합니다.
- 같은 로직을 `if-else if-else`로 작성해 보고 어떤 쪽이 읽기 쉬운지 비교합니다.

## 5. case 묶기와 향상된 switch 표현식

학습 파일:

- [`src/conditionalStatements/SwitchStatementV2.java`](src/conditionalStatements/SwitchStatementV2.java)
- [`src/conditionalStatements/SwitchStatementV3.java`](src/conditionalStatements/SwitchStatementV3.java)

### 의도적으로 fall-through 사용하기

`SwitchStatementV2`에서는 `Junior`와 `Manager`에 같은 값을 대입합니다.

```java
case "Junior":
case "Manager":
    monthlySalary = 5_000_000;
    break;
```

`Junior`와 일치하면 실행문이 없는 다음 `Manager` 위치로 이어지고 공통 코드를 실행합니다. 이처럼 여러 `case`가 같은 동작을 공유하도록 의도적으로 fall-through를 사용할 수 있습니다.

### 값을 반환하는 switch 표현식

`SwitchStatementV3`은 향상된 문법을 사용합니다.

```java
int monthlySalary = switch (position) {
    case "Senior" -> 7_000_000;
    case "Junior", "Manager" -> 5_000_000;
    default -> 3_000_000;
};
```

주요 차이는 다음과 같습니다.

| 전통적인 switch 문 | 향상된 switch 표현식 |
| --- | --- |
| 콜론(`:`) 형태의 `case` 사용 | 화살표(`->`) 형태 사용 |
| 보통 변수에 값을 직접 대입 | 선택한 값을 반환하여 변수에 대입 가능 |
| `break` 누락 시 fall-through 가능 | 화살표 규칙에는 fall-through가 없음 |
| 여러 `case`를 연달아 작성 | 쉼표로 여러 값을 묶을 수 있음 |

`switch` 표현식 전체가 값을 만들기 때문에 닫는 중괄호 뒤에 세미콜론이 필요합니다. 모든 입력에 대해 결과가 있어야 하므로 이 예제에서는 `default`도 반드시 필요합니다.

### 직접 해보기

- 두 예제의 `position`을 `Junior`, `Manager`, `Intern`으로 변경합니다.
- V2에서 `Junior` 아래에 실수로 다른 실행문을 넣으면 두 직급이 같은 동작을 공유한다는 의도가 어떻게 흐려지는지 확인합니다.
- V3의 `default`를 제거하고 컴파일 오류를 읽어 봅니다. 확인 후 다시 복구합니다.
- 월급과 함께 직급 설명 두 줄을 반환해야 한다면 화살표 오른쪽에 중괄호와 `yield`를 사용하는 방법을 찾아봅니다.

## 6. 반복문이 필요한 이유와 for 문의 구조

학습 파일:

- [`src/loop/ForLoopV1.java`](src/loop/ForLoopV1.java)
- [`src/loop/ForLoopV2.java`](src/loop/ForLoopV2.java)

### 반복 코드를 직접 작성했을 때

`ForLoopV1`은 1부터 10까지의 합을 한 줄씩 계산합니다. 결과는 올바르지만 범위가 달라질 때마다 코드를 추가하거나 삭제해야 합니다. 같은 형태의 문장이 반복되는 것은 반복문을 적용할 수 있다는 신호입니다.

### for 문의 네 부분

```java
for (int i = 1; i <= 10; i++) {
    sum += i;
}
```

| 부분 | 예제 | 역할 |
| --- | --- | --- |
| 초기화식 | `int i = 1` | 반복 시작 전에 한 번만 실행 |
| 조건식 | `i <= 10` | 각 반복 전에 검사하며 `false`이면 종료 |
| 본문 | `sum += i` | 조건식이 `true`일 때 실행 |
| 증감식 | `i++` | 본문 실행 후마다 실행 |

전체 실행 순서는 다음과 같습니다.

```text
초기화식 → 조건식 → 본문 → 증감식
                ↑             ↓
                └─────────────┘
```

초기화식은 한 번만 실행하고, `조건식 → 본문 → 증감식`은 조건이 `false`가 될 때까지 반복합니다. 조건식이 처음부터 `false`라면 본문은 한 번도 실행되지 않습니다.

V2는 각 반복에서 이전 합계, 현재 숫자, 새로운 합계를 출력합니다. 출력 결과를 따라가며 `sum`과 `i`가 각각 언제 변하는지 확인하세요.

### 변수의 범위

초기화식에서 선언한 `i`는 `for` 문 안에서만 사용할 수 있습니다.

```java
for (int i = 1; i <= 10; i++) {
    System.out.println(i); // 사용 가능
}

// System.out.println(i); // 컴파일 오류
```

### 직접 해보기

- V1과 V2가 같은 최종 결과 `55`를 출력하는지 확인합니다.
- V2의 시작값을 `0`, 종료 조건을 `i < 10`으로 바꾸고 무엇이 달라지는지 확인합니다.
- 조건식을 `i < 10`으로만 바꾸어 `10`이 합계에서 빠지는 이유를 설명합니다.
- 증감식을 `i += 2`로 바꾸고 방문하는 숫자를 관찰합니다.
- `i++`을 제거하면 왜 반복이 끝나지 않는지 실행 전에 설명합니다. 실제로 시험할 때는 즉시 실행을 중지할 준비를 하세요.

## 7. 증감 방식 바꾸기와 조건문 조합하기

학습 파일: [`src/loop/ForLoopV3.java`](src/loop/ForLoopV3.java)

이 예제는 1부터 150까지의 홀수 합을 두 방법으로 계산합니다.

### 모든 숫자를 방문하여 홀수만 선택

```java
for (int number = 1; number <= 150; number++) {
    if (number % 2 != 0) {
        oddSumWithCondition += number;
    }
}
```

`number % 2`는 2로 나눈 나머지입니다. 나머지가 0이 아니면 홀수입니다. 이 방법은 모든 숫자를 방문하므로 조건이 복잡하거나 실행 중에 선택 기준이 달라질 때 이해하기 쉽습니다.

### 홀수만 방문

```java
for (int number = 1; number <= 150; number += 2) {
    oddSumWithStep += number;
}
```

1에서 시작해 2씩 증가하면 `1, 3, 5, ...`처럼 홀수만 방문합니다. 반복 변수의 규칙이 명확할 때 불필요한 검사를 줄일 수 있습니다.

마지막 카운트다운은 초기값이 큰 수이고 `count--`로 값이 작아지는 반복도 가능하다는 것을 보여 줍니다. 감소하는 반복에서는 종료 조건의 비교 방향을 특히 주의해야 합니다.

### 직접 해보기

- 두 합계가 항상 같은지 출력된 `true`로 확인합니다.
- 시작값을 `2`로 바꾸어 2씩 증가시키면 짝수의 합이 되는 이유를 설명합니다.
- 범위를 `1`부터 `10`까지로 줄이고 방문하는 모든 숫자를 종이에 적어 봅니다.
- 카운트다운 조건을 실수로 `count <= 1`로 바꾸면 본문이 몇 번 실행되는지 예상합니다.

## 8. 일반 for 문과 향상된 for 문

학습 파일: [`src/loop/ForLoopV4.java`](src/loop/ForLoopV4.java)

### 일반 for 문

일반 `for` 문은 배열의 위치인 인덱스가 필요할 때 사용합니다.

```java
for (int index = 0; index < languages.length; index++) {
    System.out.println(index + "번 요소: " + languages[index]);
}
```

배열 인덱스는 `0`부터 시작하고 마지막 인덱스는 `length - 1`입니다. 따라서 조건식은 보통 `index < array.length` 형태입니다. `<=`를 사용하면 존재하지 않는 위치에 접근하여 `ArrayIndexOutOfBoundsException`이 발생합니다.

### 향상된 for 문

```java
for (String language : languages) {
    System.out.println(language);
}
```

`languages`에서 값을 하나씩 꺼내 `language` 변수에 대입합니다. 모든 요소를 처음부터 끝까지 읽고 인덱스가 필요 없을 때 간결합니다.

| 필요한 작업 | 알맞은 방식 |
| --- | --- |
| 모든 요소를 순서대로 읽기 | 향상된 `for` 문 |
| 현재 요소의 인덱스 사용 | 일반 `for` 문 |
| 뒤에서 앞으로 순회 | 일반 `for` 문 |
| 두 칸씩 건너뛰어 순회 | 일반 `for` 문 |

### 직접 해보기

- `languages` 배열에 다른 언어를 추가하고 두 반복문의 출력을 비교합니다.
- 일반 `for` 문의 조건을 `index <= languages.length`로 바꾸어 예외가 언제 발생하는지 확인한 후 복구합니다.
- 배열을 마지막 요소부터 첫 요소까지 출력하는 반복문을 작성합니다.
- 인덱스가 전혀 필요 없는 출력에 일반 `for` 문과 향상된 `for` 문 중 어느 쪽이 더 읽기 쉬운지 비교합니다.

## 9. for 문과 while 문 비교하기

학습 파일: [`src/loop/WhileLoopV1.java`](src/loop/WhileLoopV1.java)

`for`와 `while`은 서로 바꾸어 작성할 수 있는 경우가 많습니다.

```java
// for 문
for (int number = 1; number <= 20; number++) {
    forSum += number;
}

// while 문
int number = 1;
while (number <= 20) {
    whileSum += number;
    number++;
}
```

두 반복문 모두 조건식을 본문보다 먼저 검사하므로 조건이 처음부터 `false`이면 한 번도 실행되지 않습니다.

보통 다음 기준으로 선택하면 코드를 읽기 쉽습니다.

- `for`: 시작값, 종료 조건, 증감 방식처럼 반복 횟수가 명확할 때
- `while`: 정답을 맞힐 때까지, 파일 끝에 도달할 때까지처럼 조건을 만족하는 동안 반복할 때

`while`에서는 초기화와 상태 변경이 서로 떨어져 있습니다. 예제의 `number++`을 빠뜨리면 `number <= 20`이 계속 `true`가 되어 무한 반복됩니다.

### 직접 해보기

- 두 반복문이 같은 합계 `210`을 만드는지 확인합니다.
- 두 반복문의 종료값을 모두 `100`으로 변경하여 결과를 비교합니다.
- `while` 문의 `number++` 위치를 본문 첫 줄로 옮기면 합계가 왜 달라지는지 설명합니다.
- 반복 횟수를 코드만 보고 빠르게 파악하기에는 어느 문법이 더 알맞은지 생각합니다.

## 10. break와 continue로 반복 흐름 제어하기

학습 파일: [`src/loop/WhileLoopV2.java`](src/loop/WhileLoopV2.java)

이 예제의 `while (true)`는 조건 자체로는 종료되지 않습니다. 반드시 본문 안에서 `break`에 도달할 수 있어야 합니다.

### break

`break`는 현재 반복문 전체를 즉시 종료합니다.

```java
if (count == target) {
    break;
}
```

`count`가 `target`인 `10`이 되면 더 이상 조건을 검사하거나 다음 반복을 실행하지 않습니다.

### continue

`continue`는 반복문 전체를 끝내지 않습니다. 현재 반복의 남은 코드만 건너뛰고 다음 반복으로 이동합니다.

```java
if (count % 2 == 0) {
    continue;
}

System.out.println(count); // 홀수일 때만 도달
```

| 키워드 | 현재 반복의 남은 코드 | 반복문 자체 |
| --- | --- | --- |
| `break` | 실행하지 않음 | 즉시 종료 |
| `continue` | 실행하지 않음 | 다음 반복 계속 |

이 예제에서는 `count++`이 `continue`보다 먼저 있습니다. 증가문이 `continue` 뒤에 있었다면 짝수에서 증가문을 계속 건너뛰어 무한 반복될 수 있습니다.

### 직접 해보기

- 출력되는 홀수를 실행 전에 모두 적어 봅니다.
- `target`을 `7`로 변경하면 목표 도달 메시지와 홀수 출력 순서가 어떻게 되는지 확인합니다.
- `break` 검사와 `continue` 검사의 순서를 바꾸면 `target`이 짝수일 때 어떤 문제가 생기는지 설명합니다.
- `continue` 조건을 `count % 3 == 0`으로 바꾸어 3의 배수만 건너뜁니다.

## 11. while 문과 do-while 문 비교하기

학습 파일: [`src/loop/DoWhileLoopV1.java`](src/loop/DoWhileLoopV1.java)

두 문법의 핵심 차이는 **처음 조건을 검사하는 시점**입니다.

```java
while (조건식) {
    // 조건을 먼저 검사
}

do {
    // 본문을 먼저 실행
} while (조건식);
```

| 반복문 | 첫 조건 검사 | 최소 실행 횟수 |
| --- | --- | --- |
| `while` | 본문 실행 전 | 0회 |
| `do-while` | 본문 실행 후 | 1회 |

예제에서는 두 반복문 모두 같은 `false` 조건을 사용합니다. `while` 본문은 0회, `do-while` 본문은 1회 실행됩니다.

`do-while`의 마지막 `while (조건식);`에는 세미콜론이 필요합니다. 일반 `while` 문의 중괄호 뒤에는 세미콜론을 붙이지 않는다는 차이도 확인하세요.

### 직접 해보기

- `shouldRepeat`를 `true`로 바꾸기 전에 현재 코드가 왜 무한 반복되는지 설명합니다.
- 카운터가 3보다 작을 동안 반복하도록 각 예제를 안전하게 수정합니다.
- 사용자 입력을 최소 한 번 받아야 하는 메뉴 프로그램에는 어느 반복문이 자연스러운지 생각합니다.

## 12. 제어문을 조합한 숫자 맞히기 프로그램

학습 파일: [`src/loop/DoWhileLoopV2.java`](src/loop/DoWhileLoopV2.java)

이 예제는 지금까지 배운 내용을 실제 흐름으로 조합합니다.

1. `Math.random()`으로 1부터 10 사이의 정답을 만듭니다.
2. `do-while`로 사용자에게 최소 한 번 입력을 요청합니다.
3. 내부 `while`로 정수가 아닌 입력을 제거합니다.
4. `if-else if`로 범위와 정답의 대소를 판별합니다.
5. 입력과 정답이 다르면 다시 반복합니다.
6. 정답을 맞히면 반복을 끝내고 결과를 출력합니다.

### 난수 범위 계산

```java
int answer = (int) (Math.random() * 10) + 1;
```

- `Math.random()`: `0.0` 이상 `1.0` 미만
- `* 10`: `0.0` 이상 `10.0` 미만
- `(int)`: 소수 부분을 버려 `0`부터 `9`
- `+ 1`: 최종적으로 `1`부터 `10`

### 입력 검증

`Scanner.nextInt()`에 문자를 바로 입력하면 `InputMismatchException`이 발생할 수 있습니다. 예제에서는 `hasNextInt()`로 다음 입력이 정수인지 먼저 확인하고, 잘못된 입력은 `next()`로 꺼내 버립니다.

범위를 벗어난 정수는 프로그램을 종료하지 않고 안내 메시지를 출력한 뒤 다음 반복에서 다시 입력받습니다.

### 직접 해보기

- 문자, `0`, `11`, 범위 안의 오답, 정답을 차례로 입력하며 각 분기를 확인합니다.
- 정답을 임시로 `7`로 고정하여 모든 분기를 예측 가능한 순서로 시험합니다.
- 시도 횟수를 저장하는 변수를 추가하고 정답 메시지에 함께 출력합니다.
- 정답 범위를 1부터 100까지로 확장하고 안내 문구도 함께 수정합니다.
- 정답을 맞히면 한 판 더 할지 물어보는 바깥쪽 반복문을 추가해 봅니다.

## 제어문 선택 가이드

| 상황 | 우선 고려할 문법 | 이유 |
| --- | --- | --- |
| 조건이 참일 때만 실행 | `if` | 선택적인 한 경로만 필요 |
| 두 경로 중 하나 선택 | `if-else` | 참·거짓을 모두 처리 |
| 범위 조건 중 하나 선택 | `if-else if-else` | 처음 일치한 한 경로만 실행 |
| 하나의 값이 여러 정확한 값 중 무엇인지 비교 | `switch` | 후보 값이 명확하게 보임 |
| 반복 횟수가 명확 | `for` | 초기화·조건·증감을 한곳에서 확인 |
| 배열의 모든 값을 읽음 | 향상된 `for` | 인덱스 없이 간결하게 순회 |
| 조건을 만족하는 동안 반복 | `while` | 횟수보다 종료 조건이 중요 |
| 본문을 최소 한 번 실행 | `do-while` | 본문 뒤에서 조건 검사 |

이 표는 절대적인 규칙이 아닙니다. 같은 동작을 여러 문법으로 만들 수 있으므로, 의도를 가장 분명하게 보여 주고 실수를 줄이는 구조를 선택하는 것이 중요합니다.

## 자주 발생하는 실수

### 중괄호 생략

실행문이 한 줄이면 중괄호를 생략할 수 있지만, 나중에 줄을 추가할 때 조건문의 일부라고 착각하기 쉽습니다. 학습 단계에서는 항상 중괄호를 사용하는 습관을 권장합니다.

### 경계값 누락

`age > 20`과 `age >= 20`은 20을 포함하는지가 다릅니다. 조건을 작성한 뒤 경계값 바로 아래, 경계값, 경계값 바로 위를 테스트하세요.

### 조건 순서 오류

`else if`는 처음 참인 조건에서 멈춥니다. 넓은 조건을 먼저 쓰면 아래의 세부 조건에 절대 도달하지 못할 수 있습니다.

### break 누락

전통적인 `switch`에서 `break`를 빠뜨리면 다음 `case`까지 실행됩니다. 의도적인 fall-through라면 주석으로 이유를 밝혀 두는 것이 좋습니다.

### 반복 변수의 잘못된 시작값·종료 조건

반복문의 시작값, 비교 연산자, 증감 방향을 함께 확인하세요. 하나라도 방향이 맞지 않으면 0회 실행되거나 무한 반복될 수 있습니다.

### off-by-one 오류

원하는 횟수보다 한 번 적게 또는 한 번 많이 반복하는 오류입니다. `i < 10`과 `i <= 10`, 배열의 `length`와 마지막 인덱스 `length - 1`의 차이를 주의하세요.

### continue 앞의 상태 변경 누락

`while`에서 반복 변수를 변경하기 전에 `continue`를 실행하면 같은 값에서 빠져나오지 못할 수 있습니다. `continue`로 건너뛰는 코드에 필수 상태 변경이 들어 있지 않은지 확인하세요.

## 권장 학습 방법

각 예제에서 다음 과정을 반복하면 문법 암기보다 실행 흐름 이해에 집중할 수 있습니다.

1. 변수의 현재 값을 적습니다.
2. 각 조건식의 결과가 `true`인지 `false`인지 계산합니다.
3. 실행될 코드 블록과 건너뛸 코드 블록을 표시합니다.
4. 반복문이라면 각 회차의 반복 변수와 누적값을 표로 적습니다.
5. 출력 결과를 예상한 뒤 코드를 실행합니다.
6. 예상과 실제 결과가 다르면 첫 번째로 달라진 지점부터 추적합니다.
7. 경계값과 잘못된 입력으로 다시 실행합니다.
8. 코드 없이 문법을 선택한 이유를 설명해 봅니다.

## 최종 점검 질문

아래 질문에 코드 없이 답할 수 있다면 핵심 개념을 이해한 것입니다.

1. `if` 문의 조건식 결과 타입은 무엇이어야 하나요?
2. 조건식이 `false`이면 `if` 블록 뒤의 프로그램도 모두 종료되나요?
3. `if-else`의 두 블록은 한 번의 실행에서 각각 몇 개까지 실행될 수 있나요?
4. 독립적인 `if` 문 여러 개와 `if-else if` 사슬은 조건 검사 방식이 어떻게 다른가요?
5. 나이 구간을 `else if`로 검사할 때 큰 경계값부터 작성하는 이유는 무엇인가요?
6. 입력값 검증 조건을 분류 조건보다 먼저 검사하면 어떤 장점이 있나요?
7. 전통적인 `switch` 문의 `break`는 무슨 역할을 하나요?
8. fall-through란 무엇이며 언제 의도적으로 사용할 수 있나요?
9. `default`는 언제 실행되나요?
10. 향상된 `switch`의 화살표 규칙에서 `break`가 필요 없는 이유는 무엇인가요?
11. `switch` 문과 `switch` 표현식의 가장 큰 차이는 무엇인가요?
12. `for` 문의 초기화식은 몇 번 실행되나요?
13. `for` 문의 본문 다음에는 조건식과 증감식 중 무엇이 먼저 실행되나요?
14. `for (int i = 1; i <= 10; i++)`의 본문은 몇 번 실행되나요?
15. 배열 순회 조건에 `index <= array.length`를 쓰면 왜 오류가 발생하나요?
16. 향상된 `for` 문보다 일반 `for` 문이 더 알맞은 상황은 언제인가요?
17. `for`와 `while`은 보통 어떤 기준으로 선택하나요?
18. `while` 문에서 반복 변수의 변경을 빠뜨리면 어떤 문제가 생길 수 있나요?
19. `break`와 `continue`는 반복문에 각각 어떤 영향을 주나요?
20. `continue` 전에 상태 변경이 필요한 이유는 무엇인가요?
21. 조건이 처음부터 `false`일 때 `while`과 `do-while`의 실행 횟수는 어떻게 다른가요?
22. `do-while` 문 끝에 세미콜론이 필요한 위치는 어디인가요?
23. `(int) (Math.random() * 10) + 1`이 만드는 정수 범위는 무엇인가요?
24. `Scanner.hasNextInt()`를 먼저 확인하는 이유는 무엇인가요?
25. 경계값 오류를 찾기 위해 어떤 입력들을 시험해야 하나요?

답하기 어려운 질문이 있다면 해당 예제로 돌아가 변수 값을 작게 바꾸고, 실행 순서를 한 줄씩 종이에 추적해 보세요.
