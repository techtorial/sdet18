package Primitives;
public class OperatorPrecedence {
    public static void main(String[] args) {

        int number1 = 5, number2 = 8;

        int result1 = number1 + number2 + number2 / 3;
        System.out.println( result1); // 15

        int result2 = result1 / number1 - 10 / 5 - 1 + number2;

        System.out.println( result1 + result2);// 23


        System.out.println("Result >> "+ (result2 % result1 * 4 + number1));// 37, 17, 33, 325

        System.out.println(   result2 % result1 * (4 + number1) - number2    );

        System.out.println(   result2 % result1   );




    }

}
