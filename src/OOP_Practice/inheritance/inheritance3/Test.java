package OOP_Practice.inheritance.inheritance3;

public class Test {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.model);


       Vehicle v1 =  vehicle.accelerate();

        System.out.println( v1.model);
        System.out.println("=====");

        Car car = new Car();
        System.out.println( car.model);

        Car c1 = car.accelerate();
        System.out.println( c1.model); //


    }
}
