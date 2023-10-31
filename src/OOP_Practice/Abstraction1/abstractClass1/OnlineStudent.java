package OOP_Practice.Abstraction1.abstractClass1;

public class OnlineStudent extends Student{

    public OnlineStudent(String name, String address){
        super(name,address);
    }

    @Override
    public void attend() {
        System.out.println("Online student is attending via zoom call");
    }

    @Override
    public int study(int hours) {
        System.out.println("Online student study at HOME");
        return 24;
    }
}

