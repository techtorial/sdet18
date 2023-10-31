package OOP_Practice.Abstraction1.abstractClass1;

public class CampusStudent extends Student {

    public CampusStudent(String name, String address){
        super(name, address);
    }

    public void attend(){
        System.out.println("Campus student is attending in the OFFICE");
    }

    public int study(int hours){
        System.out.println("Campus student study here in OFFICE");
        return hours *10;// returning amount of points
    }
    public void makeCoffee(){
        System.out.println("making coffee in the Office");
    }



}
