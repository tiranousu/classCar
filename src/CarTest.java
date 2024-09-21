public class CarTest {
    public static void main(String[] args) {
        int speed = 70;  // 사용할 속도 값

        // 차량 객체 생성
        Car car1 = new Car("Tesla", 7, 350, 140);
        ElectricCar electricCar1 = new ElectricCar("Kia", 5, 290, 120);

        // 가속 및 감속
        car1.accelerate(speed);
        car1.decelerate(speed, 1);  // 여기서 time은 1로 가정
        electricCar1.accelerate(speed);
        electricCar1.decelerate(speed, 1);  // 여기서 time은 1로 가정

        // 결과 출력
        System.out.println("가솔린 자동차 최고 속도: " + car1.getMaxSpeed());
        System.out.println("가솔린 자동차 최저 속도: " + car1.getMinSpeed());
        System.out.println("전기 자동차 최고 속도: " + electricCar1.getMaxSpeed());
        System.out.println("전기 자동차 최저 속도: " + electricCar1.getMinSpeed());
    }
}

