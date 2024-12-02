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

		// variable para almacenar la funcion
		int funcion1;
		int funcion2;
		int funcion3;

		int funcionFinal = 0;

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

			funcion1 = ganarV(tabla);
			funcion2 = ganarH(tabla);
			funcion3 = ganarD(tabla);

			if (funcion1 != 0) {
				funcionFinal = funcion1;
			} else if (funcion2 != 0) {
				funcionFinal = funcion2;
			} else if (funcion3 != 0) {
				funcionFinal = funcion3;
			}

			// increment
			j++;

			if (funcionFinal != 0) {
				System.out.println("The player " + funcionFinal + " wins!");
				win = true;
			} else if (funcionFinal == 0) {
				System.out.println("No one wins!");
				empty = true;
			}

		}

		// cerrar scanner
		reader.close();

	}

	static int ganarV(char tabla[][]) {

		// variable to store who wins in vertical
		boolean winV1 = false;
		boolean winV2 = false;

		int ganador = 0;

		// contador que llevará el número de aciertos
		int cont1 = 0;
		int cont2 = 0;

		// recorre la tabla
		for (int i = 0; i < tabla.length; i++) {
			// recorre las columnas
			for (int j = 0; j < tabla.length; j++) {
				// si la celda de la columna es igual a X
				if (tabla[j][i] == 'X') {
					cont1++;

					// si el contador es 3 entonces ha ganado
					if (cont1 == 3) {
						winV1 = true;
					}
				} else if (tabla[j][i] == 'O') {
					cont2++;

					if (cont2 == 3) {
						winV2 = true;
					}
				}
			}
			cont1 = 0;
			cont2 = 0;
		}

		// decidir el ganador
		if (winV1 == true) {
			ganador = 1;
		} else if (winV2 == true) {
			ganador = 2;
		}

		return ganador;
	}

	static int ganarH(char tabla[][]) {

		// variable to store who wins in vertical
		boolean winV1 = false;
		boolean winV2 = false;

		int ganador = 0;

		// contador que llevará el número de aciertos
		int cont1 = 0;
		int cont2 = 0;

		// recorre la tabla
		for (int i = 0; i < tabla.length; i++) {
			// recorre las columnas
			for (int j = 0; j < tabla.length; j++) {
				// si la celda de la columna es igual a X
				if (tabla[i][j] == 'X') {
					
					cont1++;

					// si el contador es 3 entonces ha ganado
					if (cont1 == 3) {
						winV1 = true;
					}
				} else if (tabla[i][j] == 'O') {
					
					cont2++;

					if (cont2 == 3) {
						winV2 = true;
					}
				}
			}
			cont1 = 0;
			cont2 = 0;
		}

		// decidir el ganador
		if (winV1 == true) {
			ganador = 1;
		} else if (winV2 == true) {
			ganador = 2;
		}

		return ganador;
	}

	static int ganarD(char tabla[][]) {

		// variable to store who wins in vertical
		boolean winV1 = false;
		boolean winV2 = false;

		int ganador = 0;

		// contador que llevará el número de aciertos
		int cont1 = 0;
		int cont2 = 0;

		// recorre la tabla
		for (int i = 0; i < tabla.length; i++) {
			// si la celda de la columna es igual a X
			if (tabla[i][i] == 'X') {
				cont1++;

				// si el contador es 3 entonces ha ganado
				if (cont1 == 3) {
					winV1 = true;
				}
			} else if (tabla[i][i] == 'O') {
				cont2++;

				if (cont2 == 3) {
					winV2 = true;
				}
			}
		}

		cont1 = 0;
		cont2 = 0;

		// recorre la tabla
		for (int i = tabla.length; i < 0; i--) {
			// si la celda de la columna es igual a X
			if (tabla[i][i] == 'X') {
				cont1++;

				// si el contador es 3 entonces ha ganado
				if (cont1 == 3) {
					winV1 = true;
				}
			} else if (tabla[i][i] == 'O') {
				cont2++;

				if (cont2 == 3) {
					winV2 = true;
				}
			}
		}

		// decidir el ganador
		if (winV1 == true) {
			ganador = 1;
		} else if (winV2 == true) {
			ganador = 2;
		}

		return ganador;
	}

}
