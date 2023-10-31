package objectMethodPractice;

public class Calculator2 {

    /*
    create a method that will take two double numbers as params
    this method will return the sum of numbers as double
    'sumFinder'
    create main method and test your method by calling it
     */
    public double sumFinder(double n1, double n2) {
        return n1 + n2;
    }

    /*
    overload sumFinder method to find the sum of numbers from a given int array as a param
    this method should return the sum as int value
    this method should also print the result
    this method should also print that how many numbers were added together
    ...6.. + " numbers added from array and the total is: "+  ...total...
     */

    public int sumFinder(int[] numbers) {

        //{1,2,3,4,5}
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }
        System.out.println(numbers.length + " numbers added from array and the total is: " + sum);

        return sum;
    }

    /*
    overload sumFinder method to find total of even and odd numbers separately from long array
    show each sum for evens and odds
    show how many even/odd numbers were added
    no Return >> void method
    //{1,2,3,4,5, 1, 3}
    total1 = 2 + 4 = 6  >> count of evens is 2
    total2 = 1 + 3+ 5 + 1 +3 >> 13 count of odds is 5
     */

    public void sumFinder(long[] numbers) {

        double evenSum = 0;
        int oddSum = 0, evenCount = 0, oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
                evenCount++;
            } else {
                oddSum += numbers[i];
                oddCount++;
            }
        }
        System.out.println("Sum of even numbers is: " + evenSum
                + " and " + evenCount + " even numbers added");

        System.out.println("Sum of odd numbers is: " + oddSum
                + " and " + oddCount + " odd numbers added");


    }



    public static void main(String[] args) {
        Calculator2 c2 = new Calculator2();
        System.out.println(c2.sumFinder(1.2, 1.2));
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        c2.sumFinder(nums);
        long[] ids = {1, 2, 3, 4, 6, 8};
        c2.sumFinder(ids);

    }


}
