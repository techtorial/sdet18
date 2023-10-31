package loopsPractice;

public class doWhilePractice1 {
    public static void main(String[] args) {

        int a = 5, b = 10;

        System.out.println("=====Welcome to the Loop=====");
        //do-while syntax
        do{
            System.out.println("$$$");
        }while(a > b);

        System.out.println("====Say bye to first loop====");

        do{
            System.out.println("$ "+ a);
            a++;

        }while (a <= b);

        System.out.println("------------------");
    int x = 3, y = 5;
    do {
        System.out.println("This is another example for DO WHILE");
        y--;
    }while(x < y);




    }
}
