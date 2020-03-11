package dp.creational.abstractfactory;

public interface FurnitureFactory {

	public abstract Chair createChair();
	public abstract Sofa createSofa();
	public abstract CoffeeTable createCoffeeTable();
	public default TvTable createTvTable() {
		System.out.println("I do not have Tv Table in this design.");
		return null;
	}
	
	public static FurnitureFactory getInstance(FurnitureType furnitureType) {
		FurnitureFactory factory = null;
		switch(furnitureType) {
		case MODERN:
			factory = new ModernFurnitureFactory();
			break;
		case VICTORIAN:
			factory = new VictorianFurnitureFactory();
			break;
		case ARTDECO:
			factory = new ArtDecoFurnitureFactory();
			break;
		default:
			System.out.println("Invalid Furniture Type: "+furnitureType);
		}
		return factory;
	}
}
