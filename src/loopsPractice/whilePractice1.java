package loopsPractice;

public class whilePractice1 {
    public static void main(String[] args) {

//        System.out.println("Summer is about to be over");
//        System.out.println("Summer is about to be over");
//        System.out.println("Summer is about to be over");
//        System.out.println("Summer is about to be over");
//        System.out.println("Summer is about to be over");
//        System.out.println("Summer is about to be over");
//        System.out.println("Summer is about to be over");

        int count = 0;

        while ( count < 5 ){

            System.out.println("Summer is about to be over");
            count++;

        }
        System.out.println("------");
        System.out.println("The count is NOW after loop " + count);

        while (count > 0){
            System.out.println("PICNIC DAY");
            count--;
        }
        System.out.println("The count is NOW after loop " + count);
        // printing '***PICNIC DAY***' for 5 times
        int number =5;
        while (number <=9){
            System.out.println("***PICNIC DAY***");
            number++;
        }
        System.out.println("=============");
        number = 100;
        while (number < 10){
            System.out.println("want to eat burger at the picnic");
            number++;
        }
        System.out.println("---------------");
        System.out.println(number);





    }
}
