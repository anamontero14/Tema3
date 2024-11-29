package juegosbidimensionales;

import java.util.Arrays;
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
		Scanner leer = new Scanner(System.in);

		// variable para almacenar la respuesta del usuario
		char respuesta;

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
		
		

		// cerrar scanner
		leer.close();

	}
}
