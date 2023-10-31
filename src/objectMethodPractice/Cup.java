package objectMethodPractice;

import java.sql.SQLOutput;

public class Cup {

    String color, brand;
    int size;
    double price;

    public  Cup(){
        System.out.println("No argument Constructor");
    }

    public Cup(String color1){
        System.out.println("One argument Constructor");
        color = color1;
    }
    public Cup(String color, String brand, int size, double price){
        this.color = color;
        this.brand = brand;
        this.size = size;
        this.price = price;
        System.out.println("LAST CONSTRUCTOR");
    }


    public String toString(){
      //  System.out.println("Cup >> "+ brand + " is the brand");
        return "I_I)";
    }
    public void run(){
        System.out.println("RUN");
    }



}
