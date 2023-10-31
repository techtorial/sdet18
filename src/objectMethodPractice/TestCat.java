package objectMethodPractice;

public class TestCat {





    public static void main(String[] args) {

         Cat cat = new Cat();

        cat.name = "TOM";
        cat.foodAmount = 20;

        cat.run("Up stairs");

        System.out.println(cat.color);// WHITE
        Cat c2 = new Cat();
        System.out.println(c2.color);// WHITE
        c2.color = "Brown";
        System.out.println( c2.color);

        cat.setFoodAmount(55);
        System.out.println(cat.foodAmount);// 55
        System.out.println(cat.getFoodAmount());// 55

    }
}
