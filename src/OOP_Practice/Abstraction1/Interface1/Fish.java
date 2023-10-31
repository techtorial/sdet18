package OOP_Practice.Abstraction1.Interface1;

import java.util.List;

public class Fish implements  CanSwim{

    int gulls;
    String nameOfSea;

    @Override
    public void swim(int depth) {
        System.out.println("Fish swims in SEA");
    }

    public void eat(){
        System.out.println("Fish is eating plankton");
    }
}
