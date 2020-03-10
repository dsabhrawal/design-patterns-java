package learn.dp.creational.factory;

public class EngineFactory {

	private EngineFactory() {
	}
	
	private static class EngineFactoryHolder{
		private static EngineFactory INSTANCE = new EngineFactory();
	}
	
	public static EngineFactory getInstance() {
		return EngineFactoryHolder.INSTANCE;
	}
	
	public Engine getEngine(EngineType engineType) {
		Engine engine = null;
		switch(engineType) {
		case TWO_CYLINDER:
			engine = new TwoCylinderEngine();
			break;
		case FOUR_CYLINDER:
			engine = new FourCylinderEngine();
			break;
		case SIX_CYLINDER:
			engine = new SixCylinderEngine();
			break;
		}
		return engine;
	}
}
