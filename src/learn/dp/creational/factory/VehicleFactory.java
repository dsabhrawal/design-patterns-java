package learn.dp.creational.factory;

public class VehicleFactory {

	private VehicleFactory() {
	}
	
	private static EngineFactory engineFactory = EngineFactory.getInstance();
	
	private static class VehicleFactoryHolder {
		private static final VehicleFactory INSTANCE = new VehicleFactory();
	}

	public static VehicleFactory getInstance() {
		return VehicleFactoryHolder.INSTANCE;
	}

	public Vehicle getVehicle(String vehicleType) {
		Vehicle vehicle = null;
		switch (vehicleType) {
		case "CAR":
			vehicle = new Car(engineFactory);
			break;
		case "BIKE":
			vehicle = new MotorCycle(engineFactory);
			break;
		case "TRUCK":
			vehicle = new Truck(engineFactory);
			break;
		default:
			System.out.println("Unsupported vehicle type "+vehicleType);
		}
		
		return vehicle;
	}
}
