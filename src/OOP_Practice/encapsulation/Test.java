package OOP_Practice.encapsulation;

public class Test {


    public static void main(String[] args) {

        City city = new City();

       // city.setPopulation(300);

        long p = city.getPopulation();
        System.out.println(  p );

        //city.population  >> since the field population is
        // declared as private, object cannot access it directly

        System.out.println("******************");

        Phone phone = new Phone();
        System.out.println( phone.getBrand());
        System.out.println( phone.getPrice());


    }
}
