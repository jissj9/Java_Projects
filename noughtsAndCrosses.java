
import java.util.Scanner;

public class noughtsAndCrosses {
	public static final char CROSS = 'X';
	public static final char NOUGHT = 'O';
	public static final char EMPTY= ' ';

	public static void clearBoard(char[][] gameBoard)
	{	
		for(int row = 0; row<gameBoard.length; row++)
			for (int column = 0; (column < gameBoard[row].length); column++)
				gameBoard[row][column] = EMPTY;
	}


	public static boolean canMakeMove(char gameBoard[][],int row,int column)
	{	
		if(gameBoard[row][column] == EMPTY)
			return true;
		else
			return false;
	}


	public static void printBoard(char[][]gameBoard)
	{	
		for (int row = 0; row < gameBoard.length; row++)
		{	
			for (int column = 0; column < gameBoard[row].length; column++) 
			{
				if (column == gameBoard[row].length - 1) 
					System.out.print(gameBoard[row][column]);
				else
					System.out.print( gameBoard[row][column] + " | ");
			}
			System.out.println();
		}
	}


	public static void makeMove(char gameBoard[][],char currentPlayer,int row,int column)
	{
		gameBoard[row][column] = currentPlayer;
	}

	public static boolean isBoardFull(char[][] gameBoard)
	{	
		int numberOfSpaces = 0;
		int row,column;
		for(row = 0; row<gameBoard.length;row++)
			for(column = 0; column<gameBoard[row].length;column++)
				if(gameBoard[row][column] == EMPTY) {
					numberOfSpaces++;
				}
		if(numberOfSpaces==0)return false;
		else return true;
	}

	public static char winner(char[][]gameBoard)
	{	
		char winner = 'N';
		for(int i=0;i<gameBoard.length;i++)
		{	
			if((gameBoard[i][0]== gameBoard[i][2]&&gameBoard[i][0]==gameBoard[i][1]&&gameBoard[i][1]!=EMPTY)) 
				winner = gameBoard[i][0];

			else if  (gameBoard[0][i]== gameBoard[2][i]&&gameBoard[0][i]==gameBoard[1][i]&&gameBoard[0][i]!=EMPTY) 
				winner = gameBoard[0][i];

			else if (gameBoard[0][2]!= ' ' &&gameBoard[0][2]==gameBoard[1][1]&&gameBoard[1][1]==gameBoard[2][0]) 
				winner = gameBoard[1][1];

			else if ((gameBoard[0][0]== gameBoard[1][1]&&gameBoard[0][0]==gameBoard[2][2]&&gameBoard[1][1]!=EMPTY)) 
				winner = gameBoard[1][1];

			System.out.println("...");

		}
		return winner;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		char playerPiece,winnerPiece='N';
		int row,column;
		boolean end = false;
		char[][] gameBoard = new char[3][3];
		System.out.println("THE TIC TAC TOE GAME : ");
		clearBoard(gameBoard);
		printBoard(gameBoard);
		do
		{	
			if(isBoardFull(gameBoard))
				end = true;
			printBoard(gameBoard);
			System.out.println("ENTER PLAYER PIECE (X / O) ");
			playerPiece = input.next().charAt(0);
			System.out.println("MAKE A MOVE BY ENTERING POSITION (ROW - COLUMN) ");
			System.out.println("ENTER ROW NUMBER - (0 / 1 / 2) ");
			row = input.nextInt();
			System.out.println("ENTER COLUMN NUMBER - (0 / 1 / 2) ");
			column = input.nextInt();
			if(row >=3 || row<0 || column >=3 || column<0 )
				System.out.println("ERROR,PLEASE ENTER COLUMN AND ROW BETWEEN 0 AND 2 ");
			else {
				if(canMakeMove(gameBoard,row,column))
					makeMove(gameBoard,playerPiece,row,column);
				else
					System.out.println("POSITION FULL, CANNOT MAKE MOVE. ");

				if(winner(gameBoard)==CROSS||winner(gameBoard) == NOUGHT)
					end = true;	
			}
		}while(isBoardFull(gameBoard) || !end);
		printBoard(gameBoard);
		winnerPiece = winner(gameBoard);
		if(winnerPiece == CROSS || winnerPiece == NOUGHT)
		{
			System.out.print("The winner is : " + winnerPiece);
		}
		else 
		{
			System.out.print("Match is a draw. ");
		}
	}
}

