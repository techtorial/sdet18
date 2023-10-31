package switchStatement;

public class Practice1 {
    public static void main(String[] args) {

        int age = 55;

        switch (age) {
            default:
                System.out.println("Not matching age");
                break;
            case 1:
                System.out.println("It is a little baby");
                break;
            case 5:
                System.out.println("Kinder gardener");
                break;
            case 8:
                System.out.println("Third Grade");
                break;
            case 10:
                System.out.println("Fifth Grade");
                break;


        }

        System.out.println("===========");

//        double count = 2.5;
//        switch (count){
//            case 2:
//                System.out.println("Example");
//        }

    }
}
