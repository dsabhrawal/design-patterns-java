package learn.dp.creational.factory;

public class FactoryMethodMain {

	public static void main(String[] args) {

		Vehicle car = VehicleFactory.getInstance().getVehicle("CAR");
		car.create();
		Vehicle truck = VehicleFactory.getInstance().getVehicle("TRUCK");
		truck.create();
		Vehicle bike = VehicleFactory.getInstance().getVehicle("BIKE");
		bike.create();
	}

}
