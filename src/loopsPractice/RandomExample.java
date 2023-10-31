package loopsPractice;


import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random random = new Random();

      int number =   random.nextInt(2);

     String myFlip =  number == 0 ?  "HEAD"   :  "TAIL"    ;

        System.out.println(number);
    }
}
