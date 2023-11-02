package JavaRecap.OOP;

public class Encapsulation {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is encapsulation and why do you use it ?

    Encapsulation is a way to make your data not accessible and manipulable by anyone
    -->it is a way to limit the users to reach out the class data
    -->It is a way of restriction the data from the user/classes
    -->It is a way to hide the data from classes/users
    -->It is a way to protect your data from other classes/users

    2-How can you access the data from encapsulation?

     -->You can access the data by using "GETTERS AND SETTERS"

    3-What key word do you use to encapsulate the data?

     Of course, I use private keyword to encapsulate the data.
     */

    public static void main(String[] args) {
        EncapsulationPractice encapsulationPractice=new EncapsulationPractice();
        System.out.println(encapsulationPractice.getName());
        encapsulationPractice.setName("Mehmet");
        System.out.println(encapsulationPractice.getName());


    }
}
