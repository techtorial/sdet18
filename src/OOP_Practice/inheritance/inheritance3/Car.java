package OOP_Practice.inheritance.inheritance3;

public class Car extends Vehicle {

    String model;
    double engineSize;

    @Override
    public void move() {
        System.out.println("CAR is MOVING");
        super.stop();
    }

    protected Car accelerate() {
        this.model = "BMW";
        super.model = "Mercedes";
        Car car = new Car();
        car.model = "FERRARI";
        System.out.println("-----");
        return car;

    }

}
