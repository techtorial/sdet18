package OOP_Practice.inheritance.inheritance1;

public class Zoo {

    public static void main(String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.name);// null
        animal.name = "ANIMAL";
        System.out.println(animal.name);// ANIMAL

        WildAnimal wild = new WildAnimal();
        System.out.println(wild.name); // null

        System.out.println("------******------");
        Tiger tiger = new Tiger();
        System.out.println(tiger.name);
        tiger.name = "LEO";
        System.out.println(tiger.name);
        Tiger tiger1 = new Tiger();
        System.out.println(tiger1.name);

        Cat cat = new Cat();
        System.out.println("------******------");

        animal.eat();
        wild.eat();
        tiger.eat();
        cat.eat();
        tiger1.eat();
        System.out.println("------");
        DomesticAnimal domestic = new DomesticAnimal();
        domestic.name = "SIMBA domestic";
        domestic.eat();
        System.out.println("=======");
        cat.eat();
        cat.name = "TOM";
        cat.eat();
        System.out.println("===******====");

        cat.jump("bed");
        domestic.jump("HOME");

    }
}
