package Primitives;

public class Practice1 {
    public static void main(String[] args) {

        // Java reads code from left to right, top to bottom
        int redApples = 6;
        int greenApples = 5;
        int yellowApples = 10;

        System.out.println(redApples + greenApples + yellowApples);

        // The total numbers of apples is: 18
        System.out.println("The total numbers of apples is: " + (redApples + greenApples + yellowApples));


        int totalNumberOfApples = redApples + greenApples + yellowApples;

        // Total is : 18
        System.out.println("Total is : " + totalNumberOfApples);

        // each red apple is $2
        // each green apple is $3
        //each yellow apple is $1

        // store price values in variables like we did for numbers of apples above
        // find and print total payment in console as:
        // The total payment for apple is: ...

        int priceOfEachRedApple = 2;
        int priceOfEachGreenApple = 3;
        int priceOfEachYellowApple = 1;

        System.out.println("The total payment for apples is: $" + (redApples * priceOfEachRedApple + greenApples * priceOfEachGreenApple + yellowApples * priceOfEachYellowApple));

        int totalPrice = redApples * priceOfEachRedApple + greenApples * priceOfEachGreenApple + yellowApples * priceOfEachYellowApple;
        System.out.println(totalPrice);

        int x = yellowApples - 2;

        System.out.println(x);

        yellowApples = yellowApples - 2;
        System.out.println(yellowApples);

    }

}
