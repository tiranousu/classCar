public class ElectricCar extends Car {

    public ElectricCar(String model, int year, int maxSpeed, int minSpeed) {
        super(model, year, maxSpeed, minSpeed);
        this.carId = "car" + serialNums++;
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
    }
    public void accelerateEle(int speed){
        this.maxSpeed += speed; 
    }

    public void decelerateEle(int speed, int time ){
        this.minSpeed -= speed ;
    }
    
}


