# 차량 관리 시스템

## 주요 기능
- **기본 속성**: 모든 차량은 다음과 같은 기본 속성을 가집니다:
  - 모델명
  - 제조년도
  - 최고 속도
  - 최저 속도
- **가속 및 감속**: `accelerate` 메소드와 `decelerate` 메소드를 통해 차량의 속도를 조절할 수 있습니다.
- **일련번호 관리**: 각 차량은 고유한 일련번호를 할당받으며, 이 번호는 `Car` 클래스의 정적(static) 변수로 관리됩니다.

## 구현 상세
- **생성자**: `Car` 클래스의 생성자에서는 모델명, 제조년도, 최고 속도, 최저 속도를 초기화하며, 차량의 일련번호를 자동으로 할당합니다.
- **메소드 오버라이딩**: `ElectricCar` 클래스는 `Car` 클래스의 `accelerate` 및 `decelerate` 메소드를 오버라이딩하여 전기차 특유의 동작을 반영했습니다.
- **테스트 클래스**: `CarTest` 클래스에서는 생성된 `Car` 및 `ElectricCar` 객체의 기능을 테스트하고 그 결과를 콘솔에 출력합니다.

## 배운 점
- **객체 지향 프로그래밍의 이해**: 클래스 상속, 메소드 오버라이딩, 생성자의 활용 등 객체 지향 프로그래밍의
