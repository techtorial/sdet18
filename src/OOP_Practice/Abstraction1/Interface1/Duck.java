package OOP_Practice.Abstraction1.Interface1;

import accessModifier.Animal;

public class Duck extends Animal implements CanFly, CanSwim{

    public void alive(){
        System.out.println("Duck is alive");
    }

    @Override
    public void fly() {
        System.out.println("Duck is Flying");
    }

    @Override
    public String landing() {

        System.out.println("Duc is landing to GRASS");
        return null;
    }

    @Override
    public void swim(int depth) {
        System.out.println("Duck is swimming in the LAKE like fish do");
    }

    // overriding from CanFly interface. access modifier has to be public
     public  void printInfo(){
         System.out.println("Print info in Duck");
     }
    void makeNoise(){
        System.out.println("Duck Duck ..");
    }
}


