package setPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Flower {

    // type, size(small/medium/large), price, color

    String type, size, color;
    Double price;

    public Flower(String type, String size, String color, Double price) {
        this.type = type;

        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") ||
                        size.equalsIgnoreCase("large") ){
            this.size = size;
        }else {
            this.size = "SMALL";
        }

        this.color = color;
        this.price = price;
    }


    public static void main(String[] args) {

        Flower flower1 = new Flower("rose", "Techtorial", "red", 3.99);
        Flower flower2 = new Flower("rose", "large", "Yellow", 2.99);
        Flower flower3 = new Flower("Sun Flower", "medium", "red", 4.99);
        Flower flower4 = new Flower("Daisy", "small", "red", 6.50);

        HashSet<Flower> vase = new HashSet<>();
        vase.add(flower1);
        vase.add(flower2);
        vase.add(flower3);
        vase.add(flower4);

        for ( Flower fl : vase){
            if (fl.color.equalsIgnoreCase("RED")){
                System.out.println(fl.type +" -- " + fl.color +" -- "+ fl.price +" --- "+fl.size);
            }
        }

         List<Flower>  filteredFlowerList =  filterFlower(vase);

        System.out.println( filteredFlowerList);



    }

    // create a method that will take set of flowers
    // this method will return list of flowers if the flower is:
        // color is 'red' and the price is in the rage of $2 and $5

    public static List<Flower> filterFlower(HashSet<Flower> flowerHashSet){
        List<Flower> bucket = new ArrayList<>();
        for (Flower flower : flowerHashSet ){

            if ( flower.color.equalsIgnoreCase("RED") && ( flower.price >2 && flower.price <5 ) ){

                bucket.add(flower);
            }
        }
       return bucket;

    }


    @Override
    public String toString() {
        return "Flower{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
