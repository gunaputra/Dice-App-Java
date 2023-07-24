package Latihan3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Board Setup
		char[][] board = new char [3][3];
		for (int row = 0; row < board.length; row++){
			for (int col = 0; col < board[row].length; col++){
				board[row][col]= ' ';
			}
		}
		
		//X0-X0
		char player = 'X';
		boolean gameOver = false;
		Scanner scanner = new Scanner(System.in);
		
		//Loop
		while(!gameOver){
			printBoard(board);
			System.out.print("Player " + player + " enter: ");
			int row = scanner.nextInt();
			int col = scanner.nextInt();
			System.out.println();
			
			//CoordinateFunstions
			if (board[row][col] == ' '){	
				board[row][col] = player; //Placing Elements
				gameOver = haveWon(board, player);
				if(gameOver) {
					System.out.println("Player " + player + "has won: ");
				} else {
					//long way
//					if(player == 'X') {
//					 player == 'O';
//					} else {
//						player = 'X'
//					}
				player = (player == 'X') ? 'O' : 'X'; //short way
				}
			} else {
				System.out.println("Invalid move! Please try again!");
			}	
		}
		printBoard(board);
	}
	
	public static boolean haveWon(char[][] board, char player){
		//check the rows
		for (int row = 0; row < board.length; row++){
			if(board[row][0] == player && board[row][1] == player && board[row][2] == player){
				return true;
			}
		}
		//check for column
		for (int col = 0; col < board[0].length; col++){
			if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
				return true;
			}
		}
		
		//diagonal conditions
		if(board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		}
		if(board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		}
		return false;
	}
	
	public static void printBoard(char[][] board) {
		// TODO Auto-generated method stub
		for (int row = 0; row < board.length; row++){
		for (int col = 0; col < board[row].length; col++) {
				System.out.print(board[row][col] + " | ");
			}
			System.out.println();
			}
		}
	}

//source link: https://www.youtube.com/watch?v=jlLNXmi4Nmw
