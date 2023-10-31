package wrapperClasses;

import accessModifier.Animal;
import accessModifier.Deer;

public class Squirrel extends Animal {

    public static void main(String[] args) {

        Deer deer = new Deer();

        Animal animal = new Animal();
        animal.runPublic();

        Squirrel squirrel = new Squirrel();
        squirrel.runPublic();
        squirrel.speakProtected();

        squirrel.setGenderPrivate("G");


    }





}
