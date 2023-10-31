package loopsPractice;

public class whilePractice6 {

    public static void main(String[] args) {
        /*
        num1 = 2, num2 = 6
        find out total of numbers in the range of 2 to 6
      -write a java code that will find out sum of numbers in a given range-
         */

        int num1 = 2, num2 = 6; // 2 +3 +4 + 5 +6 = 20
        int total = 0;

        while (num1 <= num2) {

            total = total + num1;
            num1++;

        }
        System.out.println(total);

        // write java code that will find total of odd numbers in a given range

        num1 = 2;
        num2 = 10; //> this is example range // 3 + 5 + 7 + 9 >> 24
        int sum = 0;
        while (num1 <= num2) {

            if (num1 % 2 != 0) {
                //these are odd numbers
                sum += num1;
            }
            num1++;
        }
        System.out.println("Sum of odd numbers "+sum);


    }
}
