package mapPractice;

import java.util.Collection;
import java.util.HashMap;

public class TestEmployee {

    public static void main(String[] args) {

        HashMap<Integer, Employee> employeeMap = new HashMap();

        Employee employee1 = new Employee(21, "Chicago", "Jake");
        Employee employee2 = new Employee(22, "Dallas", "Diana");
        Employee employee3 = new Employee(23, "Denver", "MJ");

        employeeMap.put(employee1.id, employee1);
        employeeMap.put(employee2.id, employee2);
        employeeMap.put(employee3.id, employee3);

        System.out.println(employeeMap);

        Collection<Employee> emps = employeeMap.values();

        for (Employee e : emps) {
            if (e.city.equals("Chicago")) {
                System.out.println("Hi " + e.name);
            } else {
                System.out.println("Bye " + e.name);
            }
        }

        int numberOfCount = findingOlderEmployees(employeeMap);
        System.out.println(numberOfCount);
    }

    // create a method to find out how many employees from a map are age of 22 and grater than age of 22
    // return that number

    public static int findingOlderEmployees(HashMap<Integer, Employee> employeeMap) {

        Collection<Employee> employees = employeeMap.values();
        int count = 0;
        for (Employee employee : employees) {

            if (employee.age >= 22) {
                count++;
            }
        }
        return count;
    }


}
