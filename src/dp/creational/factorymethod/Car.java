package dp.creational.factorymethod;

public class Car implements Vehicle{

	protected Car() {
	}
	
	@Override
	public void configuration() {
		System.out.println("This is Car with four cylinder engine and four tyres.");
	}
}
