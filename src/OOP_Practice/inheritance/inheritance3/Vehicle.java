package OOP_Practice.inheritance.inheritance3;

public class Vehicle {

    protected String model;
    int year;
    public String brand;

    public void move(){
        System.out.println("vehicle is moving");
    }

    public boolean stop(){
        System.out.println("vehicle is stopping");
    return true;
    }

    protected boolean start(){
        System.out.println("vehicle is starting");
        return true;
    }

     Vehicle accelerate(){
         System.out.println("Vehicle is getting faster and faster");
         ///...
         Vehicle v = new Vehicle();

         //....
         return  v;
    }

     Vehicle(){}


}
