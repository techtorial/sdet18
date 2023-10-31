package OOP_Practice.inheritance.finalPractice;

public class Shirt {

    // keyword 'final'

    String size;
    double price;
    final  String COLOR = "blue";
    String brand;

    public void setCOLOR(String color){
        //this.COLOR = color;
    }

    public void sale() {
        System.out.println("SHIRT is on SALE");
    }
    // == creating a final method ===
    final   public void wear(){
        System.out.println("Put the shirt on!!");
    }

    // attempt to overload Final wear method

    public void wear(String size){
        System.out.println("Try to put a larger size on!!");
    }




    public Shirt(){}

    public Shirt(String size, double price, String COLOR, String brand){
        this.size = size;
        this.price = price;
       /// this.COLOR = COLOR;
        this.brand = brand;

    }


}
