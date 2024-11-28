package boletin5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer04 {

	public static void main(String[] args) {

		/*
		 * Vamos a realizar varias operaciones básicas de ajedrez, concretamente las de
		 * las piezas Torre, Alfil, Dama y Caballo. Crea una función distinta para cada
		 * pieza. Todas las funciones van a recibir los mismos parámetros de entrada:
		 * posFila, posColumna y pieza. La pieza será de tipo char y podrá ser T de
		 * Torre, A de Alfil, D de Dama y C de Caballo. La función devolverá una tabla
		 * (que representa al tablero) marcando con una X aquellas casillas donde se
		 * puede mover dicha pieza. La posición inicial de la pieza se marcará con su
		 * letra correspondiente. Todo tablero de ajedrez tiene una dimensión de 8x8.
		 */

		// creo el scanner
		Scanner leer = new Scanner(System.in);

		// variable para almacenar la posición de la fila
		int posFila = 0;

		// variable para almacenar la posición de la columna
		int posColumna = 0;

		// variable para almacenar LA PIEZA
		char pieza = 0;

		// variable para almacenar la función
		char funcion[][];

		// le pregunto al usuario la pieza de la que quiere saber sus movimientos
		System.out.print("¿De qué pieza desea saber los movimientos?: ");
		// almaceno la respuesta
		pieza = leer.next().charAt(0);

		// le pregunto en qué posición está (fila)
		System.out.print("¿En qué fila está?: ");
		// almaceno la respuesta
		posFila = leer.nextInt();

		// le pregunto en qué posición está (columna)
		System.out.print("¿En qué columna está?: ");
		// almaceno la respuesta
		posColumna = leer.nextInt();

		// hago un switch para saber qué función ejecutar
		funcion = switch (pieza) {

		// si en pieza se escribe T entonces iguala funcion a x y viceversa
		case 'T', 't' -> {
			yield movimientosTorre(posFila, posColumna, pieza);
		}
		case 'A', 'a' -> {
			yield movimientosAlfil(posFila, posColumna, pieza);
		}
		case 'D', 'd' -> {
			yield movimientosDama(posFila, posColumna, pieza);
		}
		case 'C', 'c' -> {
			yield movimientosTorre(posFila, posColumna, pieza);
		}

		// si no es nada
		default -> {
			System.out.println("No ha introducido un valor válido");
			yield null;
		}

		};

		// muestro el tablero por pantalla
		for (char fila[] : funcion) {
			for (char colum : fila) {
				System.out.print(colum);
			}
			System.out.println();
		}

	}

	static char[][] movimientosTorre(int posFila, int posColumna, char pieza) {

		// tabla a devolver
		char movimientos[][] = new char[8][8];

		// relleno el tablero
		for (int i = 0; i < movimientos.length; i++) {
			Arrays.fill(movimientos[i], '-');
		}

		// en la celda especificada añado la letra de la pieza
		movimientos[posFila][posColumna] = pieza;

		// quiero hacer un for que empiece en la fila 0 y en la posición designada
		for (int i = 0; i < movimientos.length; i++) {
			for (int j = posColumna; j <= posColumna; j++) {

				// si la posición es la misma que la de la letra entonces no lo añade
				if (movimientos[i][j] != movimientos[posFila][posColumna]) {
					movimientos[i][j] = '*';
				}
			}
		}

		// es exactamente igual que el otro solo que con la fila
		for (int i = posFila; i <= posFila; i++) {
			for (int j = 0; j < movimientos[0].length; j++) {

				// si la posición es la misma que la de la letra entonces no lo añade
				if (movimientos[i][j] != movimientos[posFila][posColumna]) {
					movimientos[i][j] = '*';
				}
			}
		}

		return movimientos;

	}

	static char[][] movimientosAlfil(int posFila, int posColumna, char pieza) {

		// tabla a devolver
		char movimientos[][] = new char[8][8];

		// relleno el tablero
		for (int i = 0; i < movimientos.length; i++) {
			Arrays.fill(movimientos[i], '-');
		}

		// en la celda especificada añado la letra de la pieza
		movimientos[posFila][posColumna] = pieza;

		// Diagonal superior derecha
		for (int i = 1; posFila - i >= 0 && posColumna + i < 8; i++) {
			movimientos[posFila - i][posColumna + i] = '*';
		}

		// Diagonal superior izquierda
		for (int i = 1; posFila - i >= 0 && posColumna - i >= 0; i++) {
			movimientos[posFila - i][posColumna - i] = '*';
		}

		// Diagonal inferior derecha
		for (int i = 1; posFila + i < 8 && posColumna + i < 8; i++) {
			movimientos[posFila + i][posColumna + i] = '*';
		}

		// Diagonal inferior izquierda
		for (int i = 1; posFila + i < 8 && posColumna - i >= 0; i++) {
			movimientos[posFila + i][posColumna - i] = '*';
		}

		return movimientos;

	}

	static char[][] movimientosDama(int posFila, int posColumna, char pieza) {

		// tabla a devolver
		char movimientos[][] = new char[8][8];

		// relleno el tablero
		for (int i = 0; i < movimientos.length; i++) {
			Arrays.fill(movimientos[i], '-');
		}

		// en la celda especificada añado la letra de la pieza
		movimientos[posFila][posColumna] = pieza;

		// Diagonal superior derecha
		for (int i = 1; posFila - i >= 0 && posColumna + i < 8; i++) {
			movimientos[posFila - i][posColumna + i] = '*';
		}

		// Diagonal superior izquierda
		for (int i = 1; posFila - i >= 0 && posColumna - i >= 0; i++) {
			movimientos[posFila - i][posColumna - i] = '*';
		}

		// Diagonal inferior derecha
		for (int i = 1; posFila + i < 8 && posColumna + i < 8; i++) {
			movimientos[posFila + i][posColumna + i] = '*';
		}

		// Diagonal inferior izquierda
		for (int i = 1; posFila + i < 8 && posColumna - i >= 0; i++) {
			movimientos[posFila + i][posColumna - i] = '*';
		}

		// quiero hacer un for que empiece en la fila 0 y en la posición designada
		for (int i = 0; i < movimientos.length; i++) {
			for (int j = posColumna; j <= posColumna; j++) {

				// si la posición es la misma que la de la letra entonces no lo añade
				if (movimientos[i][j] != movimientos[posFila][posColumna]) {
					movimientos[i][j] = '*';
				}
			}
		}

		// es exactamente igual que el otro solo que con la fila
		for (int i = posFila; i <= posFila; i++) {
			for (int j = 0; j < movimientos[0].length; j++) {

				// si la posición es la misma que la de la letra entonces no lo añade
				if (movimientos[i][j] != movimientos[posFila][posColumna]) {
					movimientos[i][j] = '*';
				}
			}
		}

		return movimientos;

	}

	static char[][] movimientosCaballo(int posFila, int posColumna, char pieza) {

		// tabla a devolver
		char movimientos[][] = new char[8][8];

		return movimientos;

	}

}
