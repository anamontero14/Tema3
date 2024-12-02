package juegosbidimensionales;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		/*
		 * The size of the panel will be 3x3. There are two players who will play by
		 * turns. The first player to get 3 of his/her marks in a row (up, down, across,
		 * or diagonally) is the winner. When all 9 squares are full, the game is over.
		 * If no player has 3 marks in a row, the game ends in a tie.
		 */

		// creación del Scanner
		Scanner reader = new Scanner(System.in);

		// variable para almacenar la respuesta del usuario
		char respuesta;

		// variable to store the asnwer of the 2 players
		char player1;
		char player2;

		// variable to store the rows
		int rows;

		// variable to store the columns
		int columns;

		// variable to check if the player wins
		boolean win = false;

		// variable to check if the 9 cells are not empty
		boolean empty = false;

		// to exit the do-while
		boolean error = true;

		// variable to store the character (X/O)
		char character = 'X';

		// to distinguish the players
		int j = 1;

		// tamaño del panel
		char tabla[][] = new char[3][3];

		// relleno el tablero
		for (int i = 0; i < tabla.length; i++) {
			Arrays.fill(tabla[i], '-');
		}

		System.out.println();

		// muestro la tabla
		for (char fila[] : tabla) {
			for (char colum : fila) {
				System.out.print(" " + colum);
			}
			System.out.println();
		}

		System.out.println();

		// loop to ask the players
		while (!win || !empty) {

			// we will increase the variable and if the variable is 3 then it will restart
			// (because we only have 2 players)
			if (j == 3) {
				j = 1;
			}

			// do-while to ask the players
			do {

				if (j == 1) {
					character = 'X';
				} else if (j == 2) {
					character = 'O';
				}
				;

				try {

					System.out.println("Turn of player " + j);
					System.out.print("Where do you want to place the '" + character + "'? (R/C): ");

					// store the answer
					rows = reader.nextInt();
					columns = reader.nextInt();

					assert rows < 3 && rows >= 0 : "You have to choose a valid number of rows";
					assert columns < 3 && columns >= 0 : "You have to choose a valid number of rows";

					// to check that the combination of rows and columns is empty
					if (tabla[rows][columns] == '-') {
						tabla[rows][columns] = character;
						error = false;
					} else {
						System.err.println("This position is already taken.");
						error = true;
					}

				} catch (InputMismatchException e) {
					System.err.println("You have to insert a valid value.");
					error = true;
				} catch (AssertionError a) {
					System.err.println(a.getMessage());
					error = true;
				} finally {
					reader.nextLine();
				}

			} while (error);

			// muestro la tabla
			for (char fila[] : tabla) {
				for (char colum : fila) {
					System.out.print(" " + colum);

					

				}
				System.out.println();
			}

			// increment
			j++;

		}

		// cerrar scanner
		reader.close();

	}
	
	static boolean ganarV(char tabla[][]) {
		
		//variable to store who wins in vertical
		boolean winV = false;
		
		//for (int i = 0; )
		
		return winV;
	}
	
}
