package dp.creational.singleton;

// Singleton using enum

/**
 * This solves problem of multi threaded environment and also reflection problem
 */
public enum SingletonEnum {

    INSTANCE;

    private SingletonEnum() {
    }

    public void performOperation() {
        System.out.println("Do Something!!!");
    }
}
