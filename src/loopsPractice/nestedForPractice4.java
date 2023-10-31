package loopsPractice;

public class nestedForPractice4 {
    public static void main(String[] args) {

        /*

        create times tables for numbers 1 to  20 up to 12s
        1 * 1 = 1
        1 * 2 = 2
        ...
        1 * 12 = 12
        -----
        2 * 1 =2
        2 * 2 = 4
        ..
        2 * 12 = 24
        ----
        20 * 1 = 20
        20 * 2 = 40
        ...
        20 * 12 = 240

         */

        for (int num1 = 1; num1<= 20; num1++){

            if (num1 ==2)continue;
            for (int num2 = 1 ; num2<=12; num2++){
                System.out.println(num1 +" * "+ num2 +" = "+ num1* num2);

            }
            System.out.println("-------------");


        }

    }
}
