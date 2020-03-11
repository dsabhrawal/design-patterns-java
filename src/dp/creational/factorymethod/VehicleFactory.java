package dp.creational.factorymethod;

public class VehicleFactory {

	private VehicleFactory() {
	}
	
	private static class VehicleFactoryInstanceHolder {
		private static final VehicleFactory INSTANCE = new VehicleFactory();
	}

	public static VehicleFactory getInstance() {
		return VehicleFactoryInstanceHolder.INSTANCE;
	}

	public Vehicle getVehicle(VehicleType vehicleType) {
		Vehicle vehicle = null;
		switch (vehicleType) {
		case CAR:
			vehicle = new Car();
			break;
		case MOTORCYCLE:
			vehicle = new MotorCycle();
			break;
		case TRUCK:
			vehicle = new Truck();
			break;
		default:
			System.out.println("Unsupported vehicle type "+vehicleType);
		}
		
		return vehicle;
	}
}
