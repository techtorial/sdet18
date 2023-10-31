package objectMethodPractice;

public class Employee {

    String name;
    int id;
    String department;
    double salary;
    int experienceYear;

    // create a constructor to int id and department of employee

    public Employee(int id, String department, int experienceYear){
      //  this(); // calling no argument constructor

        this.experienceYear = experienceYear;
        if (experienceYear >=1){
            this.department = department;
        }else {
            this.department = "Training";
        }
        this.id = id;
        System.out.println("This is 3 arg Constructor");
    }
    public Employee(){
        this(77, "IT", 7);
        System.out.println("No argument Constructor");

    }

    public Employee(String name, int id, String department, double salary, int experienceYear) {
        this();

        this.name = name;
        this.id = id;
        this.department = department;
        this.salary = salary;
        this.experienceYear = experienceYear;
    }


  @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", experienceYear=" + experienceYear +
                '}';
    }

    protected void finalize(){
        System.out.println("FINALIZE");
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        System.out.println("*********");
        Employee e2 = new Employee(11, "Sales", 5);
        System.out.println("*********");

        // what is the department for each employee?
        //e1 > null , e2 >> training
//        System.out.println( e1.department );
//        System.out.println( e2.department );


    }
}
