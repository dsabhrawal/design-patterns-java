package dp.creational.prototype;

public class Board implements Cloneable{

	private int length;
	private int height;
	private String color;
	
	public Board(int length, int height, String color) {
		System.out.println("Initiliazing Board...");
		this.length = length;
		this.height = height;
		this.color = color;
	}
	
	public String toString() {
		return String.format("Length=%d, Height=%d, Color=%s", length, height, color);
	}
	
	public Board clone() throws CloneNotSupportedException {
		Board board = (Board) super.clone();
		return board;
	}
}
