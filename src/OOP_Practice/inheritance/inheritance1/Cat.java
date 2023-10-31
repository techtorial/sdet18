package OOP_Practice.inheritance.inheritance1;

public class Cat extends  DomesticAnimal{


        //method overriding
    @Override
   public  void eat(){

        System.out.println("This is eat method in CAT class");

    }

    @Override
    protected int run(){
        System.out.println("Cat is running");
        return 1;
    }

    public String play(){
        System.out.println("Cat is playing");
        return ""+12;
    }

    @Override
    public WildAnimal sing(){
        System.out.println("Cat is singing song at HOME");
        return new WildAnimal();
    }

    public void jump(String place){
        System.out.println("Cat is so happy to Jump");
    }

}
