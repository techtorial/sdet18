package OOP_Practice.Abstraction1.abstractClass1;

import accessModifier.Animal;

public class StudentTest {
    public static void main(String[] args) {
        // you cannot create object from abstract class
        // below object creation will not work.

        //  Student student = new Student();

        CampusStudent campusStudent = new CampusStudent("NAIL","abcd ln");
        campusStudent.study(5);
        campusStudent.attend();
        campusStudent.payAttention();
        campusStudent.name = "John";
        System.out.println("Campus student name is: " + campusStudent.name);
        System.out.println("----------------------");

        OnlineStudent onlineStudent = new OnlineStudent("Sedep","FL");
        onlineStudent.study(10);
        onlineStudent.attend();
        onlineStudent.payAttention();
        onlineStudent.address = "123 Main st.";
        System.out.println(onlineStudent.address);
        System.out.println("----------------------");

       // SelfLearner selfLearner = new SelfLearner();

        System.out.println("----------------------");

        Alex alex = new Alex("Alex","100 N Ave");
        alex.eat();
        alex.payAttention();
        alex.study(12);
        alex.goLibrary();
        alex.makeOwnSchedule();
        System.out.println("----------------------");

        Student student = new Alex("Alex1", "WI");

        Student student1 = new OnlineStudent("Almaz", "Ch");


    }
}
