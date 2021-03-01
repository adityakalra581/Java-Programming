package tictactoe;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
	
	public static void main(String[] args) {
		char[][] gameBoard = {{' ', '|', ' ', '|',' '},
				{'-', '+', '-', '+','-'},
				{' ', '|', ' ', '|',' '},
				{'-', '+', '-', '+','-'},
				{' ', '|', ' ', '|', ' '}};
		
		
		System.out.println("Welcome to the Game!");
		System.out.println();
		printGameBoard(gameBoard);
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Choose your weapon(X or o):");
		char p = scan.next().charAt(0);
		System.out.println("Your weapon is: "+p);
		System.out.println("Let the game begin!!!");
		
		// giving cpu it's value:('o' 0r 'X')
		char c = 'X';
		if (p == 'X') {
			c = 'o';
		}else if (p == 'o') {
			c = 'X';
		}
		
		while (true) {
		
			System.out.println("Enter your position(1-9):");
			int pos = scan.nextInt();
			System.out.println(pos);
			
	
			placePiece(gameBoard, pos, p);
			System.out.println("You chose position: "+pos);
			System.out.println();
			
			printGameBoard(gameBoard);
			
			Random rand = new Random();
			int cpuPos = rand.nextInt(9) + 1;
			System.out.println("CPU chooses position:"+cpuPos);
			
			//calling placePiece for cpu:
			placePiece(gameBoard, cpuPos,c);
			printGameBoard(gameBoard);
		
		
		}
	}

public static void printGameBoard(char[][] gameBoard) {
	for (char[] row : gameBoard) {
		for (char c: row) {
			System.out.print(c);
		}
		System.out.println();
	}
	
}
public static void placePiece(char[][] gameBoard,int pos,char p) {
	//Placing the value on the board:
	switch(pos) {
		case 1:
			gameBoard[0][0] = p;
			break;
		case 2:
			gameBoard[0][2] = p;
			break;
		case 3:
			gameBoard[0][4] = p;
			break;
		case 4:
			gameBoard[2][0] = p;
			break;
		case 5:
			gameBoard[2][2] = p;
			break;
		case 6:
			gameBoard[2][4] = p;
			break;
		case 7:
			gameBoard[4][0] = p;
			break;
		case 8:
			gameBoard[4][2] = p;
			break;
		case 9:
			gameBoard[4][4] = p;
			break;
		default:
			System.out.println("Invalid Position ------------------------");
			break;
	}
	
}


}




