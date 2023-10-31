package wrapperClasses;

import accessModifier.Animal;

public class Microphone {

    String brand, color, price;

    public Microphone(String brand, String color, String price) {
        this.brand = brand;
        this.color = color;
        this.price = price;

        Animal animal = new Animal();
        animal.runPublic();

    }

    @Override
    public String toString() {
        return "Microphone{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public static void  priceChecker(Microphone[] box ){
        double cheapest = Double.parseDouble(box[0].price);
        for (int i= 0; i< box.length; i++){

            if ( Double.parseDouble(box[i].price) < cheapest ){
                cheapest = Double.parseDouble(box[i].price);
            }
        }
        System.out.println("Found it !! "+cheapest);

        for (int i =0; i< box.length; i++){

            if (cheapest == Double.parseDouble(box[i].price) ){
                System.out.println(box[i]);
            }

        }
    }

    public static void main(String[] args) {

        Microphone m1 = new Microphone("A", "White","10");
        Microphone m2 = new Microphone("B", "Blue","100");
        Microphone m3 = new Microphone("c", "Red","20");
        Microphone m4 = new Microphone("D", "Black","1.99");

        Microphone[] mics = {m1,m2,m3,m4};
        priceChecker(mics);

    }
}
