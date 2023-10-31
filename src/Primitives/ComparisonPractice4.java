package Primitives;
public class ComparisonPractice4 {
    public static void main(String[] args) {

        /*
        "You will pay $5 "..T/F..
        if you are in zipcode 60602 no delivery fee
        if you are in 5 miles radius from store no fee
        if your name is "John" no fee
        * otherwise you are paying fee of $5
         */
        int zipCode = 60602, myZipCode = 600056, distance = 5, myDistance = 200;

       boolean fee =  zipCode == myZipCode ||   distance > myDistance   ||  "John" == "John";
        System.out.println("You will pay $5 " + !fee);





    }
}
