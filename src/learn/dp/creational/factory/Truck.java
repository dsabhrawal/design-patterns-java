package learn.dp.creational.factory;

public class Truck implements Vehicle{

	private EngineFactory engineFactory;
	protected Truck(EngineFactory engineFactory) {
		this.engineFactory = engineFactory;
	}
	@Override
	public void create() {
		Engine engine = engineFactory.getEngine(EngineType.SIX_CYLINDER);
		engine.createEngine();
		System.out.println("This vehicle is Truck");
	}

}
