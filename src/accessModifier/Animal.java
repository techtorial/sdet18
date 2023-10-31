package accessModifier;

public class Animal {
    // Public -- Protected -- Default -- Private

    public  String namePublic;
    protected String colorProtected;
    int ageDefault;
    private  String genderPrivate;

    public Animal(){}


    // create a method to assign a value to gender
    public  void setGenderPrivate(String gender){
       genderPrivate = gender;
    }


    public void runPublic(){
        System.out.println("Animal is Running");
    }

    protected void speakProtected(){
        System.out.println("Animal is speaking");
    }
    void eatDefault(){
        System.out.println("Animal is eating" + ageDefault);
    }

    private void sleepPrivate(){
        System.out.println(namePublic + "Animal is sleeping" + genderPrivate);
    }


}
