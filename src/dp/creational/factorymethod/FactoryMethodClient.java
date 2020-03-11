package dp.creational.factorymethod;

public class FactoryMethodClient {

	public static void main(String[] args) {

		Vehicle car = VehicleFactory.getInstance().getVehicle(VehicleType.CAR);
		car.configuration();
		Vehicle truck = VehicleFactory.getInstance().getVehicle(VehicleType.TRUCK);
		truck.configuration();
		Vehicle bike = VehicleFactory.getInstance().getVehicle(VehicleType.MOTORCYCLE);
		bike.configuration();
	}

}
