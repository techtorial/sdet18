package loopsPractice;

public class continueStatement1 {
    public static void main(String[] args) {


        for (int i = 0; i < 20; i++) {


            if (i > 5 ){
                continue;
            }

         //   System.out.println("********");

           System.out.println(i + 1 + " > Morning");
        }

        System.out.println("==================");
        for (int i = 0; i < 20; i++) {

            if (i > 5 && i <10 ){
                System.out.println("$$");
                continue;
            }

            System.out.println(i + 1 + " > Morning");
        }

        System.out.println("==================");

        OUTER:
        for (int a = 0; a < 10; a++ ){

            System.out.println("*****");
            INNER:
            for (int b = 0; b < 10; b++){

                if ( b ==5){
                    continue OUTER;
                }
                System.out.println("!!!!! >> " + b);




            }

        }







    }
}
