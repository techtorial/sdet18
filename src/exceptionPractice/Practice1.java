package exceptionPractice;

public class Practice1 {
    public static void main(String[] args) {

        System.out.println("This is my first PRINT");

        String str = "35Days";

        try {
            System.out.println( str.charAt(100) );
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("I have Caught an Exception ");
            System.out.println("The problem could be about passing index value");
        }finally {
            System.out.println("Finally it is DONE");
        }
        System.out.println("This is SECOND");

        System.out.println("This is My third PRINT");










    }



}
