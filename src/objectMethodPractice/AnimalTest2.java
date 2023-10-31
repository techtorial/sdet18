package objectMethodPractice;

public class AnimalTest2 {
    public static void main(String[] args) {

        Animal bird = new Animal();
        bird.name = "tweeter";
        bird.color = "blue";
        bird.age = 7;
        bird.gender = 'M';
        bird.numberOfLegs = 2;
        bird.makeNoise();
        System.out.println("In the test2 class after making noise");

        // System.out.println(  bird.makeNoise()    );

        System.out.println(bird.name);
        System.out.println(bird.color);
        System.out.println(bird.age);
        System.out.println(bird.numberOfLegs);

        bird.animalFeatures();
        System.out.println("=======");
        bird.move();
        bird.energyLevel = 100;
        System.out.println(bird.energyLevel);
        bird.move();
        bird.move();
        // create an 'sleep' method
        // this method should print
        // "..name.. is sleeping and energy is 100%"
        // so, this method should update energy level of animal
        bird.sleep();
    }
}
