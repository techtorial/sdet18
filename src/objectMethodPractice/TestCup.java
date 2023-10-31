package objectMethodPractice;

public class TestCup {
    public static void main(String[] args) {

        Cup cup = new Cup();

        Cup cup1 = new Cup();
        Cup cup2 = new Cup();

        Cup cup3 = new Cup();

        System.out.println( cup );
        cup.run();

        System.out.println( cup3.color  );

        Cup cup4 = new Cup("Black");
        System.out.println( cup4.color);

        System.out.println("______________");

        Cup cup5 = new Cup("Blue", "JAVA", 12, 11.99 );

        System.out.println( cup5.color  );// Blue
        System.out.println(  cup5.brand ); // JAVA
        System.out.println(  cup5.price ); //11.99

        System.out.println(    cup5    );

        //












    }
}
