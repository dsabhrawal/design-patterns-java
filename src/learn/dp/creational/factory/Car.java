package learn.dp.creational.factory;

public class Car implements Vehicle{

	private EngineFactory engineFactory;
	
	protected Car(EngineFactory engineFactory) {
		this.engineFactory = engineFactory;
	}
	
	@Override
	public void create() {
		Engine engine = engineFactory.getEngine(EngineType.FOUR_CYLINDER);
		engine.createEngine();
		System.out.println("This vehicle is Car");
	}
}
