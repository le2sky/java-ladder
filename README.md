# 사다리 타기 기능 명세서

### 입력

- [x] 사용자들의 이름을 입력받는다.
    - [x] 이름은 쉼표를 기준으로 구분한다.
- [x] 사다리의 높이를 입력받는다.
    - [x] 높이는 정수 형태의 문자여야 한다.
- [x] 사다리 게임의 실행 결과를 입력받는다.
    - [x] 실행 결과는 쉼표를 기준으로 구분한다.
- [x] 결과를 보고 싶은 사람을 입력받는다.

### 출력

- [x] 사다리를 출력한다.
- [x] 사용자들의 이름은 사다리를 출력할 때 같이 출력한다.
- [x] 실행 결과는 사다리를 출력할 때 같이 출력한다.
- [x] 사용자들의 실행 결과를 출력한다.
    - [x] 모든 사용자의 실행 결과를 출력할 경우, 입력받은 순서대로 출력한다.

### 사용자 (Player)

- [x] 사용자는 이름이 있다.
- [x] 이름은 양 옆 공백을 제외한 1자 이상이다.
- [x] 이름은 양 옆 공백을 제외한 5자 이하이다.

### 사용자들 (Players)

- [x] 중복된 사용자가 있는지 검증한다.
- [x] 사용자는 최소 2명 이상이여야 한다.
- [x] 주어진 이름을 가진 사용자의 위치를 알아낼 수 있다.

### 게임 (Game)

- [x] 사다리 게임에 사용자가 참가한다.
- [x] 사다리 게임은 사다리를 생성할 수 있다.
- [x] 사용자 이름을 받아서 사다리 게임 결과를 조회할 수 있다.
- [x] 모든 사용자의 사다리 게임 결과를 조회할 수 있다.

### 실행 결과(GameResult)

- [x] 실행 결과는 사용자의 수와 동일하다.
- [x] 실행 결과는 양 옆 공백을 제외한 1글자 이상이다.

### 사다리 (Ladder)

- [x] 사다리는 라인을 가지고 있다.
    - [x] 라인의 수는 높이와 동일하다.
    - [x] 높이는 1 이상이여야 한다.
- [x] 사다리는 실행 결과를 가진다.
- [x] 사다리를 탈 수 있다.
    - [x] 사용자의 초기 위치를 받아서 실행 결과를 반환한다.

### 라인 (Line)

- [x] 라인은 막대로 이루어져있다.
    - [x] 한 라인을 이루는 막대의 수는 사용자들의 수보다 1개 적다.
- [x] 라인에 연속된 막대는 있을 수 없다.
- [x] 왼쪽과 오른쪽에 이동 가능한 막대가 있는지 체크할 수 있다.

### 방향 (Direction)

- [x] 방향은 우선순위를 가진다.
- [x] 방향끼리 우선순위를 비교할 수 있다.

### 막대 생성기 (Stick Generator)

- [x] 막대를 생성할 수 있다.
    - [x] 난수를 받아서 1이면 채워진 막대이고, 0이면 비어있는 막대이다.
