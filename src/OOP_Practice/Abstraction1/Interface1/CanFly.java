package OOP_Practice.Abstraction1.Interface1;

public interface CanFly extends LivingThing  {

     int WINGS = 2;
    int TAIL = 1;

    void alive();

    void fly();

    String landing();

      default void printInfo(){
        System.out.println("INFO ABOUT CAN_FLY "+TAIL+ " = "+WINGS);

    }
    public  default void printInfo(int a){
        System.out.println("INFO ABOUT CAN_FLY "+TAIL+ " = "+WINGS);

    }

    // you can create private methods in interface
     private void run(){

        System.out.println("Run in the CanFly class ");
    }
    private void run1(){

        System.out.println("Run in the CanFly class ");
    }



}
