package JavaRecap;

public class GarbageCollector {

    /*
    POSSIBLE INTERVIEW QUESTIONS:
    1-What is garbage collector and where is it coming from?
    It is a way to clean up useless/unused data from the memory.Otherwise, you will
    start seeing some memory low error on the bottom right screen.(it will make your system
    slow as well)
    -->It comes from System.gc()
    2-How can you prove that GC is working?
    To be able to prove that GC is working, we override finalize method from Object class.
    Object class is the parent of every class

    3-Do you have to call GC to clean up your memory?

     No, it works automatically.
     */


    @Override
    protected void finalize() throws Throwable {
        System.out.println("it works");
    }

    public static void main(String[] args) {
        GarbageCollector garbageCollector=new GarbageCollector();
        garbageCollector=null;
        System.gc();
    }

}
