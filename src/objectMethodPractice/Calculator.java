package objectMethodPractice;

public class Calculator {

    // create a method that will add two integer numbers and print total

    public void sumFinder1(){
        int num1 = 9, num2 = 4;
        int result = num1 + num2;
        System.out.println("Total of "+num1 + " and "+ num2 + " is: "+result);



    }
    // create a method that will add two integer numbers,
    // the method will return the total
    // the method will print the total

    public int sumFinder2(){
        int num1 = 10, num2 = 10;
        int result = num1 + num2;
        System.out.println("Total of "+num1 + " and "+ num2 + " is: "+result);

        return  result;
    }

    // create a method that will find square of a number
    // the method will return the result as long value

    public long squareMaker(){

        int number = 6;
        long result = number * number;
        return  result;
    }
    // create a method that will find square of a number
    // print the result to show
    // the method will >> Found the Result as long but returning as String

    public String  squareMaker2(){

        int number = 10;
        long result = number * number;
        System.out.println("Square of number is "+ result);
        System.out.println("Today is MONDAY");

        return ""+result;
    }

    // create a method that will find area of any shape of rectangle
    // this method will return the area as double data
    // this method will take length and width of rectangle from method call(as parameter)
    // A = l * w;
    public double areaFinder( int length, int width  ){

        double area = length * width;
        return area;
    }



}
