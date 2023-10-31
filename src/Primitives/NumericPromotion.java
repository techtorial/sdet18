package Primitives;

public class NumericPromotion {
    public static void main(String[] args) {

        byte num1 = 4;
        byte num2 = 3;

       // byte result = num1 + num2; compile time error
        int result1 = num1 + num2;

        long result2 = num1 + num2;

        double result3 = num1 + num2; //7.0

        //short result4 = num1 + num2;  compile time error
        float fl1 = 3.5f;
        float fl2 = 5.2f;

        float result5 = fl1 * fl2;
        double d1 = 2.5;

        //float result6 = fl1 + d1; compile time error

        double result7 = fl1 + d1;

        System.out.println(result7);

        long l1 = 20;
        int i1 = 5;

        long r1 = l1 + i1;

        System.out.println( 8 * 2.5);//20/20.0

        double r9 = 8 * 2.5;


    }
}
