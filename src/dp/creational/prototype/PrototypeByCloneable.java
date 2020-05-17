package dp.creational.prototype;

public class PrototypeByCloneable{
	public static void main(String[] args) throws CloneNotSupportedException {

		//Without clone every time constructor is called to initialize board with same values.
		Board board = new Board(10, 10, new Color("RED"));
		Board board1 = board.clone();
		board1.setColor(new Color("GREEN"));

		System.out.println(board);
		System.out.println(board1);
	}
}
class Board implements Cloneable{

	private int length;
	private int height;
	private Color color;
	
	public Board(int length, int height, Color color) {
		System.out.println("Initializing Board...");
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

	public void setColor(Color color){
		this.color = color;
	}

}

class Color implements Cloneable{
	private String color;
	Color(String color){
		this.color = color;
	}
	private String getColor(){
		return this.color;
	}

	public Object clone() throws CloneNotSupportedException {
		Color color = new Color(this.color);
		return color;
	}
	public String toString(){
		return this.color;
	}
}