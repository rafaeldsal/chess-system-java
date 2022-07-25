package application;

import java.util.Locale;
import java.util.Scanner;

import boardgame.Board;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Board board = new Board(8, 8);
		
		scan.close();
	}

}
