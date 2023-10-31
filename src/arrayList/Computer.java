package arrayList;

import java.util.ArrayList;

public  class Computer {

    //make, model, price and screensize
    String make;
    String model;
    Integer price;
    Double screenSize;

    public Computer(String make, String model, Integer price, Double screenSize) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                '}';
    }

     public void productFinder(ArrayList<Computer> computers, String lookingForBrand ){

        for ( Computer device  : computers){

           if (  device.make.equalsIgnoreCase(lookingForBrand)){
               System.out.println( "we have "+ lookingForBrand +" - "+ device.model);

           }else {
               System.out.println("Sorry!, we do not have "+lookingForBrand);
               break;
           }

        }


    }
    // create a new method to
    // find total price of Apple devices and tell me how many of Apple products you have

    public  static int productPriceTotal(ArrayList<Computer> computers, String lookingForBrand){

        int total =0, counter = 0;

        for ( Computer device: computers){

            if (device.make.equalsIgnoreCase(lookingForBrand)){

                total += device.price;

                counter++;
            }
        }
        System.out.println("Total price is: "+total);
        System.out.println("We have "+counter+" of "+lookingForBrand);
        return total;


    }




}
