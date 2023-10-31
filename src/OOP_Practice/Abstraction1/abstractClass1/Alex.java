package OOP_Practice.Abstraction1.abstractClass1;

public class Alex extends SelfLearner{

    public Alex(String name, String address){
        super(name, address);
    }

    public void goLibrary(){
        System.out.println("ALex is at public library");
    }

    public void makeOwnSchedule(){
        System.out.println("Alex is making his own schedule");
    }

    public int study(int hour){
        System.out.println("Alex is studying");
        return hour * 100;
    }
}
