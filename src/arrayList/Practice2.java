package arrayList;

import java.util.ArrayList;

public class Practice2 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();

        // add 5 colors to this array list and print out each color by making it uppercase letter
        // use for each loop for your solution

        colors.add("Red");
        colors.add("Green");
        colors.add("Red");
        colors.add("Black");
        colors.add("gray");

        for (String color : colors) {

            System.out.println(color.toUpperCase());

        }

        // use for loop to print each color starting from last to fist element
        // by adding 2 stars at the beginning and end of the color
        // and make uppercase >> **GRAY**   **BLACK** ,,, **RED**

        for (int i = colors.size() - 1; i >= 0; i--) {

            System.out.println("**" + colors.get(i).toUpperCase() + "**");

        }
        //=========================
        /*
        add
        size
        get
         */
        //remove()
        System.out.println(colors);
        colors.remove("gray");
        System.out.println(colors);
        colors.remove(1);
        System.out.println(colors);
        System.out.println(colors.size());
        // addAll();

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("orange");

        colors.addAll(fruits); // adding fruits arraylist to the colors arraylist
        System.out.println(colors);
        System.out.println(colors.get(3));//apple
        System.out.println(colors.get(4));// orange

        //removeAll()

        // colors.removeAll(colors);
        colors.removeAll(fruits);
        System.out.println(colors);

        // clear()
        colors.clear();
        System.out.println(colors);

        //contains, isEmpty
        System.out.println(colors.contains("Black"));
        colors.add("Black");
        System.out.println(colors.contains("Black"));

        System.out.println(colors.isEmpty());


        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Cuba");
        cities.add("Miami");
        cities.add("Chad");

        Practice2 obj = new Practice2();

        obj.printCities(cities);

        System.out.println(  findReturnShortCities(cities) );;


    }

    // create a method that will take arraylist of Strings as parameter
    // it will print out strings which only has 5 letters or more
    // ["Chicago", "Denver","Miami", Cuba,... ]

    public void printCities(ArrayList<String> cities) {

        for (String city : cities) {

            if (city.length() >= 5) {
                System.out.println("This city has 5 or more letters: " + city);
            }
        }


    }

    // create a method to return cities with short name in a new ArrayList
    public static ArrayList<String> findReturnShortCities(ArrayList<String> cities){
        ArrayList<String> shortCities = new ArrayList<>();
        for (String city:cities){
            if (city.length() < 5){
                shortCities.add(city);
            }
        }
        return shortCities;

    }


}
