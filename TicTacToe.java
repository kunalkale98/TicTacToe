import java.util.Scanner;

class TicTacToe{

	public char[] createBoard(){
		char[] board = new char[10];
		for(int i=0; i<=9; i++){
			board[i] = ' ';
		}
		return board;
	}

	public char ChooseInput(Scanner sc){
		System.out.print("Choose Your Letter X or O: ");
		char userLetter = sc.next().toUpperCase().charAt(0);
		return userLetter;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		TicTacToe obj = new TicTacToe();
		obj.createBoard();
		char userLetter = obj.ChooseInput(sc);
		char compLetter = (userLetter=='X')?'O':'X';
	}
}
