package dp.creational.singleton;

//Classical single implementation

/**
 * Lazy Loading and Concurrency resolved by synchronized keyword
 */
public class SingletonLazyConcurrent {

	private static volatile SingletonLazyConcurrent instance;

	private SingletonLazyConcurrent() {
	}

	public static SingletonLazyConcurrent getInstance() {
		if (null == instance) {
			synchronized (SingletonLazyConcurrent.class) { // Thread safe lazy initialization
				if (null == instance) {
					instance = new SingletonLazyConcurrent();
				}
			}
		}
		return instance;
	}

	public static synchronized SingletonLazyConcurrent getInstanceSynchronized() {
		if (null == instance) {
			instance = new SingletonLazyConcurrent();
		}
		return instance;
	}
}


