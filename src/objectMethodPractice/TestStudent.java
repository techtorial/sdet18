package objectMethodPractice;

public class TestStudent {
    public static void main(String[] args) {

        Student student = new Student();
        student.name = "John";
        student.id = 1;
        student.address = "123 S Main st";

        student.study();
        student.study(6);
        student.sleep();
        System.out.println("========");
        student.workout();

        student.hourGenerator();

    }
}
