package loopsPractice;

public class forPractice3 {

    public static void main(String[] args) {

        // print upper case letters from alphabet
        // A,B,C ... Z
        // Aa, Bb, Cc, .... Zz

        System.out.println("**********************");
        // Aa, Bb, Cc, .... Zz

        // char letter1 = 'A', letter2 ='a';
        // System.out.println(""+letter1 + letter2); //

        for (char letter1 = 'A', letter2 = 'a'; letter1 <= 'Z' && letter2 <= 'z'; letter1++, letter2++) {

            System.out.print("" + letter1 + letter2 + ", ");
        }


        System.out.println("\n**********************");


        for (char ch = 'A'; ch <= 'Z'; ++ch) {

            System.out.print(ch + ", ");

        }
        System.out.println();
        System.out.println("---------multiple terms----------");

        int x = 1;

        for (int a = 5, b = 15; x < a || b >= a; x++, b--) {


            System.out.println("x >> " + x + "a >> " + a);

        }
        System.out.println("============" + x);
        //a >
        int y = 8;
        for (x = 0; y > x; y--) {

            System.out.println("Another example");
            x++;
        }

        for (int k = 10, m = 20, l = m + k; k <= m && m >= k; m--) {

            System.out.println("Hello there");
            k++;
            System.out.println("K is : " + k);

        }


    }
}
