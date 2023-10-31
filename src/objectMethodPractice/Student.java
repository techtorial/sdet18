package objectMethodPractice;

import java.util.Random;

public class Student {

    String name, address;
    int id;



    public void study() {

        System.out.println(name + " studies 5 hours");
    }

    public void study(int hours) {

        System.out.println(name + " studies " + hours + " hours");
    }
    public void sleep(){

        System.out.println(name + " is sleeping for " + hourGenerator() +" hrs");

    }
    public  void workout(){
        System.out.println(name +" is working out for " + hourGenerator() +" hrs ");
    }

    public int hourGenerator(){

        Random random = new Random();
       int number =  random.nextInt(10);

        return number;
    }



}
