package loopsPractice;

public class breakStatement1 {
    public static void main(String[] args) {

// we can use break statement in the loop
        for (int i =0; i<= 20; i++){

            System.out.println(i);
            System.out.println(i);
            System.out.println("HI");
            break;

        }
        System.out.println("=======!!!========");
        for (int i =0; i<= 20; i++){

            System.out.println(i);

          if ( i > 10){
              break;
          }
            System.out.println(i+1+". Hello John");

        }
        System.out.println("=======!!!========");




        for (int i= 0; i< 20; i++){ //0, 1, 2, 3


            for (int k =0; k< 20; k++){

                System.out.println(i+1 +" > Evening");// 4
                break;

            }
        }

        System.out.println("===============");


        for (int i= 0; i< 20; i++){


            for (int k =0; k< 2; k++){

                System.out.println(i+1 +" > Evening");

            }

            break;
        }









    }
}
