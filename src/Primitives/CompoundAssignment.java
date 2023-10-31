package Primitives;

public class CompoundAssignment {
    public static void main(String[] args) {

        int car = 2;
        // increase car number by 2
        car = car + 2; //4
        System.out.println(" >> " + car );//4

        car += 2; // car = car + 2;
        System.out.println("Car number now>> "+car);// 6
        // ===================
        double money = 10.50;
        money -= 5;
        System.out.println(money);

        // ===================
        money *= 10;
        System.out.println(money);

        // ===================
        int studentNumber = 25, cookies= 6;

        System.out.println( studentNumber% cookies); // 1

        int leftOver = studentNumber%cookies;
        System.out.println(leftOver);// 1

        studentNumber %= cookies;
        System.out.println(studentNumber);





    }
}
