package OOP_Practice.Abstraction1.abstractClass1;

public abstract class SelfLearner extends  Student{

    public SelfLearner(String name, String address){
        super(name, address);
    }

    public abstract void goLibrary();

    public abstract  void makeOwnSchedule();

    public void eat(){
        System.out.println("SelfLearner is eating at CAFE");
    }

    @Override
    public void attend(){
        System.out.println("Self Learner attending Webinars");
    }

    @Override
    public void payAttention(){
        System.out.println("SelfLearner pays attention to when study");
    }

}
