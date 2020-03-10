package learn.dp.creational;

public class Builder {

	public static void main(String[] args) {

		Coffee coffee = new Coffee.CoffeeBuilder().name("My Coffee").milk("With Milk").sugar("No Sugar").build();
		System.out.println(coffee);
	}

}

class Coffee {

	private String name;
	private String sugar;
	private String milk;

	public String getName() {
		return this.name;
	}

	public String getSugar() {
		return this.sugar;
	}

	public String getMilk() {
		return this.milk;
	}

	private Coffee(CoffeeBuilder builder) {
		this.name = builder.name;
		this.sugar = builder.sugar;
		this.milk = builder.milk;
	}
	
	public String toString() {
		return String.format("Name=%s | Sugar=%s | Milk=%s", this.name, this.sugar, this.milk);
	}

	static class CoffeeBuilder {
		private String name;
		private String sugar;
		private String milk;

		public CoffeeBuilder name(String name) {
			this.name = name;
			return this;
		}

		public CoffeeBuilder sugar(String sugar) {
			this.sugar = sugar;
			return this;
		}

		public CoffeeBuilder milk(String milk) {
			this.milk = milk;
			return this;
		}

		public Coffee build() {
			return new Coffee(this);
		}
	}

}
