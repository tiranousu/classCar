public class Car {
    static int serialNums = 1;

    protected String carId;
    protected String model;
    protected int year;
    protected int maxSpeed;
    protected int minSpeed;

    public Car(String model, int year, int maxSpeed, int minSpeed) {
        this.carId = "car" + serialNums++;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;  // 초기화 추가
    }
    
    public void accelerate(int speed){
        this.maxSpeed += speed;
    }

    public void decelerate(int speed, int time ){
        this.minSpeed -= speed ;
    }
    
    

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMinSpeed() {
        return minSpeed;
    }
}
