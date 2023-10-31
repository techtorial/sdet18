package Primitives;
public class Task2 {
    public static void main(String[] args){
        /*
        you want to get a car for $5500
        interest is 5.99% on original car value
            No tax for interest amount
        36 installments
        Tax: 10 %

        find out: how much is the total cost of the car?
        find out: last month's payment and tell us how much it is.
         */
        double carValue = 22000;
        double interestPercent = 0.0699;
        int numbersOfInstallments = 60;
        double taxPercent = 0.10;

        double interestCost = carValue * interestPercent;
        System.out.println(interestCost);

        double taxCost = carValue * taxPercent;
        System.out.println(taxCost);

        double carCostFinal = carValue + taxCost + interestCost;

        System.out.println("The car cost is >> "+ carCostFinal);
        System.out.println( "Monthly payment is >>" + (carCostFinal / numbersOfInstallments));

        String s = "df";




    }
}
