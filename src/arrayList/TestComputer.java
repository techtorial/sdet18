package arrayList;

import java.util.ArrayList;

public class TestComputer {

    public static void main(String[] args) {

        Computer c1 = new Computer("apple", "MacPro", 1500, 13.5);
        Computer c2 = new Computer("apple", "MacAir", 2000, 16.0);
        Computer c3 = new Computer("HP", "Envy", 1100, 15.0);


        ArrayList<Computer> listOfComputers = new ArrayList();

        listOfComputers.add(c1);
        listOfComputers.add(c2);
        listOfComputers.add(c3);
        System.out.println(listOfComputers);

        double total = 0;
        for (Computer device : listOfComputers) {

            total = total + device.price;

        }
        System.out.println("Total price of Computers is: $" + total);

        // Computer.productFinder(listOfComputers, "apple");
        System.out.println("=====");

        //  Computer.productFinder(listOfComputers, "HP");
        c1.productFinder(listOfComputers, "xz");
        Computer.productPriceTotal(listOfComputers, "apple");

    }


}
