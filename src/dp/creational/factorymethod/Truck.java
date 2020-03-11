package dp.creational.factorymethod;

public class Truck implements Vehicle{

	protected Truck() {
	}
	@Override
	public void configuration() {
		System.out.println("This is Truck with six cylinder engine and ten tyres.");
	}

}
