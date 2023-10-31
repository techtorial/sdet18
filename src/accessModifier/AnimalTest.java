package accessModifier;

public class AnimalTest {

    public Integer i;

   public  Animal a;
    private AnimalTest(){}

    public static void main(String[] args) {

        Animal animal = new Animal();
         int a = 4;

        animal.colorProtected = "Brown";
        animal.speakProtected();

        animal.ageDefault = 9;
        animal.eatDefault();
        animal.setGenderPrivate("F");

        AnimalTest at = new AnimalTest();



    }


}
