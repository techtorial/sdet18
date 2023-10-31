package accessModifier;

public class Deer extends Animal{

    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.speakProtected();
        animal.colorProtected = "Blue";

        Deer deer  = new Deer();
        deer.colorProtected = "Light brown";
        deer.speakProtected();
        deer.runPublic();
        deer.eatDefault();

        deer.ageDefault = 11;
        deer.setGenderPrivate("M");



    }
}
