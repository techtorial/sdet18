package OOP_Practice.Abstraction1.abstractClass1;

public abstract  class Student {

    String address;
    String name;

    public Student(String name, String address){
        this.name = name;
        this.address = address;
    }

    public void payAttention(){
        System.out.println("Please have constant attention as a Student ");
    }


    public abstract void attend();


    public abstract  int study(int hours);




}
