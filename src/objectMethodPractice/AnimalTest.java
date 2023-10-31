package objectMethodPractice;

public class AnimalTest {
    public static void main(String[] args) {

        String str = new String();

        Animal cat = new Animal();
        System.out.println( cat.age ); // 0
        cat.age = 5;

        System.out.println( cat.age);// 5

        System.out.println(cat.color); //
        cat.color = "Orange";
        System.out.println(cat.color);
        System.out.println("==========");
        // create another object
        // initialize and show all properties for your new object

        Animal dog = new Animal();
        System.out.println( dog.age);// 0
        dog.numberOfLegs = 4;
        dog.age = 7;
        dog.color = "Brown";
        dog.name ="Bobby";
        dog.gender = 'M';
        System.out.println(dog.name);
        System.out.println(dog.numberOfLegs);
        System.out.println(dog.color);
        System.out.println(dog.gender);
        System.out.println(dog.age);


        // print >> "they are at the same age"
        // if the ages of animals are the same, print above message
        if ( cat.age == dog.age){
            System.out.println("they are at the same age");
        }
        System.out.println("********");

        cat.move();

        dog.move();

    Animal squarel = new Animal();
    squarel.name = "Funny";
    squarel.gender = 'F';
    squarel.makeNoise();



    }
}
