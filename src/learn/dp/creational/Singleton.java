package learn.dp.creational;

//Classical single implementation
public class Singleton {

	private static volatile Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (null == instance) {
			synchronized (Singleton.class) { // Thread safe lazy initialization
				if (null == instance) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}


// Singleton using enum
enum SingletonEnum {

	INSTANCE;

	private SingletonEnum() {
	}

	public void performOperation() {
		System.out.println("Do Something!!!");
	}
}


// Singleton Using Inner classes. This is both lazy load and thread safe without hassle of volatile and synchronized keywords.

class SingletonInnerClass{
	private SingletonInnerClass(){
	}
	
	private static class SingletonInstanceHolder{
		private static final SingletonInnerClass INSTANCE = new SingletonInnerClass();
	}
	
	public SingletonInnerClass getInstance() {
		return SingletonInstanceHolder.INSTANCE;
	}
}



