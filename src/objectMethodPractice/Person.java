package objectMethodPractice;

import java.time.LocalDateTime;

public class Person {

    // create a method that will calculate/find out age of a person
    // this method will return the age as int value
    // this method will  print the age as well
    // current year - birthYear >>> 2023 - 2000 >> 23


    public int ageCalculator() {
        int currentYear = 2023, birthYear = 2000;
        int age = currentYear - birthYear;

        System.out.println("The age is " + age);
        return age;
    }

    public int ageCalculator(int birthYear) {
        System.out.println("The age from 2. method is: " + (2023 - birthYear));
        return 2023 - birthYear;
    }

    public int ageCalculator(int birthYear, int currentYear){

        System.out.println(  "The age from 3. method is: "+(currentYear - birthYear));

        return currentYear - birthYear;
    }

    // overload this ageCalc method one more time to include name of the person
    // as a parameters
    // in your print include his/her name
    // return the age as long data type
    // call your method in the main to see how it works

    public long ageCalculator(String name, int birthYear){

        System.out.println(name +", your age is "+ (LocalDateTime.now().getYear() -birthYear));

    return LocalDateTime.now().getYear()-birthYear;
    }




public String toString(){
        return "*****";
}





    public static void main(String[] args) {
        Person person1 = new Person();

        System.out.println( person1);
        person1.ageCalculator();

        System.out.println("-------");

        person1.ageCalculator(1900);

        System.out.println("-------");

        person1.ageCalculator(2015, 2023);

        System.out.println("-------");
        person1.ageCalculator("John", 2010);
        System.out.println( LocalDateTime.now().getYear());
    }


}
