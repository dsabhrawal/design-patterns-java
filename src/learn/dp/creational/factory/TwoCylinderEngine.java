package learn.dp.creational.factory;

public class TwoCylinderEngine implements Engine{

	protected TwoCylinderEngine() {
	}
	
	@Override
	public void createEngine() {
		System.out.println("Creating Two Cylinder Engine");
	}

}
