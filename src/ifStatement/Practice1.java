package ifStatement;
public class Practice1 {
    public static void main(String[] args) {

        /*
        if(condition){ ..coding...}
         */

        // you will buy a new phone if your money is enough

        System.out.println("This is beginning of my code");

        double myMoney = 10;
        double phone$ = 950.50;

       // myMoney >= phone$

        // if you are able to buy new phone, find out your change

        if (myMoney >= phone$ ){

            System.out.println("I am able to BUY");
            double change = myMoney -phone$;
            System.out.println("Your left over money is "+ change);

        }

        // in the same class/method you can have multiple if blocks.
        // Each of those if blocks will work independently
        if (myMoney< phone$){
            System.out.println("Go home");
        }


        String city = "New york";
        // when name of the city is not chicago, print >> "please come and visit this windy city"

        if (! city.equalsIgnoreCase( "chicago" )){
            System.out.println("please come and visit this windy city");
        }


        System.out.println("This is end of my code");




    }
}
