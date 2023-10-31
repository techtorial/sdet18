package Primitives;

public class Task1 {
    public static void main(String[] args) {
        /*
        you buy watch for 595.90 in FL
        you buy apples in IL for 1.99 for a pound
            if you have 4 lbs of apples in IL
                and 1 watch in FL
        calculate total cost including tax if
            FL has : 5 %  --> 20 >> 20 * 0.05
            Il has:  10 %
         PRINT >> Total payment for you is: ..9999..

         627.884, 634.05, 634.45, 79.6, 630.09
         */
        double watch$ = 595.90, apple$ = 1.99, numberOfPound = 4, numberOfWatch = 1,
                taxFL = 0.05, taxIl = 0.10, watchWithTax, appleWithTax;

        watchWithTax = (numberOfWatch * watch$) + (numberOfWatch * watch$) * taxFL;

        appleWithTax = (numberOfPound * apple$) + (numberOfPound * apple$) * taxIl;

        System.out.println("Total payment for you is: " + (watchWithTax + appleWithTax));
    }
}
