package Primitives;

public class LogicalOperatorPractice {
    public static void main(String[] args) {

        boolean validID = true;
        boolean visa = false;

        boolean fly = validID && visa;
        System.out.println("Can I fly: "+fly);
        visa = true;
        fly = validID && visa;
        System.out.println("Can I fly: "+fly);// T

        // == OR >> || ===

        double myCash = 9000;
        double ccLimit = 6000;
        double car$ = 8000;

        boolean canBuy = myCash >= car$   || car$ <= ccLimit;
        System.out.println(canBuy + " >> that you can buy this car!");




    }
}
