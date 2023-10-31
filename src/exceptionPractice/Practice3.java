package exceptionPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException{
        try {

            FileInputStream stream = new FileInputStream("Test.txt");
            Scanner scanner = new Scanner(stream);


            while (scanner.hasNextLine()){

                System.out.println(  scanner.next() );

                Thread.sleep(10);
            }

        } catch (FileNotFoundException exception){
            System.out.println("Catch Block");
        }catch (NoSuchElementException e){
            System.out.println("ELEMENT NOT FOUND");
        }finally {
            System.out.println("Finally it is DONE");
            System.gc();
        }

        System.out.println("=============");
        // throw

        int money = 100;
        int computer= 1000;

        if (money < computer){
            throw new IndexOutOfBoundsException();
            //throw  new NoSuchElementException();
        }

        System.out.println("Something");


    }


}
