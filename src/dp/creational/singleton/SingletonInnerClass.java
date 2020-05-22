package dp.creational.singleton;

/**
 * This is both Lazy loaded and Thread safe
 *Singleton Using Inner classes. This is both lazy load and thread safe without hassle of volatile and synchronized keywords.
 */
 class SingletonInnerClass{
    private SingletonInnerClass(){
    }

    private static class SingletonInstanceHolder{
        private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
    }

    public static SingletonInnerClass getInstance() {
        return SingletonInstanceHolder.INSTANCE;
    }
}
