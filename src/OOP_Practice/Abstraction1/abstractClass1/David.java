package OOP_Practice.Abstraction1.abstractClass1;

public abstract  class David extends OnlineStudent {

    public David(String name, String address){
        super(name, address);
    }

    public abstract void  workOut();

    public void run(){
        System.out.println("David is running at trails");
    }
}
