package OOP_Practice.inheritance.inheritance2;

public class Rose extends Flower{


    public Rose(){
        super("YELLOW", "FLOWER", 2.50, 5);

        System.out.println("This is Rose No Argument Constructor");
    }

    public Rose(String color, String name, double price, int size){

        super(color, name, price, size);



    }

}
