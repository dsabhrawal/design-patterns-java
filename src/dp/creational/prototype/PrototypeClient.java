package dp.creational.prototype;

import java.util.Arrays;
import java.util.List;

public class PrototypeClient {

	public static void main(String[] args) throws CloneNotSupportedException {

		//Without clone every time constructor is called to initialize board with same values.
		Board board = new Board(10, 10, "RED");
		Board board1 = new Board(10, 10, "RED");
		Board board2 = new Board(10, 10, "RED");
		Board board3 = new Board(10, 10, "RED");
		Board board4 = new Board(10, 10, "RED");
		
		//No constructor called to initialize board with same values.
		Board board5 = board.clone();
		Board board6 = board.clone();
		Board board7 = board.clone();
		Board board8 = board.clone();
		Board board9 = board.clone();
		
		List<Board> boards = Arrays.asList(board,board1,board2,board3,board4,board5,board6,board7,board8,board9); 
		boards.forEach(System.out::println);
	}

}
