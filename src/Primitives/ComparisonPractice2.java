package Primitives;

public class ComparisonPractice2 {
    public static void main(String[] args) {

        // < less than operator

        int flowers = 40, vase = 40;

       boolean result =  vase < flowers;

        System.out.println(result);
        boolean result2 = flowers-- < vase;
        System.out.println(result2);

        // >= greater than OR equal

        System.out.println( flowers);

        System.out.println( vase >= flowers );// TRUE
        System.out.println(  flowers >= 39   );// TRUE

        System.out.println(  6 >= 6); // TRUE

        System.out.println(  5 >=7  );// FALSE
        System.out.println("----------------");

        // <=  less than OR equal

        int a = 45, b = 45;
        System.out.println( b <= a );//FALSE

        System.out.println( a  >= b    ); // FALSE




    }
}
