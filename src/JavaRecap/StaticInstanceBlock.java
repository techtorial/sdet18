package JavaRecap;

public class StaticInstanceBlock {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is static as a keyword and why do you use it ?
    it is a way to make the methods accessible "WITHOUT CREATING AN OBJECT" from that class.
    -->What is the disadvantage of using static
      ->You cannot OVERRIDE STATIC METHODS
      ->You will have slow process because of Synchronization
    2-What is static block?
     It is a block that can be called once (ONE TIME IT WORKS) and IT COMES FIRST

      static{"WELCOME TO BANK OF AMERICA ATM"}

    3-What is static as a variable keyword?
       Static as a variable is really useful for Common shared data
       -->It makes the variable belongs to the class
       -->It is sharable(common for all objects)
       -->It can be accessed from other class with the name of class like static methods.

    4-What is instance block?

      it is a block that runs "AS MANY AS" objects you have.

     */
    public static void main(String[] args) {
        StaticInstancePractice.walk();
        StaticInstancePractice staticInstancePractice=new StaticInstancePractice();
        staticInstancePractice.shopping();//-100 --> 9900 family personal-->900
        System.out.println(staticInstancePractice.personalAccount);
        System.out.println(StaticInstancePractice.familyAccount);

        StaticInstancePractice bank=new StaticInstancePractice();
        bank.shopping();

        System.out.println(bank.personalAccount); //900-->
        System.out.println(StaticInstancePractice.familyAccount);//9900 9800
        bank.run();


    }
}
