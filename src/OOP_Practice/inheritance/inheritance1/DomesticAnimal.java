package OOP_Practice.inheritance.inheritance1;

public class DomesticAnimal extends Animal {

    @Override
    public void eat() {
        System.out.println(name + "  Domestic Animal is eating");
    }

    int run(){
        System.out.println("Domestic is running");
        return 3;
    }

    public Object play(){
        System.out.println("Playing Domestically");
        return 7;
    }

    public Animal sing(){
        System.out.println("Domestic is singing a song");
        return  new Animal();
    }

    public void jump(String location){

        System.out.println("Domestic is jumping at "+location);
    }

}
