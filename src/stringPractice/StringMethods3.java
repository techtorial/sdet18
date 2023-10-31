package stringPractice;

public class StringMethods3 {
    public static void main(String[] args) {
        // equalsIgnoreCase()

        String drink = "water";

        boolean r1 = drink.equalsIgnoreCase("WATER");
        System.out.println( r1); // TRUE

        System.out.println( drink.equalsIgnoreCase("WaTEr"));// TRUE

        String coke = "colorful water";
        drink = coke.concat(coke); // colorful watercolorful water / water colorful water
        System.out.println(drink);
        System.out.println(drink.equalsIgnoreCase("water"+coke)); //
        System.out.println(drink.equalsIgnoreCase(coke)); //

        //substring()
        System.out.println("================");

        String quote = "just do some practice";
        String part1 = quote.substring(5);
        System.out.println(part1);

        String part2 = quote.substring(5, 13);
        System.out.println(part2);
        System.out.println(quote.indexOf('p'));

       // System.out.println(   quote.substring(10, 100));// StringIndexOutOfBoundsException

        //replace()

        String cup = "where is the world cup?";
        System.out.println(cup);

        String newCup = cup.replace('w', 'W');
        System.out.println(newCup);

        String euroCup = cup.replace("world", "EURO");
        System.out.println(euroCup);

        System.out.println(   cup.replace("l", "CAR"));

        String favorite = "    milk chocolate   ";
        String str5 = favorite.trim();
        System.out.println(favorite);
        System.out.println(str5);







    }
}
