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

	public void showBoard(char userLetter,char compLetter,char[] board){
		System.out.println(" "+board[1]+" | "+board[2]+" | "+board[3]+" ");
		System.out.println("-----------");
		System.out.println(" "+board[4]+" | "+board[5]+" | "+board[6]+" ");
		System.out.println("-----------");
		System.out.println(" "+board[7]+" | "+board[8]+" | "+board[9]+" ");
	}

	public int userMove(Scanner sc, char[] board){
		System.out.println("Enter the Position:");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				if(board[1] == ' '){
					return 1;
				}
				else{
					System.out.println("Place is not empty");
				}
		case 2:
				if(board[2] == ' '){
					return 2;
				}
				else{
					System.out.println("Place is not empty");
				}
		case 3:
            if(board[3] == ' '){
               return 3;
            }
            else{
               System.out.println("Place is not empty");
				}
		 case 4:
            if(board[4] == ' '){
               return 4;
            }
            else{
               System.out.println("Place is not empty");
            }
		 case 5:
            if(board[5] == ' '){
               return 5;
            }
            else{
               System.out.println("Place is not empty");
            }
		 case 6:
            if(board[6] == ' '){
               return 6;
            }
            else{
               System.out.println("Place is not empty");
            }
		 case 7:
            if(board[7] == ' '){
               return 7;
            }
            else{
               System.out.println("Place is not empty");
            }
		 case 8:
            if(board[8] == ' '){
               return 8;
            }
            else{
               System.out.println("Place is not empty");
            }
		 case 9:
            if(board[9] == ' '){
               return 9;
            }
            else{
               System.out.println("Place is not empty");
            }
		default:
			System.out.println("Enter posititon between 1-9");
			return userMove(sc,board);
		}
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		char[] board = new char[10];
		TicTacToe obj = new TicTacToe();
		board = obj.createBoard();
		char userLetter = obj.chooseInput(sc);
		char compLetter = (userLetter=='X')?'O':'X';
		int pos = obj.userMove(sc,board);
		System.out.println("User selected position "+pos);
		obj.showBoard(userLetter,compLetter,board);
	}
}
