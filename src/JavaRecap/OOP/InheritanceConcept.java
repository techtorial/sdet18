package JavaRecap.OOP;

public class InheritanceConcept {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What do you know about inheritance? How do you inherit two classes?

     It is a way to make a connection(relationship) between parent to child(one class to another)
     -->EXTENDS keyword will make a connection with two classes
     -->IMPLEMENTS keyword (interface,class)

    2-Why do you use inheritance in your project?
     -->There will be less amount of code to be executed
     -->It will help you to reduce the amount of time for execution
     -->It will be more safe and efficient to maintain
     -->It will look more professional
     */
    public static void main(String[] args) {
        Porsche porsche=new Porsche();
        System.out.println(porsche.brand);
        Ferrari ferrari=new Ferrari();
        ferrari.price=25235.32;
        System.out.println(ferrari.price);
    }



}
