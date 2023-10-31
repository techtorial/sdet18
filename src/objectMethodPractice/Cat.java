package objectMethodPractice;

public class Cat {
    String name, color = "WHITE";
    int age, foodAmount;

    public void run(String destination) {

        foodAmount -= 2;
        System.out.println(name + " is running to " + destination);
        System.out.println("Food amount is now: " + foodAmount);

    }

    // create a method to initialize food amount

    public void setFoodAmount(int foodAmount1) {

        foodAmount = foodAmount1;
    }

    public int getFoodAmount() {
        return foodAmount;
    }


}
