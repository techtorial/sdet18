package JavaRecap;

public class Constructor {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is constructor what do you with it?
      -->It is a way to initiliaze instance variable
      -->It is a way to assign value for object features

    2-Can you tell me the difference between Constructor and Methods?

     CONSTRUCTOR:                                       METHODS:
     1-NO RETURN TYPE                                   1-It must have return type(String,int,void)
     2-It MUST have same name of the class              2-It may or not have same name of the class

    3-Can you make constructor private,static,final?
      SHOW OFF YOURSELF: You cannot make the constructor static and final BUT you can make it private
      -->Singleton Pattern Design(WebDriver) -->AUTOMATION

    4-What is the difference between this,this(),super,super()?
      this    --> is a keyword which refers to instance variables/methods of the class
      this()  -->is a constructor which refers to the constructor of the class.(SAME CLASS)
      super   -->is a keyword which refers to instance variables/methods of the "PARENT" CLASS
      super() -->is a constructor which refers to the Parent Constructor of the class.

     */
    String brand;
    int door;
    double price=400000;
    boolean carFaxClean=false;
    String color;

    public Constructor(String brand) {
        this.brand = brand;
    }

    public Constructor(int door, String color) {
        this("Porshe");
        this.door = door;
        this.color = color;
    }

    public static void main(String[] args) {
        Constructor constructor=new Constructor(4,"Green");
        System.out.println(constructor.door);
        System.out.println(constructor.color);
        System.out.println(constructor.brand);
    }
}
