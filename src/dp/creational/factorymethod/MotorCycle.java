package dp.creational.factorymethod;

public class MotorCycle implements Vehicle {

	protected MotorCycle() {
	}

	@Override
	public void configuration() {
		System.out.println("This is Motorcycle with two cylinder engine and two tyres.");
	}

}
