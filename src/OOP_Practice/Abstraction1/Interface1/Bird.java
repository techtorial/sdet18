package OOP_Practice.Abstraction1.Interface1;

import OOP_Practice.Abstraction1.abstractClass1.Student;

public class Bird extends Student implements CanFly {

    public Bird(String name, String address, String color, int distance) {
        super(name, address);
        this.color = color;
        this.distance = distance;
    }

    @Override
    public void attend() {

    }

    @Override
    public int study(int hours) {
        return 0;
    }

    public  void alive(){
        System.out.println("Bird is alive");
    }
    String color;
    int distance;

    @Override
    public void fly() {

        System.out.println("Bird is flying");
    }


    public String landing() {

        System.out.println("Bird is landing far in "+ distance);
        return "Bird is landing to LAKE";
    }

    // you cannot create abstract method in non-abstract class
    // public abstract  void migrate();

    void migrate() {
        System.out.println("Birds migrate to the South");
    }


}
