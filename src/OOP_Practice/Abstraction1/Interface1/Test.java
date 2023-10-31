package OOP_Practice.Abstraction1.Interface1;

import OOP_Practice.Abstraction1.abstractClass1.CampusStudent;
import OOP_Practice.Abstraction1.abstractClass1.Student;
import accessModifier.Animal;

public class Test {

    public static void main(String[] args) {
        // you cannot create object from interface
        //CanFly canFly = new CanFly();
        // CanSwim canSwim = new CanSwim();

        Bird bird = new Bird("Tweeter", "444", "Blue",500);
        bird.fly();
        bird.landing();
        bird.migrate();
        System.out.println("--------");
        System.out.println(  bird.landing()   );
       // System.out.println( bird.fly() );
       // System.out.println(bird.migrate());
        System.out.println("--------");

        Fish fish = new Fish();
        fish.eat();
        fish.swim(50);

        System.out.println("-----------");

        Duck duck = new Duck();
        duck.fly();;
        duck.swim(2);
        duck.landing();

        System.out.println( duck.WINGS);
        System.out.println(duck.TAIL);
        System.out.println(duck.DEEP);

        // you cannot change value of final field
        // duck.TAIL = 2;

        System.out.println("==========");

        duck.namePublic = "HERO";
        duck.runPublic();
        duck.setGenderPrivate("M");
        System.out.println( duck );

        bird.printInfo();
        duck.printInfo();

        // you cannot reach out private methods
//        bird.run();
//        duck.run();

        System.out.println("==========");

        // reference data type is same as object data type
        Duck duck1 = new Duck();
        duck1.makeNoise();
        duck1.fly();

        // reference data type is parent class data type

        Animal duck2 = new Duck();
        ((Duck) duck2).fly();
        ((Duck)duck2).fly();

        ((Duck) duck2).landing();


        // reference data type is interface data type

        CanSwim duck3 = new Duck();

        CanFly duck4 = new Duck();

        duck4.fly();

        System.out.println("=======");

        Student student = new CampusStudent("Almaz", "123");

        ( (CampusStudent)student).makeCoffee();


    }
}
