package loopsPractice;

public class whilePractice2 {
    public static void main(String[] args) {

        System.out.println("COKE");
        int number = 10;

        // since the condition is always true,and thare is no update on the number
        // loop will work for forever
        // INFINITE loop
//        while (number ==10){
//            System.out.println("it is getting easy to do coding");
//        }

        System.out.println("DRINK");

        while (number == 10) {
            System.out.println("it is getting easy to do coding");
            break;
        }

        // your age is 18
        // >> 'My age is now ..19.."
        // till your age gets to age of 25
        int age = 18;
        while(age <=25){

            System.out.println("My age is now: "+ age++);
          //  age++;
        }
        // print out even numbers from 10 to 20 inclusively, >> 10, 12, 14 ,,,, 20
      int num1 = 10, num2 =20;

        while(num1 <= num2){
//            if (num1 %2 ==0){
//                System.out.println( num1);
//            }
//            System.out.println(num1);
//            num1++;
//            num1++;
            System.out.println(num1);// 10, 12
            num1 += 2;

        }



    }
}
