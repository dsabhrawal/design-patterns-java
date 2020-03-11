package dp.creational.abstractfactory;

public class AbstractFactoryClient {

	public static void main(String[] args) {

		
		Chair modernChair = FurnitureFactory.getInstance(FurnitureType.MODERN).createChair();
		modernChair.design();
		Sofa modernSofa = FurnitureFactory.getInstance(FurnitureType.MODERN).createSofa();
		modernSofa.design();
		CoffeeTable modernCoffeeTable = FurnitureFactory.getInstance(FurnitureType.MODERN).createCoffeeTable();
		modernCoffeeTable.design();
		
		Chair victorianChair = FurnitureFactory.getInstance(FurnitureType.VICTORIAN).createChair();
		victorianChair.design();
		Sofa victorianSofa = FurnitureFactory.getInstance(FurnitureType.VICTORIAN).createSofa();
		victorianSofa.design();
		CoffeeTable victorianCoffeeTable = FurnitureFactory.getInstance(FurnitureType.VICTORIAN).createCoffeeTable();
		victorianCoffeeTable.design();
		
		TvTable tvTable = FurnitureFactory.getInstance(FurnitureType.MODERN).createTvTable();
		tvTable.design();
	}

}
