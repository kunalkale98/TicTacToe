import java.util.Scanner;

class TicTacToe{

	public char[] createBoard(){
		char[] board = new char[10];
		for(int i=0; i<=9; i++){
			board[i] = ' ';
		}
		return board;
	}

	public char chooseInput(Scanner sc){
		System.out.print("Choose Your Letter X or O: ");
		char userLetter = sc.next().toUpperCase().charAt(0);
		return userLetter;
	}

	public void showBoard(char[] board){
		System.out.println(" "+board[1]+" | "+board[2]+" | "+board[3]+" ");
		System.out.println("-----------");
		System.out.println(" "+board[4]+" | "+board[5]+" | "+board[6]+" ");
		System.out.println("-----------");
		System.out.println(" "+board[7]+" | "+board[8]+" | "+board[9]+" ");
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char[] board = new char[10];
		TicTacToe obj = new TicTacToe();
		board = obj.createBoard();
		char userLetter = obj.chooseInput(sc);
		char compLetter = (userLetter=='X')?'O':'X';
		obj.showBoard(board);
	}
}
