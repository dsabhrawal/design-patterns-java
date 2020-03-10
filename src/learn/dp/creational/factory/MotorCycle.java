package learn.dp.creational.factory;

public class MotorCycle implements Vehicle{

	private EngineFactory engineFactory;
	protected MotorCycle(EngineFactory engineFactory) {
		this.engineFactory = engineFactory;
	}
	
	@Override
	public void create() {
		Engine engine = engineFactory.getEngine(EngineType.TWO_CYLINDER);
		engine.createEngine();
		System.out.println("This vehicle is Motorcycle");
	}

}
