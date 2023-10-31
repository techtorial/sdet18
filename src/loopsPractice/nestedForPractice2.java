package loopsPractice;

public class nestedForPractice2 {
    public static void main(String[] args) {


        /*
        print hours and minutes >> from 0 hr to 12
                                        0 min to 59
                                        0 : 00 : 0
                                        0 : 01 : 1
                                        0 : 02
                                        0 : 10
                                        ...
                                        0 : 59 : 59
                                        1 : 0
                                        1 : 1
                                        ...
                                        12 : 59
         */

        for (int h =0; h<=12; h++){

            for (int m = 0; m< 60; m++){

               for (int sec = 0; sec < 60; sec++){

                       System.out.println(h +" : "+ m+ " : "+sec);

               }

            }

        }









    }
}
