package JavaRecap;

public class StaticInstancePractice {
 static int familyAccount=10000;
 int personalAccount=1000;
    public void run(){
        System.out.println("I am running");
    }

    public void shopping(){
      personalAccount-=100;
      familyAccount-=100;
    }

    public static void walk(){
        System.out.println("I am walking");
    }
    {
        System.out.println("I am an instance block");
    }

    static {
        System.out.println("Welcome to America");
    }

}
