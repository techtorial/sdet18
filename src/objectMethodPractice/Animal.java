package objectMethodPractice;

public class Animal {


    public String color;
    String name;
    int numberOfLegs;
    int age;
    char gender;
    int energyLevel;

    public void sleep(){

        energyLevel = 100;
        System.out.println(name + " is sleeping and energy level is "+ energyLevel);
    }



    /*
    for every move, animal should lose 10 calories from its energy level
     */

    public void move() {
        energyLevel = energyLevel - 10;
        System.out.println(name + " is moving");
        System.out.println("Energy level for "+name+" is now: "+energyLevel);

    }
    /*
create makeNoise method in the animal class
call this method with a new object in the test class, do not  use cat or dog
this method should tell who is making noise
	and  should tell it's gender
     */
    public void makeNoise(){
        System.out.println( name + " is making noise. " +
                "\nGender of "+name+" is: "+gender);
    }

    // create a method to print all features of animal
    // call your new method in the test2 class

    public void animalFeatures(){

        System.out.println( "Name: "+ name + " Color: "+color + " Age "+age
        +numberOfLegs+ gender);
    }


}
