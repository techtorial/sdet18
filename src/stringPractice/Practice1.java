package stringPractice;
public class Practice1 {
    public static void main(String[] args) {

        String day = "saturday";

        System.out.println(day);//saturday

        System.out.println( day + " is a weekend day");//
        System.out.println(day);//saturday
        System.out.println(4 + 4 + day);// 8saturday,
        System.out.println(day+4+4);//saturday44
        System.out.println(day+ true+false);

        day = day + " is cold in chicago";
        System.out.println( day);// saturday is cold in chicago

        day = "saturday";
        String name = "saturday";
        System.out.println( name );// saturday
        System.out.println( day);// saturday
        name = "david";
        System.out.println( name);
        System.out.println( day);
        // indexing on string

        System.out.println( name.charAt( 0  )  );//d
        System.out.println(  name.charAt( 1 )); // a

        String drink = "water";
        String liquid = "water";
        System.out.println( drink == liquid  );//TRUE

        String cookie = new String("oreo");
        String cookie3 = new String("oreo");
        String cookie2 = "oreo";
        String cookie4 = "oreo";

        System.out.println(  cookie ==cookie2  );// FALSE

        System.out.println( cookie == cookie3);

        System.out.println(cookie2 == cookie4);// TRUE

        cookie3 = cookie;
        System.out.println(cookie == cookie3);
        cookie3 = cookie2;
        System.out.println( cookie3 == cookie2);


        int a = 3;






        int number = 10;


    }
}
