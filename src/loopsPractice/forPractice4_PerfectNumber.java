package loopsPractice;

public class forPractice4_PerfectNumber {

    public static void main(String[] args) {
        /*
               if total of divisors of a given integer is equal to the number itself it is called a 'PERFECT' number
                write java code to find out if any given integer value is a perfect number or not.
                * do not include number itself as divider
             10 >> 1,2,5, >> 1 + 2 + 5 =? >> 8 > So that number 10 is not perfect number!
             6 >> 1,2,3 >> 1 + 2 + 3 =? 6 6 == 6 > So that 6 is a perfect number!
         */

        int number = 28, total = 0;


        for (int divider = 1; divider <= number/2; divider++){

            if ( number % divider == 0){

                total += divider;
            }
          //  if(divider >= number/2){break;}

        }
        if (number== total){
            System.out.println( number +" is a PERFECT number :)");
        }else {
            System.out.println(number +" is  NOT  PERFECT number :(");
        }




    }
}
