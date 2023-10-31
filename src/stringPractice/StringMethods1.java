package stringPractice;

public class StringMethods1 {
    public static void main(String[] args) {

        String drink = "Coffee";
        // concat() >> this  method will attach given text to the existing value
        drink = drink.concat(" is hot");
        System.out.println(drink); //

        drink = drink.concat("123");
        System.out.println(drink);
        String str2 = drink.concat(" nex time");
        System.out.println(str2);

        // length(); this will return numbers of characters from given string
        int countOfLettersDrink = drink.length();
        System.out.println(countOfLettersDrink);
        String cookie = "chocolate chip";
        System.out.println(cookie.length());

        // charAt() --> it will return a char from given index
        char letter = cookie.charAt(0); // I am looking for char at index zero >> 'c'
        System.out.println(letter); // c
        System.out.println(cookie.charAt(0)); // c

        //   get letter 't' from string cookie

        System.out.println(cookie.charAt(7)); // t

        // get last char from string

        // "chocolate chip"   last index is 13  , count of letters is 14
        // java >> last index 3, letter count 4


        cookie = "today is too many coffee and cookie and codinG";
        System.out.println(cookie.charAt(13)); // m
        System.out.println("===================");
        int l = cookie.length();
        System.out.println(cookie.charAt(l - 1));
        System.out.println(cookie.charAt(cookie.length() - 1));

        System.out.println(cookie);
        String cake = "vanil-la";

        int indexOfl = cake.indexOf('l');// index number for 'l'
        System.out.println(indexOfl);//4
        System.out.println(cake.indexOf("la")); // will return index of first matching char >> 5
        System.out.println(cake.indexOf("nilla")); // 2
        System.out.println(cake.indexOf("tech")); // -1 >> indicating that there is no matching char/char sequence

        // how to get index of second l from 'vanilla'
        int indexOfSecondl = cake.indexOf('l', 5);
        System.out.println(indexOfSecondl);
        String city = "chicago";
        // want to find out index of second 'c'

        System.out.println(city.indexOf('c', 1));// 3
        System.out.println(city.indexOf('c', city.indexOf('c') + 1));

        //toUppercase() - toLowercase()
        String str3 = "tea";
        String str4 = str3.toUpperCase();

        System.out.println(str3); // tea
        System.out.println(str4); // TEA
        System.out.println( str3.toUpperCase()); // TEA
        System.out.println(str3); // tea


    }
}
