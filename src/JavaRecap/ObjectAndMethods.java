package JavaRecap;

public class ObjectAndMethods {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What do you know about Object? can you tell me few methods that use?
        -->Always go with general description
        -->Object is a representation of the class(Human Class -->male,female)
          -->Methods are the behaviour of objects that gets actions(walk,run,speak)
        -->Object.equals()--->Make a comparison for Object
        -->Object.toString()-->It converts the type to String Object.
        -->Object.HashCode()-->It shows the location of the object.

    2-What is the difference between Object and Class?

       Object:                                                                     Class:
       1-Is a representation of class (Bird,Camry,Avalon)                       1-Is a blueprint/template of the object (Animal,Toyota,)
       2-Is declared as new                                                     2-Is declared as class

    3-How do you initialize the instance variables?
        There are few ways that we can initiliaze the instance variables
         -->Constructor
         -->Methods(getter and setter)
         -->Object
         -->Directly assign the value

    4-What is the difference between local and instance variable?
          Instance Variable:                                        Local Variable:
          1-Belongs to the class(can be accessed from everywhere    1-Belongs to the blocks( {} ) -->only from this block
          in class
          2-It has default values(null,0,0.0,false)                 2-It does not have default values,you need to initialize
          3-can have Access modifiers(public,private..)             3-It cannot have access modifiers
     */
   String name="Bank Of America";
    int age;
    String hairColor;
    double height;

    public ObjectAndMethods(int age){
      this.age=age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public int run(int speed1){

       return speed1;
    }

    public static void main(String[] args) {
        ObjectAndMethods male=new ObjectAndMethods(24);
        ObjectAndMethods female=new ObjectAndMethods(26);
        System.out.println(male.equals(female));
        System.out.println(male.hashCode());
        System.out.println(male.age);
        Integer number=4;
      //  System.out.println(number.);
        System.out.println(number.toString().concat("$"));
        System.out.println(String.valueOf(number).concat("$"));
        System.out.println(male.getHairColor());
        male.setHairColor("Black");
        System.out.println(male.getHairColor());
        female.height=5.7;
        System.out.println(female.height);
        System.out.println(male.name);
        male.name="Mehmet";
    }

}
