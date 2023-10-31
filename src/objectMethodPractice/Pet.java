package objectMethodPractice;

public class Pet {

    String name;
    String color;
    int age;
    static int foodAmount = 40;


    // create an 'feed' method
    // this method will reduce food amount by 1lbs for every call/usage
    // it will show final food amount
    public void feed() {
        foodAmount = foodAmount - 1;
        System.out.println(name + " is eating. Left over food now is: " + foodAmount);
    }


     static public  void makeNoise(){

        System.out.println("Pet is making Noise");
        Pet bobby = new Pet();
        bobby.feed();
    }

    public void  move(){
        System.out.println("Put is moving to Outdoor");
        makeNoise();
    }
    public static void sleep(){
        System.out.println("Pet is Sleeping");
        makeNoise();
    }


    public  Pet(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public  Pet(){}

    public static void main(String[] args) {

        Pet pet1 = new Pet();
        Pet pet2 = new Pet();

        pet1.name = "Tom";
        pet2.name = "Gregg";
        System.out.println(pet1.name); //Tom
        System.out.println(pet2.name);// Gregg

        pet1.name = "Jerry";
        System.out.println(pet1.name);//Jerry
        System.out.println(pet2.name);// Gregg

        System.out.println(pet1.foodAmount);//40
        System.out.println(pet2.foodAmount);//40
        pet1.foodAmount = 39;
        System.out.println("----------");
        System.out.println(pet2.foodAmount); // 39

        pet1.feed();// Jerry is getting food
        pet1.feed();
        System.out.println(pet2.foodAmount);

        //Pet.foodAmount >> you can use/reach out static foodAmount variable by using class name(Pet)
        System.out.println(Pet.foodAmount);

        System.out.println("----------");

        Pet p3 = new Pet();

        p3.makeNoise();// using/calling method with object
        Pet.makeNoise();//calling method with class name

        p3.move();
       Pet.makeNoise();

        System.out.println("-----");

        pet1.sleep();
        Pet.sleep();
    }


}
