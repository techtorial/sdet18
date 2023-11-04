package JavaRecap.OOP;

public class EncapsulationPractice {

    private String name="Ahmet";
    int age=31;
    long creditNumber= 131231232L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.startsWith("A")){
            this.name = name;
        }else{
            System.out.println("Your Data is not correct");
        }
    }
}
