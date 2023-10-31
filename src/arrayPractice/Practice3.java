package arrayPractice;

import java.util.Arrays;

public class Practice3 {

    public static void main(String[] args) {

        double[] money = new double[6];
        money[0] = 45;
        money[1] = 90.25;
        money[2] = 100.45;
        money[3] = 50;
        money[4] = 450;
        money[5] = 100;

        System.out.println(Arrays.toString(money));// << printing all elements at once

                                                    // [45.0, 90.25, 100.45, 50.0, 450.0, 100.0]
        // TASK:
        // if the money is less than $100.00 >> Print >> "Insufficient balance!"

        for (int i = 0; i< money.length; i++){


            if (money[i] < 100){
                System.out.println("Insufficient Balance >> "+ money[i]);
            }
        }













    }
}
