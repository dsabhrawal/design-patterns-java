package dp.creational.singleton;

/**
 * BasicSingleton class specifies an example of a singleton class with very basic functionality.
 * Problems: Thread Safety, Lazy Loading, Reflection, Serialization
 *
 */
class BasicSingleton {

    private int value;
    private BasicSingleton(){
        System.out.println("BasicSingleton constructed...");
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance(){
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

public class BasicSingletonMain{
    public static void main(String[] args) {
        BasicSingleton singleton = BasicSingleton.getInstance();
        singleton.setValue(121);
        System.out.println(singleton.getValue());
    }
}
