package objectMethodPractice;

public class TestCalculator {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();

        calculator.sumFinder1();
        // you cannot print 'void' method
        //  System.out.println(calculator.sumFinder1());

        calculator.sumFinder2();
        System.out.println("------------");
        System.out.println(calculator.sumFinder2());

        String str = "Test";

        System.out.println(str.length()); // 4

        System.out.println(str.replace("e", "$$$$"));

        String s = str.replace("e", "$$$$");

        int l = str.length();


        System.out.println("------------");


        int x = calculator.sumFinder2();
        System.out.println(x + " <<<< ");


        System.out.println("-----+--+-----");
        System.out.println(calculator.squareMaker());
        ;

        // get square of that number and multiply the result by 2

        long a = calculator.squareMaker() * 2;

        // how to cast the result in to int type
        int y = (int) calculator.squareMaker() * 2;

        System.out.println(y + " <<< ");

        System.out.println("*********");
        String w = calculator.squareMaker2();


        System.out.println(">> ! " + w);

       double area1 =  calculator.areaFinder(5,10);
        System.out.println(area1);

        double area2 = calculator.areaFinder(21, 100);
        System.out.println(area2);

    }


}
