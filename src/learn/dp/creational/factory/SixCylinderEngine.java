package learn.dp.creational.factory;

public class SixCylinderEngine implements Engine{

	protected SixCylinderEngine() {
	}
	
	@Override
	public void createEngine() {
		System.out.println("Creating Six Cylinder Engine");
	}

}
