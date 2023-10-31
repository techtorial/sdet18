package mapPractice;

import java.util.Random;

public class Employee {

   // -id, city, name, age

    int id, age;
    String city,name;

    public Employee( int age, String city, String name) {
        this.id = idGenerator();
        this.age = age;
        this.city = city;
        this.name = name;
    }

    // method will give id for employee
    public static  int idGenerator(){
        return  new Random().nextInt(200);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    //    public static void main(String[] args) {
//        System.out.println(idGenerator());
//    }
}
