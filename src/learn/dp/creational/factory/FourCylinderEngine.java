package learn.dp.creational.factory;

public class FourCylinderEngine implements Engine{

	protected FourCylinderEngine() {
	}
	
	@Override
	public void createEngine() {
		System.out.println("Creating Four Cylinder Engine");
	}

}
