package objectMethodPractice;

public class TestEmployee {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        System.out.println("===============");

        System.out.println(    employee1 == employee2  ); //F
        System.out.println(    employee1.equals(employee2) ); // F

        employee3 = employee1;
        System.out.println( employee1 == employee3);// T
        System.out.println( employee1.equals(employee3));//

        System.out.println("===============");
        System.out.println( employee1);
        employee3 = new Employee();

        employee1 = null;

        System.out.println( employee1 == employee2); //

        System.gc();





    }
}
