package scannerPractice;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        /*
        calc BMI for user by using scanner
        BMI = w / h * h;
         */
        Scanner dataTaker = new Scanner(System.in);
        System.out.println("enter your weight in kilograms: ");

        double weight = dataTaker.nextDouble();
        System.out.println("enter your height in meters: ");
        double height = dataTaker.nextDouble();
      double bmi =   weight / (height * height);
        System.out.println("your BMI is: "+ bmi);

    }
}
