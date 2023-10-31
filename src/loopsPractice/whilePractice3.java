package loopsPractice;

public class whilePractice3 {
    public static void main(String[] args) {
        // 10 >>> find divisors of the given number
        // 2, 5, 10, 1
        // 20 >> 1,2,4,5,10,20
        // ... 2.. can divide ..10.. with no left over!

        //10 >> 1,2,4,5,10

        int givenNumber = 100;
        int divisor = 1;
        int count = 0;
        while (divisor <= givenNumber){

            if (givenNumber % divisor == 0){
                System.out.println(divisor +" can divide "+ givenNumber +" with no left over");
                count++;
            //    System.out.println("Count is "+count);
            }
            divisor++;
        }
           System.out.println("Count is "+count);
    }
}
