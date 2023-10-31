package Primitives;

public class UnaryPractice {
    public static void main(String[] args) {

        int number = 5;

        // Decrement --> --
        // Increment --> ++

        System.out.println(number); // 5

        number++; // Post Increment

        System.out.println(number); //6

        ++number; // Pre Increment
        System.out.println(number);// 7

        //===============
        System.out.println("===============");

        number--; // Post Decrement
        System.out.println(number);

        --number; // Pre Decrement
        System.out.println(number);// 5

        System.out.println("=================");

        int studentNumber = 25;

        System.out.println(studentNumber++);//shows as 25, assigned to 26 behind the scene
        System.out.println(studentNumber);//26

        System.out.println(--studentNumber);// assigned to 25 and show/use as 25.
        System.out.println("=================");
        int carAmount = 10;

        System.out.println(++carAmount);// 11

        System.out.println(carAmount++ + ++carAmount);//24


        int a = 3, b = ++a, c = a++ + 10;
        System.out.println("b >> " + b);
        System.out.println("c >> " + c);
        System.out.println("a >> " + a);

        int result2 = a + b + c;

        System.out.println(result2); // 23

        System.out.println("------------");
        int x = 3, y = 12, z = ++x - 10 * 2 + --y + x--;
        int result3 = ++x + y + z;

        //x -- ? 3,4
        System.out.println(x);

        System.out.println(result3); // 14, 15, 19,

        int burger = 11;

        // ++burger++;

        char letter5 = 'A';
        letter5++;
        System.out.println(letter5);


    }
}
