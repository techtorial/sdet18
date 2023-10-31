package loopsPractice;

public class breakStatement2 {
    public static void main(String[] args) {

        OUTER:
        for (int i = 0; i < 20; i++) {

            INNER:
            for (int k = 0; k < 20; k++) {

                System.out.println(i + 1 + " > Morning");

                break OUTER;
            }


        }

        System.out.println("------------------------");
        OUTER:
        for (int i = 0; i < 20; i++) {

            INNER:
            for (int k = 0; k < 20; k++) {

                System.out.println(i + 1 + " > Morning" + k);

                if (i ==5){
                    break INNER;

                }
            }

        }










    }
}
